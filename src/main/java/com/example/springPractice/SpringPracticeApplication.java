package com.example.springPractice;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.example.springPractice.practice.MethodeAndRecursion;
import com.example.springPractice.practice.Student;

public class SpringPracticeApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SpringPracticeApplication.class, args);
        System.out.println("Hello world");
        Student stu1 = new Student("arun",30,400);
        Student stu2 = new Student("abdul",27,500);
        Student stu3 = new Student("vignesh",25,800);
        Student stu4 = new Student();
        stu1.getStudentDetails();
        stu2.getStudentDetails();
        stu3.getStudentDetails();
        stu4.getStudentDetails("hary",40,9000);




	}

}
