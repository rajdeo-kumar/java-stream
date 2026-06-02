package com.ayberix.streams;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortingNumber {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(5, 2, 8, 1, 3, 7, 4, 6, 40,55,12,23,11,9,0,-1,-5,-10, -20,88,100,99);
        // Using Streams to sort numbers in ascending order
        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .toList();
        System.out.println("Sorted Numbers in Ascending Order: " + sortedNumbers);

        List<Integer> defaultASCOrder = numbers.stream().sorted((a, b) -> a.compareTo(b)).collect(Collectors.toList());
        System.out.println("default ASC Order : " + defaultASCOrder);

        //reverse order using compareTO
        List<Integer> descendingOrder = numbers.stream().sorted((a, b) -> b.compareTo(a)).collect(Collectors.toList());
        System.out.println("Descending Order : " + descendingOrder);

        //reverse using reverse method
        List<Integer> reverseOrder = numbers.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println("Reverse Order : " + reverseOrder);

        //half ascending order and half descending order in to a list
        System.out.println("Custom Sorted Numbers:");






        /*numbers.stream()
                .sorted((a, b) -> {
                    if (a <= 5 && b <= 5) {
                        return a.compareTo(b); // Ascending order for numbers <= 5
                    } else if (a > 5 && b > 5) {
                        return b.compareTo(a); // Descending order for numbers > 5
                    } else if (a <= 5) {
                        return -1; // a comes before b
                    } else {
                        return 1; // b comes before a
                    }
                })
                .forEach(System.out::println);*/
    }
}
