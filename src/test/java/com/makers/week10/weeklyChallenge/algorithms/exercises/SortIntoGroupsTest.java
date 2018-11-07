package com.makers.week10.weeklyChallenge.algorithms.exercises;

import com.makers.week10.weeklyChallenge.algorithms.tooling.Output;
import com.makers.week10.weeklyChallenge.algorithms.tooling.Samples;
import com.makers.week10.weeklyChallenge.algorithms.tooling.Timer;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class SortIntoGroupsTest {
    private static Logger logger = LoggerFactory.getLogger(SortIntoGroups.class);


    @Test
    void SortIntoGroups_10Names() {
        List<String> group = Samples.listOfNames(10);

        System.out.println("10 Names One iteration");
        Duration dur = Timer.timeInNanos(() -> SortIntoGroups.createTeams(group, 3));
        Output.printDurationInNanosecs(dur);

//        System.out.println("\n");

        System.out.println("10 Names Average over 100000 iterations");
        Duration avgDur = Timer.avgTimeInNanos(() -> SortIntoGroups.createTeams(group, 3), 100000);
        Output.printDurationInNanosecs(avgDur);

        System.out.println("\n");

    }

    @Test
    void SortIntoGroups_100Names() {
        List<String> group = Samples.listOfNames(100);

        System.out.println("100 Names One iteration");
        Duration dur = Timer.timeInNanos(() -> SortIntoGroups.createTeams(group, 3));
        Output.printDurationInNanosecs(dur);

//        System.out.println("\n");

        System.out.println("100 Names Average over 100000 iterations");
        Duration avgDur = Timer.avgTimeInNanos(() -> SortIntoGroups.createTeams(group, 3), 100000);
        Output.printDurationInNanosecs(avgDur);

        System.out.println("\n");

    }

    @Test
    void SortIntoGroups_1000Names() {
        List<String> group = Samples.listOfNames(1000);

        System.out.println("1.000 Names One iteration");
        Duration dur = Timer.timeInNanos(() -> SortIntoGroups.createTeams(group, 3));
        Output.printDurationInNanosecs(dur);

//        System.out.println("\n");

        System.out.println("1.000 Names Average over 100000 iterations");
        Duration avgDur = Timer.avgTimeInNanos(() -> SortIntoGroups.createTeams(group, 3), 100000);
        Output.printDurationInNanosecs(avgDur);

        System.out.println("\n");

    }

    @Test
    void SortIntoGroups_10000Names() {
        List<String> group = Samples.listOfNames(10000);

        System.out.println("10.000 Names One iteration");
        Duration dur = Timer.timeInNanos(() -> SortIntoGroups.createTeams(group, 3));
        Output.printDurationInNanosecs(dur);

//        System.out.println("\n");

        System.out.println("10.000 Names Average over 100000 iterations");
        Duration avgDur = Timer.avgTimeInNanos(() -> SortIntoGroups.createTeams(group, 3), 100000);
        Output.printDurationInNanosecs(avgDur);

        System.out.println("\n");

    }

    @Test
    void SortInto3Groups_10Reps_startAt1000_stepsOf1000() {
        System.out.println("\n 100 Lists, starting with 1000 names, steps of 1000, 3 groups - average times over 1repetition");

        List<Duration> durs = Samples.sampleNameListsStartAt1000StepSize1000Limit100().stream()
                .map(list -> Timer.avgTimeInNanos(() -> SortIntoGroups.createTeams(list, 3), 10))
                .collect(Collectors.toList());
        Output.printDurationsInNanosecs(durs);
    }

//    Tests with iterations
//    Step size 1000, starting with 1000 names
    @Test
    void SortInto3Groups_1000Reps_startAt1000_stepsOf1000() {
        System.out.println("\n 100 Lists, starting with 1000 names, steps of 1000, 3 groups - average times over 1000repetitions");

        List<Duration> durs = Samples.sampleNameListsStartAt1000StepSize1000Limit100().stream()
                .map(list -> Timer.avgTimeInNanos(() -> SortIntoGroups.createTeams(list, 3), 1000))
                .collect(Collectors.toList());
        Output.printDurationsInNanosecs(durs);
    }

    @Test
    void SortInto5Groups_1000Reps_startAt1000_stepsOf1000() {
        System.out.println("\n 100 Lists, starting with 1000 names, steps of 1000, 5 groups - average times over 1000repetitions");

        List<Duration> durs = Samples.sampleNameListsStartAt1000StepSize1000Limit100().stream()
                .map(list -> Timer.avgTimeInNanos(() -> SortIntoGroups.createTeams(list, 5), 1000))
                .collect(Collectors.toList());
        Output.printDurationsInNanosecs(durs);
    }

//    Steps size 1500, start with 5000 names
    @Test
    void SortInto5Groups_1000Reps_startAt5000_stepsOf1500() {
        System.out.println("\n 100 Lists, starting with 5000 names, steps of 1500, 5 groups - average times over 1000repetitions");

        List<Duration> durs = Samples.sampleNameListsStartAt5000StepSize1500Limit100().stream()
                .map(list -> Timer.avgTimeInNanos(() -> SortIntoGroups.createTeams(list, 5), 1000))
                .collect(Collectors.toList());
        Output.printDurationsInNanosecs(durs);
    }

    @Test
    void SortInto12Groups_1000Reps_startAt5000_stepsOf1500() {
        System.out.println("\n 100 Lists, starting with 5000 names, steps of 1500, 12 groups - average times over 1000repetitions");

        List<Duration> durs = Samples.sampleNameListsStartAt5000StepSize1500Limit100().stream()
                .map(list -> Timer.avgTimeInNanos(() -> SortIntoGroups.createTeams(list, 12), 1000))
                .collect(Collectors.toList());
        Output.printDurationsInNanosecs(durs);
    }


//  Testing functionality of sorting into groups method
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