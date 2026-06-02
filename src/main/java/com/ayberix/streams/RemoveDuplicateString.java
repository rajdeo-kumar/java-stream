package com.ayberix.streams;

import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateString {
    public static void main(String[] args) {
        String input = "apple,banana,apple,orange,banana,apple,grapes,guava,grapes";
        List<String> words = List.of("apple","banana","apple","orange","banana","apple","grapes","guava","grapes");

        List<String> uniqueWordList = words.stream().distinct().collect(Collectors.toList());
        System.out.println("Unique Words: " + uniqueWordList);


        words.stream().findFirst().ifPresent(first -> System.out.println("First word: " + first));
       /* String result = input.chars()
                .mapToObj(c -> (char) c)
                .distinct()
                .map(String::valueOf)
                .reduce("", (a, b) -> a + b);
        System.out.println("Result: " + result);*/
    }
}
