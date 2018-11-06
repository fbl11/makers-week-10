package com.makers.week10.weeklyChallenge.algorithms.exercises;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ShuffleList {
    public static List<Integer> shuffleInBuilt(List<Integer> list) {
        Collections.shuffle(list);
        return list;
    }

//    public static List<Integer> shuffleDIY(List<Integer> list) {
//        Random rnum = new Random ();
//
//        for (int i=0,)
//
//        return list;
//    }
//
//    public static int[] RandomizeArray(int[] array){
//        Random rgen = new Random();  // Random number generator
//
//        for (int i=0; i<array.length; i++) {
//            int randomPosition = rgen.nextInt(array.length);
//            int temp = array[i];
//            array[i] = array[randomPosition];
//            array[randomPosition] = temp;
//        }
//
//        return array;
//    }
}
