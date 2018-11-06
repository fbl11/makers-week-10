package com.makers.week10.weeklyChallenge.algorithms.exercises;

import java.util.Collections;
import java.util.List;

public class AccessLast {
    public static Integer lastEntryDefault(List<Integer> list) {
        return list.get(list.size()-1);
    }

    public static List<Integer> lastEntrySuperComplex(List<Integer> list) {
        Collections.reverse(list);
        return list;
    }
}
