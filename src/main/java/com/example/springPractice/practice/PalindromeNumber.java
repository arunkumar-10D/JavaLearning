package com.example.springPractice.practice;

public class PalindromeNumber {
    static boolean isPalindrome(int num) {
        int original = num;
        int reversed = 0;

        while (num > 0) {
            int digit = num % 10;         // extract last digit
            reversed = reversed * 10 + digit; // build reversed number
            num = num / 10;               // remove last digit
        }

        return original == reversed;  // check palindrome
    }

    public static void main(String[] args) {
        int n1 = 121;
        int n2 = 123;

        System.out.println(n1 + " is palindrome? " + isPalindrome(n1));
        System.out.println(n2 + " is palindrome? " + isPalindrome(n2));
    }
}
