package com.makers.week10.weeklyChallenge.algorithms.exercises;

import com.makers.week10.weeklyChallenge.algorithms.tooling.Output;
import com.makers.week10.weeklyChallenge.algorithms.tooling.Samples;
import com.makers.week10.weeklyChallenge.algorithms.tooling.Timer;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortIntoGroupsTest {
    private static Logger logger = LoggerFactory.getLogger(SortIntoGroups.class);

    @Test
    void SortIntoGroups() {
        List<String> group = Samples.cohort;

        System.out.println("One iteration");
        Duration dur = Timer.timeInNanos(() -> SortIntoGroups.createTeams(group, 3));
        Output.printDurationInNanosecs(dur);

        System.out.println("\n\n");

        System.out.println("Average over 100000 iterations");
        Duration avgDur = Timer.avgTimeInNanos(() -> SortIntoGroups.createTeams(group, 3), 100000);
        Output.printDurationInNanosecs(avgDur);

    }

    @Test
    void createTeams_ThreeGroups() {
        List<List<String>> result = SortIntoGroups.createTeams(Samples.cohort, 3);
        assertEquals(3, result.size());
        assertEquals(4, result.get(0).size());
        assertEquals(3, result.get(1).size());
        assertEquals(3, result.get(2).size());
    }

    @Test
    void createTeams_FiveGroups() {
        List<List<String>> result = SortIntoGroups.createTeams(Samples.cohort, 5);
        assertEquals(5, result.size());
        assertEquals(2, result.get(0).size());
        assertEquals(2, result.get(1).size());
        assertEquals(2, result.get(2).size());
        assertEquals(2, result.get(3).size());
        assertEquals(2, result.get(4).size());

    }

}