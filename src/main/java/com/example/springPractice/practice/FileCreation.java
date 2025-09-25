package com.example.springPractice.practice;

import java.io.*;

public class FileCreation {
    public static void main(String[] args) throws IOException {
        File file = new File("example.txt");
        if (file.createNewFile()) {
            System.out.println("File created: " + file.getName());
        } else {
            System.out.println("File already exists.");
        }

        FileWriter writer = new FileWriter("example.txt");
        writer.write("1, Arun, 22, CS\n");
        writer.write("2, vignesh, 21, IT\n");
        writer.write("3, kumar, 23, ME\n");
        writer.close();

        BufferedReader reader = new BufferedReader(new FileReader("example.txt"));
        String name=  null;
        while((name =  reader.readLine()) != null){
            System.out.println(name);
        }
        reader.close();


    }
}
