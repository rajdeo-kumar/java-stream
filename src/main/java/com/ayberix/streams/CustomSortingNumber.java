package com.ayberix.streams;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomSortingNumber {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(5, 2, 8, 1, 3, 7, 4, 6, 40,55,12,23,11,9,0,-1,-5,-10, -20,88,100,99);

        List<Integer> sortedNumbers = numbers.stream().sorted().collect(Collectors.toList());

        int middleIndex = sortedNumbers.size() / 2;

        List<Integer> firstHalf = sortedNumbers.subList(0, middleIndex);
        List<Integer> secondHalf = sortedNumbers.subList(middleIndex, sortedNumbers.size());
        Collections.reverse(secondHalf);
        System.out.println("Original List: " + numbers);
        System.out.println("Sorted List: " + sortedNumbers);
        System.out.println("First Half: " + firstHalf);
        System.out.println("Second Half: " + secondHalf);
        List<Integer> customSortedList = Stream.concat(firstHalf.stream(), secondHalf.stream()).toList();
        System.out.println("Custom Sorted List: " + customSortedList);

    }
}
