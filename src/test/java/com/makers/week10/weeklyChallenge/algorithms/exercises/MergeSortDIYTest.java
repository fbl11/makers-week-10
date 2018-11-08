package com.makers.week10.weeklyChallenge.algorithms.exercises;

import com.makers.week10.weeklyChallenge.algorithms.tooling.Output;
import com.makers.week10.weeklyChallenge.algorithms.tooling.Samples;
import com.makers.week10.weeklyChallenge.algorithms.tooling.Timer;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortDIYTest {

//    test functionality
    @Test
    void mergeLists_unequalLength() {
        List<Integer> sortedOne = Arrays.asList(3, 6, 8, 9);
        List<Integer> sortedToo = Arrays.asList(1, 2, 10);

        List<Integer> merged = MergeSortDIY.mergeSortedLists(sortedOne,sortedToo);

        assertEquals(Arrays.asList(1, 2, 3, 6, 8, 9, 10), merged);
        System.out.println(merged);
    }

    @Test
    void mergeLists_equalLength() {
        List<Integer> sortedOne = Arrays.asList(3, 6, 8, 9);
        List<Integer> sortedToo = Arrays.asList(0, 1, 2, 10);

        List<Integer> merged = MergeSortDIY.mergeSortedLists(sortedOne,sortedToo);

        assertEquals(Arrays.asList(0, 1, 2, 3, 6, 8, 9, 10), merged);
        System.out.println(merged);
    }

    @Test
    void mergeSortDIY_evenNumberOfElements_withDuplicates() {
        List<Integer> unsorted = Arrays.asList(3, 1, 6, 4, 8, 14, 9, 14);

        List<Integer> sorted = MergeSortDIY.mergeSortDIY(unsorted);

        assertEquals(Arrays.asList(1, 3, 4, 6, 8, 9, 14, 14), sorted);
        System.out.println(sorted);
    }

    @Test
    void mergeSortDIY_unevenNumberOfElements_withDuplicates() {
        List<Integer> unsorted = Arrays.asList(3, 1, 6, 14, 8, 14, 9, 2, 0);

        List<Integer> sorted = MergeSortDIY.mergeSortDIY(unsorted);

        assertEquals(Arrays.asList(0, 1, 2, 3, 6, 8, 9, 14, 14), sorted);
        System.out.println(sorted);
    }

//    test performance

    @Test
    void SortListTest_5000Reps_startAt1000_stepsOf1000() {
        System.out.println("\n 100 Lists from 1000 elements, increasing by 1000 - average times over 1000 repetitions");

        List<Duration> durs = Samples.randomListsManualValues().stream()
                .map(list -> Timer.avgTimeInNanos(() -> MergeSortDIY.mergeSortDIY(list), 1000))
                .collect(Collectors.toList());
        Output.printDurationsInNanosecs(durs);
    }


}