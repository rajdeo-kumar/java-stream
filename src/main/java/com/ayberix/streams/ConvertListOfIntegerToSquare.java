package com.ayberix.streams;

import java.util.List;
import java.util.stream.IntStream;

public class ConvertListOfIntegerToSquare {
    public static void main(String[] args) {
        var numbers = java.util.List.of(1, 2, 3, 4, 5);
        var squares = numbers.stream()
                .map(n -> n * n)
                .toList();
        System.out.println("Squares: " + squares);

        List<Integer> list = List.of(1,2,3,4,5, 12 ,7,9,15,88,20);
        double avgOfSquareOfNumber = list.stream()
                .map(e -> e * e)
                .filter(e -> e > 100)
                .mapToInt(e -> e).average().getAsDouble();

        System.out.println("Avg Of SquareOfNumber: " + avgOfSquareOfNumber);
    }
}
