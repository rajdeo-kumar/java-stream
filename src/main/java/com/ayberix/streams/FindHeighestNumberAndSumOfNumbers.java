package com.ayberix.streams;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FindHeighestNumberAndSumOfNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(50,70,55,80, 10, 20, 30, 4, 20,46,55);
        Optional<Integer> sum = numbers.stream().reduce((a, b) -> a + b); // Lambda expression and BinaryOperator

        Optional<Integer> sumListOfValue = numbers.stream().reduce(Integer::sum); // Method reference

        int sum1 = numbers.stream().mapToInt(Integer::intValue).sum();// Using mapToInt and sum method

        System.out.println("Sum: " + sum.get());
        System.out.println("Sum List of Value: " + sumListOfValue.orElse(0));
        System.out.println("Sum1: " + sum1);

        //method to find greater than 10 from the list of numbers

        findGreaterThanTen(numbers);
        findSecondHeighestNumberFromList(numbers);
        calculateAverage(numbers);
    }

    private static void calculateAverage(List<Integer> numbers) {
        double avgDouble = numbers.stream().mapToInt(Integer::intValue).average().getAsDouble();
        System.out.println("Average is: " + avgDouble);

    }

    private static void findSecondHeighestNumberFromList(List<Integer> numbers) {
        //1st approach
        numbers.stream().max(Integer::compareTo).ifPresent(max -> {
            System.out.println("Max number is: " + max);
            numbers.stream().filter(n -> n != max).max(Integer::compareTo)
                    .ifPresent(secondMax -> System.out.println("Second highest number is: " + secondMax));

        });

        //2nd approach
        numbers.stream().sorted((a, b) -> b.compareTo(a)).skip(1).findFirst()
                .ifPresent(secondHighest -> System.out.println("Second highest number using sorted is: " + secondHighest));

        //3rd approach
        List<Integer> distinctSorted = numbers.stream().distinct().sorted((a, b) -> b.compareTo(a)).collect(Collectors.toList());
        if (distinctSorted.size() >= 2) {
            System.out.println("Second highest number using distinct and sorted is: " + distinctSorted.get(1));
        } else {
            System.out.println("List does not have enough distinct elements to determine the second highest number.");
        }

        //4th approach
        Optional<Integer> SecondHeighestNo = numbers.stream().sorted(Collections.reverseOrder()).distinct().limit(2).skip(1).findFirst();
        Optional<Integer> SecondHeighestNo2 = numbers.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst();
        System.out.println("Second Heighest No : " + SecondHeighestNo.orElse(-1));
        System.out.println("Second Heighest No 2: " + SecondHeighestNo2.orElse(-1));

        //second Lowest Number
        Optional<Integer> secondLowestNumber = numbers.stream().sorted().distinct().skip(1).findFirst();
        System.out.println("Second Lowest Number : " + secondLowestNumber.orElse(-1));
    }
    private static void findGreaterThanTen(List<Integer> numbers) {
        Predicate<Integer> greaterThanTen = n -> n > 10;
        List<Integer> listOfNumberGreaterThanTen = numbers.stream().filter(greaterThanTen).collect(Collectors.toList());
        System.out.println("listOfNumberGreaterThanTen : " + listOfNumberGreaterThanTen);
    }
}
