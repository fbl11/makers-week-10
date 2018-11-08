package com.makers.week10.weeklyChallenge.algorithms.tooling;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListCreation {
    public static List<Integer> createListWithForLoopRange(int from, int limit) {
        List<Integer> numbers = new ArrayList<>(limit);
        for (int to = limit; from < to; ++from) {
            numbers.add(from);
        }
        return numbers;
    }

    public static List<Integer> createListWithStream(int from, int limit) {
        return IntStream.range(from, limit)
                .boxed()
                .collect(Collectors.toList());
    }

    public static List<Integer> createListOfZerosAndOnesWithStream(int length) {
        Random random = new Random();

        return IntStream.generate(() -> random.nextInt(2))
                .limit(length)
                .boxed()
                .collect(Collectors.toList());
    }

}


