package com.ayberix.streams;

import java.util.List;

public class ConvertListOfIntegerToSquare {
    public static void main(String[] args) {
        var numbers = List.of(1, 2, 3, 4, 5);
        List<Integer> list = List.of(1,2,3,4,5, 12 ,7,9,15,88,20);
        List<?> squares = findSquareOfNumber(numbers);
        System.out.println("Squares: " + squares);

        double avgOfSquareOfNumber = findAvgOfSquareOfNumber(list);
        System.out.println("Avg Of SquareOfNumber: " + avgOfSquareOfNumber);
    }

    private static List<Integer> findSquareOfNumber(List<Integer> numbers) {
        var squares = numbers.stream()
                .map(n -> n * n)
                .toList();
        return squares;
    }

    private static double findAvgOfSquareOfNumber(List<Integer> list) {
        double avgOfSquareOfNumber = list.stream()
                .map(e -> e * e)
                .filter(e -> e > 100)
                .mapToInt(e -> e).average().getAsDouble();
        return avgOfSquareOfNumber;
    }
}
