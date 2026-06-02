package com.ayberix.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample2 {
    public static void main(String[] args) {
        Stream<String> streamHello = Stream.of("Hello", "my", "name", "is", "John", "Doe", "and", "I", "am", "a", "Java", "developer");

        List<String> collect = streamHello.filter(word -> word.length() >= 4).collect(Collectors.toList());
        System.out.println(collect);
        System.out.println(collect.stream().count());

        //count the number of words occurance in the given list
        List<String> words = List.of("apple", "banana", "apple", "orange", "banana", "apple");
        long count = words.stream()
                .filter(word -> word.equals("apple"))
                .count();
        System.out.println("Number of occurrences of 'apple': " + count);

        //count the number of each words occurance in the given list

    }
}
