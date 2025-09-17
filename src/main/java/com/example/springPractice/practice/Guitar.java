package com.example.springPractice.practice;

public class Guitar implements Playable {
    @Override
    public void instrument() {
        System.out.println("name of the instrument is= Guitar");
    }

    @Override
    public void condition(String condition) {
        System.out.println("name of the instrument = "+condition);
    }

    @Override
    public void shape(String name) {
        System.out.println("name of the instrument = "+name);
    }
}


