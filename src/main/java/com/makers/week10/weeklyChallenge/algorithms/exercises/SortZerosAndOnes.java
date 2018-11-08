package com.makers.week10.weeklyChallenge.algorithms.exercises;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortZerosAndOnes {

    // using Streams
    public static List<Integer> sortZerosAndOnesStream(List<Integer> originalList){
        return Stream.concat(findZerosStream(originalList), findOnesStream(originalList))
                .collect(Collectors.toList());
    }

    private static Stream<Integer> findZerosStream(List<Integer> originalList){
        return originalList.stream()
                .filter(element -> element == 0);
    }

    private static Stream<Integer> findOnesStream(List<Integer> originalList){
        return originalList.stream()
                .filter(element -> element == 1);
    }

    // using lists
    public static List<Integer> sortZerosAndOnesLists(List<Integer> originalList){
        return Stream.of(findZeros(originalList), findOnes(originalList))
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());
    }

    private static List<Integer> findZeros(List<Integer> originalList){
        return originalList.stream()
                .filter(element -> element == 0)
                .collect(Collectors.toList());
    }

    private static List<Integer> findOnes(List<Integer> originalList){
        return originalList.stream()
                .filter(element -> element == 1)
                .collect(Collectors.toList());
    }
}
