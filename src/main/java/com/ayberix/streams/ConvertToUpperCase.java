package com.ayberix.streams;

import java.util.List;
import java.util.stream.Collectors;

public class ConvertToUpperCase {
    public static void main(String[] args) {
        List<String> names = List.of("alice", "bob", "charlie", "david");
        List<String> upperCaseNames = names.stream()
                .map(String::toUpperCase).toList();
        System.out.println("Uppercase Names: " + upperCaseNames);
    }
}
