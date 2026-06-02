package com.ayberix.streams;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Find duplicate elements in a list using Java Streams.
 * Input: List of integers [1, 2, 3, 4, 2, 3, 5, 6, 1]
 * Output: Duplicate elements are [1, 2, 3]
 */
public class DuplicateElements {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 2, 3, 5, 6, 1,5,6,7,8,9,9,10,10,11,12,13,14,15,16,17,18,19,20);
        // Using Streams to find duplicate elements
        List<Integer> duplicates = numbers.stream()
                .filter(i -> numbers.indexOf(i) != numbers.lastIndexOf(i))
                .distinct()
                .toList();
        System.out.println("Duplicate elements are " + duplicates);

        //Another way to find duplicates
        HashSet<Integer> set = new HashSet<>();
        List<Integer> collect = numbers.stream().filter(i ->!set.add(i)).distinct().collect(Collectors.toList());
        System.out.println("collect duplicates: " + collect);

        //Another way to find duplicates
        Set<Integer> collectDuplicates = numbers.stream().filter(e -> Collections.frequency(numbers, e) > 1).collect(Collectors.toSet());
        System.out.println("collectDuplicates : " + collectDuplicates);
    }
}
