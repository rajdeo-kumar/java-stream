package com.ayberix.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PartitionByEvenOdd {
    public static void main(String[] args) {
        var numbers = IntStream.rangeClosed(1, 20).boxed();
        var partitioned = numbers.collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println("Even Numbers: " + partitioned.get(true));
        System.out.println("Odd Numbers: " + partitioned.get(false));

        List<Integer> listNumbers = List.of(1,2,3,4,5,6,7,8,9,10);
        Map<Boolean, List<Integer>> partitionedList = listNumbers.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println("Even Numbers from List: " + partitionedList.get(true));
        System.out.println("Odd Numbers from List: " + partitionedList.get(false));

    }
}
