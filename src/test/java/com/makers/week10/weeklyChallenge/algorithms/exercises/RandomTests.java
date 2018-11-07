package com.makers.week10.weeklyChallenge.algorithms.exercises;

import com.makers.week10.weeklyChallenge.algorithms.tooling.Samples;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomTests {

    @Test
    void TestingSizes() {
        System.out.println(Samples.ListSizes);
    }

    @Test
    void TestingCreateListWithNInts() {
        System.out.println(Samples.createListWithNInts(1000, 1000,100));
    }

    @Test
    void TestingCreateNameListWithNNames(){
        List<List<String>> test = Samples.sampleNameListsStartAt1000StepSize1000Limit100();
        System.out.println(test);
        System.out.println(test.size());
        System.out.println(test.get(0).size());
        System.out.println(test.get(1).size());
        System.out.println(test.get(2).size());
    }

    @Test
    void TestingShuffleListDIY() {
        List<Integer> someList = Arrays.asList(1, 2, 3, 4);

        List<Integer> shuffeledList = ShuffleList.shuffleListDIY(someList);

        System.out.println(shuffeledList);
    }

    @Test
    void shuffleListDIYNoRemove() {
        List<Integer> someList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> shuffeledList = ShuffleList.shuffleListDIYNoRemove(someList);

        System.out.println(shuffeledList);
    }

    @Test
    void TestingRandom() {
        Random rand = new Random();
        int selected = rand.nextInt(10);

        System.out.println(selected);
        System.out.println(rand);
    }
}
