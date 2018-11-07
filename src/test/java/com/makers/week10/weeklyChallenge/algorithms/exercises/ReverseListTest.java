package com.makers.week10.weeklyChallenge.algorithms.exercises;

import com.makers.week10.weeklyChallenge.algorithms.tooling.Output;
import com.makers.week10.weeklyChallenge.algorithms.tooling.Samples;
import com.makers.week10.weeklyChallenge.algorithms.tooling.Timer;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

class ReverseListTest {

    @Test
    void ReverseListTest_oneRep() {
        System.out.println("\nLists of 10, 100, 1.000, 10.000, 100.000 - one repetition");

        List<Duration> durs = Samples.sampleLists().stream()
                .map(list -> Timer.timeInNanos(()-> ReverseList.reverseBuiltIn(list)))
                .collect(Collectors.toList());
        Output.printDurationsInNanosecs(durs);
    }

    @Test
    void ReverseListTest_10000Reps() {
        System.out.println("\nLists of 10, 100, 1.000, 10.000, 100.000 - average times over 10.000 repetitions");

        List<Duration> avgDurs = Samples.sampleLists().stream()
                .map(list -> Timer.avgTimeInNanos(() -> ReverseList.reverseBuiltIn(list), 10000))
                .collect(Collectors.toList());
        Output.printDurationsInNanosecs(avgDurs);
    }

    @Test
    void ReverseListTest_10000Reps_hugeList() {
        System.out.println("\n List of 1.000.000 elements - average time over 10.000 repetitions");

        List<Duration> durs = Samples.bigSampleList().stream()
                .map(list -> Timer.avgTimeInNanos(() -> ReverseList.reverseBuiltIn(list), 10000))
                .collect(Collectors.toList());
        Output.printDurationsInNanosecs(durs);

    }

}