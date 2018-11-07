package com.makers.week10.weeklyChallenge.algorithms.exercises;

import com.makers.week10.weeklyChallenge.algorithms.tooling.Output;
import com.makers.week10.weeklyChallenge.algorithms.tooling.Samples;
import com.makers.week10.weeklyChallenge.algorithms.tooling.Timer;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

class ShuffleListTest {

    @Test
    void ShuffleListTest_oneRep() {
        System.out.println("\nLists of 10, 100, 1.000, 10.000, 100.000 - one repetition");

        List<Duration> durs = Samples.sampleLists().stream()
                .map(list -> Timer.timeInNanos(() -> ShuffleList.shuffleBuiltIn(list)))
                .collect(Collectors.toList());
        Output.printDurationsInNanosecs(durs);
    }

    @Test
    void ShuffleListTest_10000Reps() {
        System.out.println("\nLists of 10, 100, 1.000, 10.000, 100.000 - average times over 10.000 repetitions");

        List<Duration> durs = Samples.sampleLists().stream()
                .map(list -> Timer.avgTimeInNanos(() -> ShuffleList.shuffleBuiltIn(list), 10000))
                .collect(Collectors.toList());
        Output.printDurationsInNanosecs(durs);
    }

    @Test
    void ShuffleListTest_10Reps_startAt1000_stepsOf1000() {
        System.out.println("\n 100 Lists, starting with 1000 elements, steps of 1000 - average times over 1.000 repetitions");

        List<Duration> durs = Samples.sampleListsManualValues().stream()
                .map(list -> Timer.avgTimeInNanos(() -> ShuffleList.shuffleBuiltIn(list), 10))
                .collect(Collectors.toList());
        Output.printDurationsInNanosecs(durs);
    }

    @Test
    void ShuffleListTest_5000Reps_startAt1000_stepsOf1000() {
        System.out.println("\n 100 Lists, starting with 1000 elements, steps of 1000 - average times over 1.000 repetitions");

        List<Duration> durs = Samples.sampleListsManualValues().stream()
                .map(list -> Timer.avgTimeInNanos(() -> ShuffleList.shuffleBuiltIn(list), 5000))
                .collect(Collectors.toList());
        Output.printDurationsInNanosecs(durs);
    }

    @Test
    void ShuffleListTest_10000Reps_hugeList() {
        System.out.println("\nList of 1.000.000 elements - average times over 10.000 repetitions");

        List<Duration> durs = Samples.bigSampleList().stream()
                .map(list -> Timer.avgTimeInNanos(() -> ShuffleList.shuffleBuiltIn(list), 10000))
                .collect(Collectors.toList());
        Output.printDurationsInNanosecs(durs);
    }

    @Test
    void ShuffleListDIYTest_oneRep() {
        System.out.println("\n100 Lists, starting with 1000 elements, steps of 1.000 - one repetition");

        List<Duration> durs = Samples.sampleListsManualValues().stream()
                .map(list -> Timer.timeInNanos(() -> ShuffleList.shuffleListDIY(list)))
                .collect(Collectors.toList());
        Output.printDurationsInNanosecs(durs);
    }

    @Test
    void ShuffleListDIYTest_10Reps_startAt1000_stepsOf1000() {
        System.out.println("\n 100 Lists, starting with 1000 elements, steps of 1.000 - average times over 10 repetitions");

        List<Duration> durs = Samples.sampleListsManualValues().stream()
                .map(list -> Timer.avgTimeInNanos(() -> ShuffleList.shuffleListDIY(list), 10))
                .collect(Collectors.toList());
        Output.printDurationsInNanosecs(durs);
    }

    @Test
    void ShuffleListDIYTestNoRemove_10Reps_startAt1000_stepsOf1000() {
        System.out.println("\n 100 Lists, starting with 1.000 elements, steps of 1.000 - average times over 5000 repetitions");

        List<Duration> durs = Samples.sampleListsManualValues().stream()
                .map(list -> Timer.avgTimeInNanos(() -> ShuffleList.shuffleListDIYNoRemove(list), 5000))
                .collect(Collectors.toList());
        Output.printDurationsInNanosecs(durs);
    }

}