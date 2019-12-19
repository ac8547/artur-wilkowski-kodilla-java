package com.kodilla.testing.shape;


import java.util.ArrayList;
import java.util.Objects;

interface Shape {

    String getShapeName();
    int getField();
}


class triangle implements Shape{

    public String getShapeName(){
        return "triangle";
    }

    @Override
    public int getField() {
        return 0;
    }

    public int getField(int a, int h){
        return (a * h)/2;
    }
}

class square implements Shape{

    public String getShapeName(){
        return "square";
    }

    @Override
    public int getField() {
        return 0;
    }

    public int getField(int a) {
        return a^2;
    }

}

class circle implements Shape{

    public String getShapeName(){
        return "circle";
    }

    @Override
    public int getField() {
        return 0;
    }

    public int getField(int r){
        return (int) (3.14) * r^2;
    }
}

class ShapeCollector{

    Shape shape;
    private ArrayList<String> figure = new ArrayList<String>();

    //public ShapeCollector(Shape shape) {
    //    this.shape = shape;
    //}

    public Shape getShape() {
        return shape;
    }

    @Override
    public String toString() {
        return "ShapeCollector{" +
                "shape=" + shape +
                '}';
    }

    public void addFigure(Shape shape){
        //shape.getShapeName();

        figure.add(shape.getShapeName());

    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        this.shape.getShapeName();
        if (figure.contains(shape.getShapeName())) {
            figure.remove(shape.getShapeName());
            result = true;
        }
        return result;
    }

    public String getFigure(int n){
        String theFigure = null;
        if (n >= 0 && n <= figure.size()){
            theFigure = figure.get(n);
        }
        return theFigure;
    }

    public String showFigures(){
        String allFiguresDescription="";
        for (String lista : this.figure){
            allFiguresDescription+= lista + " ";
            System.out.println(lista);

        }
        return allFiguresDescription;

    }


    public int getListQuantity(){
        return figure.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ShapeCollector)) return false;
        ShapeCollector that = (ShapeCollector) o;
        return shape.equals(that.shape) &&
                figure.equals(that.figure);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shape, figure);
    }
}