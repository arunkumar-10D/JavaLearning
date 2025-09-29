package com.example.springPractice.practice;

public class Landas {
    public static void main(String[] args) {
        Calculator calc = (a, b) -> a + b;
        System.out.println("Sum of calculator " + calc.add(5, 3));
        calc.printInfo();
        Calculator.greet();
    }
}
