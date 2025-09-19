package com.example.springPractice.practice;

public class TryCatchException {

    public static void checkAge(int age) throws InvalidAgeException {
        if(age < 18){
            throw new InvalidAgeException("Age must be 18 or older");
        }
        else{
            System.out.println("Access granted");
        }

    }
    public static void main(String[] args) {
        int numerator = 50;
        int denominator = 0;

        try {
            int c= numerator/denominator;

        } catch(ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } finally {
            System.out.println("Program completed");
        }

        try{
            checkAge(16);
//             checkAge(21);
        }catch(InvalidAgeException e){
            System.out.println("Exception caught:"+ e.getMessage());
        }
    }
}

class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}
