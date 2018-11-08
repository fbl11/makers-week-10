package com.makers.week10.weeklyChallenge.algorithms.tooling;

import com.makers.week10.weeklyChallenge.algorithms.exercises.ShuffleList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Samples {

    public static List<Integer> ListSizes = Arrays.asList(10, 100, 1000, 10000, 100000);

    public static List<List<Integer>> sampleLists() {
        return ListSizes.stream()
                .map(count -> ListCreation.createListWithStream(1, count))
                .collect(Collectors.toList());
    }

    public static List<List<Integer>> randomLists() {
        return ListSizes.stream()
                .map(count -> ListCreation.createListWithStream(1, count))
                .peek(list -> Collections.shuffle(list))
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
                .map(list -> ShuffleList.shuffleBuiltIn(list))
                .collect(Collectors.toList());
    }

//    linear steps

    public static List<Integer> createListWithNInts(int start, int stepSize, int limit) {

        return IntStream.iterate(start, prev -> prev + stepSize)
                .limit(limit)
                .boxed()
                .collect(Collectors.toList());

//        Integer value = start;
//
//        List<Integer> listSizes = new ArrayList<>(100);
//
//        for(int i = 0 ; i <= 100 ; i++) {
//            listSizes.add(value);
//            value += stepSize;
//        }

//        for(int i = start ; i <= start+100*stepSize ; i = i + stepSize) {
//            listSizes.add(i);
//        }
//        return listSizes;
    }

    public static List<List<Integer>> sampleListsManualValues() {
        return createListWithNInts(1000, 1000, 100)
                .stream()
                .map(count -> ListCreation.createListWithStream(1, count))
                .collect(Collectors.toList());
    }

    public static List<List<Integer>> randomListsManualValues() {
        List<List<Integer>> numLists = createListWithNInts(1000, 1000, 100).stream()
                .map(count -> ListCreation.createListWithStream(1, count))
                .collect(Collectors.toList());

        return numLists.stream()
                .map(list -> ShuffleList.shuffleBuiltIn(list))
                .collect(Collectors.toList());
    }

//    lists with only zero and one elements

    public static List<List<Integer>> sampleListsZerosAndOnes() {
        return createListWithNInts(1000, 1000, 100)
                .stream()
                .map(count -> ListCreation.createListOfZerosAndOnesWithStream(count))
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

    public static List<List<String>> sampleNameListsStartAt1000StepSize1000Limit100() {
        List<Integer> groupSizes = createListWithNInts(1000, 1000, 100);
        List<List<String>> listOfListsOfNames = new ArrayList<>();

        for (Integer groupSize : groupSizes)
        { listOfListsOfNames.add(listOfNames(groupSize));
            
        }
        return listOfListsOfNames;
    }

    public static List<List<String>> sampleNameListsStartAt5000StepSize1500Limit100() {
        List<Integer> groupSizes = createListWithNInts(5000, 1500, 100);
        List<List<String>> listOfListsOfNames = new ArrayList<>();

        for (Integer groupSize : groupSizes)
        { listOfListsOfNames.add(listOfNames(groupSize));

        }
        return listOfListsOfNames;
    }

}
