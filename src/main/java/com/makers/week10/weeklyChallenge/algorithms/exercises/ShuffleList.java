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

    public static List<Integer> shuffleListDIYNoRemove(List<Integer> originalList) {
        Random rIndex = new Random();
        List<Integer> copyOfList = new ArrayList<>(originalList);
        List<Integer> shuffeledNewList = new ArrayList<>(originalList.size());

//        while (copyOfList.size() > 0) {
//            int randomPosition = rIndex.nextInt(copyOfList.size());
//            int grabbedElement = copyOfList.get(randomPosition);
//            shuffeledNewList.add(grabbedElement);
//            int lastElement = copyOfList.get(copyOfList.size()-1);
//            copyOfList.set(randomPosition, lastElement);
//            copyOfList.remove(copyOfList.size()-1);
//            }
        while (copyOfList.size() > 0) {
            int randomPosition = rIndex.nextInt(copyOfList.size());
            shuffeledNewList.add(copyOfList.get(randomPosition));
            copyOfList.set(randomPosition, copyOfList.get(copyOfList.size()-1));
            copyOfList.remove(copyOfList.size()-1);
        }

        return shuffeledNewList;
    }

}
