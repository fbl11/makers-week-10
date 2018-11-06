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
}