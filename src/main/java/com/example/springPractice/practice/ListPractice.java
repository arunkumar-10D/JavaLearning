package com.example.springPractice.practice;

import java.util.*;

public class ListPractice {

    public static void main(String[] args) {

        HashMap<Integer, Student> srudentList = new HashMap<>();
        srudentList.put(101, new Student("arun",30,400));
        srudentList.put(102, new Student("kumar",27,800));
        srudentList.put(105, new Student("vignesh",25,1000));

        for(Map.Entry<Integer, Student> stu : srudentList.entrySet()){
            System.out.println("id " +stu.getKey() +" name is "+stu.getValue());
        }

        HashSet<Student> uniqueStudents = new HashSet<>(srudentList.values());

        for (Student s : uniqueStudents) {
            System.out.println(s);
        }

        List<String> students = Arrays.asList(
                "Arun", "kumar", "Kumar", "arun", "vignesh", "abdul", "suba","Arun"
        );

        HashSet<String> uniquStudents = new HashSet<>(students);

        for (String a : uniquStudents) {
            System.out.println(a);
        }


    }

}
