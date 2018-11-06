package com.makers.week10.weeklyChallenge.algorithms.tooling;

import java.time.Duration;
import java.util.stream.IntStream;

public class Timer {
    public static Duration timeInNanos(Runnable functionToTime) {
        long startTime = System.nanoTime();
        functionToTime.run();
        long endTime = System.nanoTime();

        return Duration.ofNanos(endTime - startTime);
    }

    public static Duration avgTimeInNanos(Runnable functionToTime, Integer repetitions) {
        Long sumNanos = IntStream.range(1, repetitions).boxed()
                .map(rep -> timeInNanos(functionToTime))
                .mapToLong(duration -> duration.toNanos())
                .sum();

        return Duration.ofNanos(sumNanos / repetitions);
    }
}
