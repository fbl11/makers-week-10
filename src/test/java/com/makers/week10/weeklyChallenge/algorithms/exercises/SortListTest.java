package com.makers.week10.weeklyChallenge.algorithms.exercises;

import com.makers.week10.weeklyChallenge.algorithms.tooling.Output;
import com.makers.week10.weeklyChallenge.algorithms.tooling.Samples;
import com.makers.week10.weeklyChallenge.algorithms.tooling.Timer;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

class SortListTest {

    // test performance builtIn sort
    @Test
    void SortListTest_oneRep() {
        System.out.println("\nLists of 10, 100, 1.000, 10.000, 100.000 - one repetition");

        List<Duration> durs = Samples.randomLists().stream()
                .map(list -> Timer.timeInNanos(() -> SortList.sortBuiltIn(list)))
                .collect(Collectors.toList());
        Output.printDurationsInNanosecs(durs);

        System.out.println("\nNo Shuffle");
        durs = Samples.sampleLists().stream()
                .map(list -> Timer.timeInNanos(() -> SortList.sortBuiltIn(list)))
                .collect(Collectors.toList());
        Output.printDurationsInNanosecs(durs);
    }

    @Test
    void SortListListTest_10000Reps() {
        System.out.println("\nLists of 10, 100, 1.000, 10.000, 100.000 - average times over 10.000 repetitions");

        List<Duration> avgDurs = Samples.randomLists().stream()
                .map(list -> Timer.avgTimeInNanos(() -> SortList.sortBuiltIn(list), 10000))
                .collect(Collectors.toList());
        Output.printDurationsInNanosecs(avgDurs);
    }

    @Test
    void SortListTest_10000Reps_hugeList() {

        System.out.println("\nList of 1000000 elements - average times over 10.000 repetitions");

        List<Duration> avgDurs = Samples.bigRandomList().stream()
                .map(list -> Timer.avgTimeInNanos(() -> SortList.sortBuiltIn(list), 10000))
                .collect(Collectors.toList());
        Output.printDurationsInNanosecs(avgDurs);
    }

    @Test
    void SortListTest_5000Reps_startAt1000_stepsOf1000() {
        System.out.println("\n 100 Lists from 1000 elements, increasing by 1000 - average times over 1000 repetitions");

        List<Duration> durs = Samples.randomListsManualValues().stream()
                .map(list -> Timer.avgTimeInNanos(() -> SortList.sortBuiltIn(list), 5000))
                .collect(Collectors.toList());
        Output.printDurationsInNanosecs(durs);
    }
}