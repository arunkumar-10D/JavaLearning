package com.example.springPractice.practice;

import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private double mark;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public Student() {
        System.out.println("default constructor called");
    }

    public Student(String name, int age, double mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Double.compare(mark, student.mark) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, mark);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", mark=" + mark +
                '}';
    }

    public void getStudentDetails(){
        System.out.println("Student name "+name);
        System.out.println("Student age "+age);
        System.out.println("Student mark "+mark);
    }
    public void getStudentDetails(String name, int age, double mark){
        System.out.println("Student name "+name);
        System.out.println("Student age "+age);
        System.out.println("Student mark "+mark);
    }

}
