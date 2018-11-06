package com.makers.week10.weeklyChallenge.algorithms.tooling;

import java.time.Duration;
import java.util.List;

public class Output {

    public static void printDurationsInMicrosecs(List<Duration> durs) {
        durs.stream()
                .map(duration -> duration.toNanos() / 1000)
                .forEach(microSeconds -> System.out.println(microSeconds));
    }

    public static void printDurationsInNanosecs(List<Duration> durs) {
        durs.stream()
                .map(duration -> duration.toNanos())
                .forEach(nanoSeconds -> System.out.println(nanoSeconds));
    }

    public static void printDurationInNanosecs(Duration dur) {
        System.out.println(dur.toNanos());
    }
}
