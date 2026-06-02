package com.ayberix.streams;

public class AddTwoListInSingleList {
    public static void main(String[] args) {
        // Given two lists of integers, combine them into a single list containing all elements from both lists.
        var list1 = java.util.List.of(1, 2, 3);
        var list2 = java.util.List.of(4, 5, 6);

        var combinedList = java.util.stream.Stream.concat(list1.stream(), list2.stream())
                .toList();

        System.out.println("Combined List: " + combinedList);
    }
}
