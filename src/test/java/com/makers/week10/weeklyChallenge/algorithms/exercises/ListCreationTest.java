package com.makers.week10.weeklyChallenge.algorithms.exercises;

import com.makers.week10.weeklyChallenge.algorithms.tooling.Timer;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class ListCreationTest {
    private static Logger logger = LoggerFactory.getLogger(ListCreationTest.class);

    @Test
    void compareListCreation() {
        List<Integer> points = Arrays.asList(10, 100, 1000, 10000, 100000, 1000000, 10000000);

        List<Long> results;

        results = points.stream()
                .map(point -> Timer.timeInNanos(() -> createArray(point)))
                .map(duration -> duration.toNanos() / 1000)
                .collect(Collectors.toList());
        logger.info(results.toString());

        results = points.stream()
                .map(point -> Timer.timeInNanos(() -> createArray2(point)))
                .map(duration -> duration.toNanos() / 1000)
                .collect(Collectors.toList());
        logger.info(results.toString());
    }

    private void createArray(int i) {
        List<Integer> list = ListCreation.createListWithForLoopRange(1, i);
    }

    private void createArray2(int i) {
        List<Integer> list = ListCreation.createListWithStream(1, i);
    }

}