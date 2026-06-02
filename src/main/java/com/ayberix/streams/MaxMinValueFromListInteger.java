package com.ayberix.streams;

import java.util.Comparator;
import java.util.List;

/**
 * write a program to find the maximum value from a list of integers using Java Streams.
 * Input: List of integers [3, 5, 7, 2, 8, 6]
 * Output: Maximum value is 8
 */
public class MaxMinValueFromListInteger {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(3, 5, 7, 2, 8, 6, 10, 15, 20, 25, 30, 35, 40, 45, 50, -1);
        // Using Streams to find the maximum value
        //1st Approach
        int maxValue = numbers.stream()
                .max(Integer::compareTo)
                .orElseThrow(() -> new IllegalArgumentException("List is empty"));
        System.out.println("Maximum value is " + maxValue);

        //2nd Approach
        Integer maxValueFromlist = numbers.stream().max((o1, o2) -> o1.compareTo(o2)).orElseThrow(() -> new IllegalArgumentException("List is empty"));
        System.out.println("maxValueFromlist : " + maxValueFromlist);

        //3rd Approach
        Integer maxNumber = numbers.stream().max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("imaxNumber : " + maxNumber);

        Integer minimumNumber = numbers.stream().min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("minimumNumber : " + minimumNumber);

        //get Minimum Value
        numbers.stream().min(Integer::compareTo).ifPresent(min -> System.out.println("Minimum value is " + min));
    }
}
