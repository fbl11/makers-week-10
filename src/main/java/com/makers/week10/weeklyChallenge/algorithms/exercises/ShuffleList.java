package com.makers.week10.weeklyChallenge.algorithms.exercises;

import java.util.*;

public class ShuffleList {
    public static List<Integer> shuffleBuiltIn(List<Integer> list) {
        Collections.shuffle(list);
        return list;
    }


    public static List<Integer> shuffleListDIY(List<Integer> originalList) {
        Random rIndex = new Random();
        List<Integer> copyOfList = new LinkedList<>(originalList);
        List<Integer> shuffeledNewList = new ArrayList<>(originalList.size());
        Integer grabbedElement;

        while (copyOfList.size() > 0) {
            grabbedElement = copyOfList.remove(rIndex.nextInt(copyOfList.size()));
            shuffeledNewList.add(grabbedElement);
        }

        return shuffeledNewList;
    }

}
