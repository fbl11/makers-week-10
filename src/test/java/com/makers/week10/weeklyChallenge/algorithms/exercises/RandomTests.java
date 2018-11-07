package com.makers.week10.weeklyChallenge.algorithms.exercises;

import com.makers.week10.weeklyChallenge.algorithms.tooling.Samples;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomTests {

    @Test
    void TestingSizes() {
        System.out.println(Samples.sizes);
    }

    @Test
    void TestingGetListWith100Ints() {
        System.out.println(Samples.createListWith100Ints(10, 10));
    }

    @Test
    void TestingShuffleListDIY() {
        List<Integer> someList = Arrays.asList(1, 2, 3, 4);

        List<Integer> shuffeledList = ShuffleList.shuffleListDIY(someList);

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
