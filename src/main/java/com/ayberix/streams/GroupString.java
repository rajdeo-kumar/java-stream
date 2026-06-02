package com.ayberix.streams;

import java.util.List;
import java.util.stream.Collectors;

/**
 * To Group Strings by their length using Java Streams.
 * Input: List of strings ["apple", "banana", "pear", "kiwi", "grape", "fig"]
 * Output: {3=[fig], 4=[kiwi], 5=[apple, grape], 6=[banana, pear]}
 */
public class GroupString {
    public static void main(String[] args) {
        List<String> strings = List.of("apple", "banana", "pear", "kiwi", "grape", "fig", "Avocado", "apricot", "blueberry");

        // Using Streams to group strings by their length
        var groupedByLength = strings.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println("Grouped by length: " + groupedByLength);

        //if a list contains any words starting with a specific letter, for example, 'a'.
        List<String> wordsStartingWithA = strings.stream()
                .filter(s -> s.startsWith("a") || s.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println("Words starting with 'a': " + wordsStartingWithA);
    }

}
