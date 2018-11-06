package com.makers.week10.weeklyChallenge.algorithms.tooling;

import com.makers.week10.weeklyChallenge.algorithms.exercises.ListCreation;
import com.makers.week10.weeklyChallenge.algorithms.exercises.ShuffleList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Samples {

    public static List<Integer> sizes = Arrays.asList(10, 100, 1000, 10000, 100000);

    public static List<List<Integer>> sampleLists() {
        return sizes.stream()
                .map(count -> ListCreation.createListWithStream(1, count))
                .collect(Collectors.toList());
    }

    public static List<List<Integer>> randomLists() {
        List<List<Integer>> numLists = sizes.stream()
                .map(count -> ListCreation.createListWithStream(1, count))
                .collect(Collectors.toList());

        return numLists.stream()
                .map(list -> ShuffleList.shuffleInBuilt(list))
                .collect(Collectors.toList());
    }

//    big numbers
    public static List<Integer> bigSize = Arrays.asList(1000000);

    public static List<List<Integer>> bigSampleList() {
        return bigSize.stream()
                .map(count -> ListCreation.createListWithStream(1, count))
                .collect(Collectors.toList());
    }

    public static List<List<Integer>> bigRandomList() {
        List<List<Integer>> bigList = bigSize.stream()
                .map(count -> ListCreation.createListWithStream(1, count))
                .collect(Collectors.toList());

        return bigList.stream()
                .map(list -> ShuffleList.shuffleInBuilt(list))
                .collect(Collectors.toList());
    }

//    linear steps

    public static List<Integer> getListWith100Ints(int start, int stepSize) {
        Integer value = start;
        Integer step = stepSize;

        List<Integer> listSizes = new ArrayList<>(100);

        for(int i = 0 ; i <= 100 ; i++) {
            listSizes.add(value);
            value += step;
        }
        return listSizes;
    }


    public static List<List<Integer>> sampleListsManualValues() {
        return getListWith100Ints(1000, 1000)
                .stream()
                .map(count -> ListCreation.createListWithStream(1, count))
                .collect(Collectors.toList());
    }

    public static List<Integer> listOfIntegers(int numberOfIntegers) {
        return IntStream.range(1, numberOfIntegers)
                .boxed()
                .collect(Collectors.toList());
    }


    //    for 'Sort into groups example'
    public static List<String> cohort = Arrays.asList("Name1", "Name2", "Name3", "Name4", "Name5", "Name6", "Name7", "Name8", "Name9", "Name10");

    public static List<String> listOfNames(int numberOfNames) {
        return IntStream.range(1, numberOfNames)
                .boxed()
                .map((nameNumber) -> "Name" + nameNumber.toString())
                .collect(Collectors.toList());
    }
}
