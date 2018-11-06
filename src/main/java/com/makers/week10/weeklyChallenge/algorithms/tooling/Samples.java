package com.makers.week10.weeklyChallenge.algorithms.tooling;

import com.makers.week10.weeklyChallenge.algorithms.exercises.ListCreation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Samples {

    public static List<Integer> sizes = Arrays.asList(10, 100, 1000, 10000, 100000, 1000000);

    public static List<List<Integer>> sampleLists() {
        return sizes.stream()
                .map(count -> ListCreation.createListWithStream(1, count))
                .collect(Collectors.toList());
    }

    public static List<String> cohort = Arrays.asList("Name1", "Name2", "Name3", "Name4", "Name5", "Name6", "Name7", "Name8", "Name9", "Name10");

}
