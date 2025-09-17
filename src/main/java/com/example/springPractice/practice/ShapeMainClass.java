package com.example.springPractice.practice;

public class ShapeMainClass {

    public static void main(String[] args) {
        System.out.println("hello world");
        Shape shape = new Circle();
        double area = shape.shape();
        shape.show("circle");
        System.out.println("shape area is = "+area);

        Shape shape1 = new Rectangle(5,5);
        double area1 = shape1.shape();
        shape.show("rectangle");
        System.out.println("shape area is = "+area1);

    }
}
