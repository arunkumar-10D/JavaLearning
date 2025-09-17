package com.example.springPractice.practice;

public interface Playable {

    void instrument();
    abstract void condition(String condition);
    default void shape(String name){
        System.out.println("name of the instrument = "+name);
    }
    static void price(double priceTag){
        System.out.println("priceTag of the instrument = "+priceTag);
    }

}
