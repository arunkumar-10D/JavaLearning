package com.example.springPractice.practice;

@FunctionalInterface
public interface Calculator {
    int add(int a, int b);
    default void printInfo() {
        System.out.println("This is a calculator.");
    }
    static void greet() {
        System.out.println("Hello from Calculator!");
    }
}
