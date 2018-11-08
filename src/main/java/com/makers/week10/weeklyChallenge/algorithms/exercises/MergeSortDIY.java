package com.makers.week10.weeklyChallenge.algorithms.exercises;

import java.util.ArrayList;
import java.util.List;

public class MergeSortDIY {

    public static List<Integer> mergeSortDIY(List<Integer> unsortedList) {
        if (unsortedList.size() == 1) return unsortedList;

        int indexToSplit = unsortedList.size() / 2;

        List<Integer> leftList = unsortedList.subList(0, indexToSplit);
        List<Integer> rightList = unsortedList.subList(indexToSplit, unsortedList.size());

        List<Integer> sortedLeftList = mergeSortDIY(leftList);
        List<Integer> sortedRightList = mergeSortDIY(rightList);

        return mergeSortedLists(sortedLeftList, sortedRightList);
    }

    public static List<Integer> mergeSortedLists(List<Integer> sortedLeftList, List<Integer> sortedRightList) {
        List<Integer> mergedList = new ArrayList<>();

        int lindex = 0;
        int rindex = 0;
        int rightSize = sortedRightList.size();
        int leftSize = sortedLeftList.size();

        while (mergedList.size() < leftSize + rightSize) {
            int tempLeft = sortedLeftList.get(lindex);
            int tempRight = sortedRightList.get(rindex);

            if (tempLeft <= tempRight) {
                mergedList.add(tempLeft);
                lindex ++;
            } else {
                mergedList.add(tempRight);
                rindex ++;
            }

            if (lindex > leftSize - 1) {
                mergedList.addAll(sortedRightList.subList(rindex, rightSize));
            }

            if (rindex > rightSize - 1) {
                mergedList.addAll(sortedLeftList.subList(lindex, leftSize));
            }
        }

        return mergedList;
    }
}