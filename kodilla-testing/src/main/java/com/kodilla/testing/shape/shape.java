package com.kodilla.testing.shape;


import java.util.ArrayList;
import java.util.Objects;

interface Shape {

    String getShapeName();
    double getField();
}

class circle implements Shape {
    double radius;

    String shapeName = "circle";
    double field = (radius * radius) * Math.PI;

    public circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String getShapeName() {//zwraca nazwe figury
        return shapeName;
    }

    @Override
    public double getField() {//zwraca obliczone pole figury
        return field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof circle)) return false;
        circle circle = (circle) o;
        return Double.compare(circle.radius, radius) == 0 &&
                Double.compare(circle.getField(), getField()) == 0 &&
                getShapeName().equals(circle.getShapeName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius, getShapeName(), getField());
    }
}

class square implements Shape {
    double side;

    String shapeName = "square";
    double field = side * side;

    public square(double side) {
        this.side = side;
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public double getField() {
        return field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof square)) return false;
        square square = (square) o;
        return Double.compare(square.side, side) == 0 &&
                Double.compare(square.getField(), getField()) == 0 &&
                getShapeName().equals(square.getShapeName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(side, getShapeName(), getField());
    }
}

class triangle implements Shape {

    double base;
    double height;

    String shapeName = "triangle";
    double field = (base * height) / 2;

    public triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public double getField() {
        return field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof triangle)) return false;
        triangle triangle = (triangle) o;
        return Double.compare(triangle.base, base) == 0 &&
                Double.compare(triangle.height, height) == 0 &&
                Double.compare(triangle.getField(), getField()) == 0 &&
                getShapeName().equals(triangle.getShapeName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(base, height, getShapeName(), getField());
    }
}

class ShapeCollector {

    private ArrayList<Shape> FigureCollection = new ArrayList<>();

    public ArrayList<Shape> getFiguresCollection() {
        return FigureCollection;
    }

    public void addFigure(Shape shape){
        FigureCollection.add(shape);
    }

    public boolean removeFigure(Shape shape){
        return FigureCollection.remove(shape);
    }

    public Shape getFigure(int n){
        if(n<FigureCollection.size() && n>=0){
            return FigureCollection.get(n);
        } else {
            return null;
        }
    }

    public void showFigures(){
        System.out.println(FigureCollection.toString());
    }

    @Override
    public String toString() {
        return "ShapeCollector{" +
                "FigureCollection=" + FigureCollection +
                '}';



    }
}