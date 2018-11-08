package com.makers.week10.weeklyChallenge.algorithms.exercises;

import com.makers.week10.weeklyChallenge.algorithms.tooling.ListCreation;
import com.makers.week10.weeklyChallenge.algorithms.tooling.Samples;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class RandomTests {

    @Test
    void TestingSizes() {
        System.out.println(Samples.ListSizes);
    }

    @Test
    void TestingListCreation() {
        List<Integer> newListOne = ListCreation.createListWithStream(5, 10);
        List<Integer> newListTwo = ListCreation.createListWithStream(10, 50);
        List<Integer> newListThree = ListCreation.createListWithStream(0, 1);

        System.out.println(newListOne);
        System.out.println(newListTwo);
        System.out.println(newListThree);
    }

    @Test
    void randomSampleListGeneration() {
        List<List<Integer>> samples = Samples.randomListsManualValues();

        assertEquals(100, samples.size());
        assertEquals(1000, samples.get(0).size());
        assertEquals(100000, samples.get(samples.size()-1).size());
        System.out.println(samples);
        System.out.println(samples.get(0));
        System.out.println(samples.get(samples.size()-1));
    }

    @Test
    void TestingCreateListWithNInts() {
        List<Integer> templateList = Samples.createListWithNInts(1000, 1000,100);
        int firstElement = templateList.get(0);
        int lastElement = templateList.get(templateList.size()-1);

        assertEquals(100, templateList.size());
        assertEquals(1000, firstElement);
        assertEquals(100000, lastElement);
        System.out.println(templateList);
        System.out.println(firstElement);
        System.out.println(lastElement);
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
    void TestingRandom() {
        Random rand = new Random();
        int selected = rand.nextInt(5);
        int smallerThanOne = rand.nextInt(1);

        System.out.println(rand);
        System.out.println(selected);
        System.out.println((smallerThanOne));
    }
}
