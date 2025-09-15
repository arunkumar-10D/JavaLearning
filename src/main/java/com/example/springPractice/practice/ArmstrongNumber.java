package com.example.springPractice.practice;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ArmstrongNumber {

    static boolean isPalindrome(int num) {
        int original = num;
        int reversed = 0;

        while (num > 0) {
            int digit = num % 10;         // extract last digit
            reversed = reversed + (digit * digit * digit); // build reversed number
            num = num / 10;               // remove last digit
        }

        return original == reversed;  // check palindrome
    }

    public static void main(String[] args) {
        int n1 = 153;
        int n2 = 123;

        System.out.println(n1 + " is armstrong? " + isPalindrome(n1));
        System.out.println(n2 + " is armstrong? " + isPalindrome(n2));

//        Fibbonic series
        int n = 10;
        int first = 0;
        int second = 1;
        int temp =0;
        for (int i=0;i<=n;i++){
            System.out.print(first+" ");
            temp = first + second;
            first = second;
            second = temp;
        }

//        Duplicates
        String str = "record";
        char[] chars = str.toCharArray();

        System.out.print("Duplicates: ");
        for (int i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    System.out.print(chars[j] + " ");
                    break;
                }
            }
        }
        String strr = "programming";
        String result = "";

        for (int i = 0; i < strr.length(); i++) {
            char c = strr.charAt(i);
            boolean duplicate = false;

            for (int j = 0; j < result.length(); j++) {
                if (c == result.charAt(j)) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                result += c;
            }
        }

        System.out.println("String without duplicates: " + result);

        String newName = "arunkumar";
        StringBuilder seen = new StringBuilder();
        HashSet<Character> abc = new HashSet <>();

        for(int i=0;i<newName.length();i++){
            char a= newName.charAt(i);
            if(!abc.contains(a)){
                abc.add(a);
                seen.append(a);
            }
        }

        System.out.println("duplicates: =one" + seen.toString());

        List<String> lst = Arrays.asList("arun","kumar");
        List<String> lstOne = lst.stream().map(i -> i.toUpperCase()).collect(Collectors.toList());
        System.out.println(lstOne);

        String[] name = {"a","b","a"};
        int [] exp = {2,4,1};
        Map<String, Integer> abcd = new HashMap<>();
        for(int i=0;i<name.length;i ++){
            abcd.put(name[i], exp[i]);
        }
        for (Map.Entry<String, Integer> entry : abcd.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
