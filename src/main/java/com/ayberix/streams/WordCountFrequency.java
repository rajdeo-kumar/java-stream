package com.ayberix.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordCountFrequency {
    public static void main(String[] args) {
        List<String> words = List.of("apple", "banana", "apple", "orange", "banana", "apple");
        Map<String, Long> wordCount = words.stream()
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

        System.out.println("Word Count: " + wordCount);
    }
}
