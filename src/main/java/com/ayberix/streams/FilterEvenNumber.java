package com.ayberix.streams;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class FilterEvenNumber {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> listNumber = List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println("Even Numbers:");
        // Using Streams to filter even numbers
        java.util.Arrays.stream(numbers)
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

        List<Integer> filterEvenNumberlist = listNumber.stream()
                .filter(n -> n % 2 == 0).toList();

        System.out.println("filterEvenNumberlist :: " +filterEvenNumberlist);

    }
}
