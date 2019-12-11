package com.kodilla.testing.calculator;

class Kalkulator{

    public int add(int a, int b){
        return a + b;
    }

    public int subtract(int a, int b){
        return a-b;
    }

}

public class Calculator {
    public static void main(String[] args) {

        Kalkulator kalkulator = new Kalkulator();

        System.out.println("result of add: " + kalkulator.add(5, 5));
        System.out.println("result of subtract: " + kalkulator.add(10,5));

    }
}
