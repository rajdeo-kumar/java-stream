package com.ayberix.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * FlattenListOfList
 * 1,2,3
 * 4,5,6
 * 7,8,9
 * output: [1,2,3,4,5,6,7,8,9]
 */
public class FlattenListOfList {
    public static void main(String[] args) throws Exception{

        List<Integer> collect = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6), Arrays.asList(7, 8, 9))
                .stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println("collect : " + collect);

    }
}
