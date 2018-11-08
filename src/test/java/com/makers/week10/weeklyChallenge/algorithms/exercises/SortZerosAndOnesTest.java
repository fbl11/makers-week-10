package com.makers.week10.weeklyChallenge.algorithms.exercises;

import com.makers.week10.weeklyChallenge.algorithms.tooling.ListCreation;
import com.makers.week10.weeklyChallenge.algorithms.tooling.Output;
import com.makers.week10.weeklyChallenge.algorithms.tooling.Samples;
import com.makers.week10.weeklyChallenge.algorithms.tooling.Timer;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class SortZerosAndOnesTest {

    @Test
    void SortZerosAndOnes_Streams_5000Reps_startAt000_stepsOf1000() {
        System.out.println("\n 100 Lists, starting with 1000 elements, steps of 1000 - average times over 5000 iterations");

        List<Duration> durs = Samples.sampleListsZerosAndOnes().stream()
                .map(list -> Timer.avgTimeInNanos(() -> SortZerosAndOnes.sortZerosAndOnesStream(list), 5000))
                .collect(Collectors.toList());
        Output.printDurationsInNanosecs(durs);
    }

    @Test
    void SortZerosAndOnes_Lists_5000Reps_startAt000_stepsOf1000() {
        System.out.println("\n 100 Lists, starting with 1000 elements, steps of 1000 - average times over 5000 iterations");

        List<Duration> durs = Samples.sampleListsZerosAndOnes().stream()
                .map(list -> Timer.avgTimeInNanos(() -> SortZerosAndOnes.sortZerosAndOnesLists(list), 5000))
                .collect(Collectors.toList());
        Output.printDurationsInNanosecs(durs);
    }

//    functionality tests for Zeros and Ones
    @Test
    void TestingZeroOneListCreation() {
        List<Integer> fiveElements = ListCreation.createListOfZerosAndOnesWithStream(5);
        List<Integer> tenElements = ListCreation.createListOfZerosAndOnesWithStream(10);
        List<Integer> twentyElements = ListCreation.createListOfZerosAndOnesWithStream(20);

        System.out.println(fiveElements);
        System.out.println(tenElements);
        System.out.println(twentyElements);
    }

    @Test
    void TestingZeroOneSampleListCreation() {
        List<List<Integer>> testLists = Samples.sampleListsZerosAndOnes();

        System.out.println(testLists);
    }

    @Test
    void sortZerosAndOnes_test() {
        List<Integer> someList = Arrays.asList(1, 1, 0, 1, 0, 0, 0, 0, 1, 1, 0, 1, 0, 0, 1);

        List<Integer> newList = SortZerosAndOnes.sortZerosAndOnesStream(someList);

        System.out.println(newList);
    }
}