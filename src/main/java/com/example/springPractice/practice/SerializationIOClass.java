package com.example.springPractice.practice;

import java.io.*;

public class SerializationIOClass  {
    public static void main(String[] args) {
        Student stu1 = new Student("arun",30,400);
        Student stu2 = new Student("abdul",27,500);

        try {
            
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("students.ser"));
            oos.writeObject(stu1);
            oos.writeObject(stu2);

            oos.close();
            System.out.println("Student objects serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("students.ser"));
            Student stu3 =  (Student) ois.readObject();
            Student stu4 =  (Student) ois.readObject();
            ois.close();
            System.out.println("Deserialized Students:");
            System.out.println(stu3);
            System.out.println(stu4);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }









}
