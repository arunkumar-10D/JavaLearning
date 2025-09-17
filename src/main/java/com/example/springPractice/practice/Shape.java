package com.example.springPractice.practice;

public abstract class Shape {

    abstract double shape();

    void show(String str){
        System.out.println("shape is = "+str);
    }
}

class Circle extends Shape{
    @Override
    double shape() {
        return Math.PI;
    }

}
class Rectangle extends Shape{
    private int height;
    private int width;

    public Rectangle(int height,int width){
        this.width = width;
        this.height = height;
    }

    @Override
    double shape() {
        return height * width;
    }

}






