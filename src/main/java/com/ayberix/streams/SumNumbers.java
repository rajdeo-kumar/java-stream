package com.ayberix.streams;

import java.util.List;
import java.util.stream.Collectors;

public class SumNumbers {
    public static void main(String[] args) {
        // Sum of first 5 numbers from List
        List<Integer> numbers = List.of(10,52,7,8,3, 1, 2, 3, 4, 5, 9,14);
        //get first 5 numbers and sum them.
        int sumFirst5Number = numbers.stream().limit(5).mapToInt(Integer::intValue).sum();
        System.out.println("Print first 5 Numbers: " + numbers.stream().limit(5).toList());
        System.out.println("Sum of first 5 numbers: " + sumFirst5Number);

        //skip first 5 numbers
        List<Integer> skipFirst5ThenReturnNext5Number = numbers.stream().skip(5).collect(Collectors.toList()).stream().limit(5).toList();
        System.out.println("Skip first 5 numbers then return next 5 numbers: " + skipFirst5ThenReturnNext5Number);

        //get Last 5 numbers and sum them.
        System.out.println("Print last 5 Numbers: " + numbers.stream().skip(numbers.size() - 5).toList());
        int sumLast5Number = numbers.stream().skip(numbers.size() - 5).mapToInt(Integer::intValue).sum();
        System.out.println("Sum of last 5 numbers: " + sumLast5Number);
    }
}
