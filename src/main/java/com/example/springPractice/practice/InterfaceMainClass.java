package com.example.springPractice.practice;

public class InterfaceMainClass {
    public static void main(String[] args) {
        Playable abc = new Guitar();
        abc.instrument();
        abc.condition("old");
        abc.shape("Guitar");
        Playable.price(50.0);

        Playable abcd = new Piano();
        abcd.instrument();
        abcd.condition("new");
        abcd.shape("Piano");
        Playable.price(500.0);
        Playable.price(100.0);
    }
}
