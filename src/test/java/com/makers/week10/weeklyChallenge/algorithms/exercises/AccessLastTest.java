package com.makers.week10.weeklyChallenge.algorithms.exercises;

import com.makers.week10.weeklyChallenge.algorithms.tooling.Output;
import com.makers.week10.weeklyChallenge.algorithms.tooling.Samples;
import com.makers.week10.weeklyChallenge.algorithms.tooling.Timer;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

class AccessLastTest {

    @Test
    void accessLastTest() {
        List<Duration> durs = Samples.sampleLists().stream()
                .map(list -> Timer.timeInNanos(() -> AccessLast.lastEntryDefault(list)))
                .collect(Collectors.toList());
        Output.printDurationsInNanosecs(durs);

        System.out.println("\n\n");

        durs = Samples.sampleLists().stream()
                .map(list -> Timer.avgTimeInNanos(() -> AccessLast.lastEntryDefault(list), 1000000))
                .collect(Collectors.toList());
        Output.printDurationsInNanosecs(durs);
    }

    @Test
    void accessLastTest_oneRep() {
        System.out.println("\nLists of 10, 100, 1.000, 10.000, 100.000 - one repetition");

        List<Duration> durs = Samples.sampleLists().stream()
                .map(list -> Timer.timeInNanos(() -> AccessLast.lastEntryDefault(list)))
                .collect(Collectors.toList());
        Output.printDurationsInNanosecs(durs);
    }

    @Test
    void accessLastTest_10000Reps() {
        System.out.println("\nLists of 10, 100, 1.000, 10.000, 100.000 - 10.000 repetition");

        List<Duration> avgDurs = Samples.sampleLists().stream()
                .map(list -> Timer.avgTimeInNanos(() -> AccessLast.lastEntryDefault(list), 10000))
                .collect(Collectors.toList());
        Output.printDurationsInNanosecs(avgDurs);
    }

    @Test
    void accessLastTest_10000Reps_hugeList() {
        System.out.println("\nList of 1000000 elements - average times over 10.000 repetitions");

        List<Duration> avgDurs = Samples.bigSampleList().stream()
                .map(list -> Timer.avgTimeInNanos(() -> AccessLast.lastEntryDefault(list), 10000))
                .collect(Collectors.toList());
        Output.printDurationsInNanosecs(avgDurs);
    }
}