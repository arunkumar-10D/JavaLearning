package com.example.springPractice.practice;

import java.util.*;
import java.util.stream.Collectors;

public class StreamApi {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("arun","kumar","vignesh","abdul","arun");
        names.forEach(name -> System.out.println(name));
        System.out.println("============");
        //list all from the list
        names.stream()
                .forEach(System.out::println);
        //list all from the list
        System.out.println("============");
        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
        System.out.println("============");
        //list filter form the list
        names.stream()
                .filter(name -> name.startsWith("a"))
                .forEach(System.out::println);
        System.out.println("============");//sorted
        names.stream()
                .distinct()
                .sorted()
                .forEach(System.out::println);
        System.out.println("============");
        long count = names.stream().count();
        System.out.println("Total names: " + count);
        System.out.println("============");
        List<String> upperCaseNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(upperCaseNames);
        System.out.println("============");
        Set<String> nameSet = names.stream()
                .filter(n -> n.startsWith("a"))
                .collect(Collectors.toSet());
        System.out.println(nameSet);
        System.out.println("============");
        String joinedNames = names.stream()
                .collect(Collectors.joining(" -> "));
        System.out.println(joinedNames);


        //MAP
        Map<String, Integer> map = new HashMap<>();
        map.put("Arun", 30);
        map.put("Vignesh", 25);
        map.put("Abdul", 28);

        System.out.println("Keys==========");
        map.keySet().stream()
                .forEach(System.out::println);

        System.out.println("Values=============");
        map.values().stream()
                .forEach(System.out::println);

        System.out.println("Entries==============");
        map.entrySet().stream()
                .forEach(entry -> System.out.println(entry.getKey() + " => " + entry.getValue()));

        List<String> entryStrings = map.entrySet().stream()
                .map(e -> e.getKey() + " is " + e.getValue() + " years old")
                .collect(Collectors.toList());

        entryStrings.forEach(System.out::println);
        System.out.println("Entries==============");

        map.forEach((k,v) -> System.out.println(k));
    }
}
