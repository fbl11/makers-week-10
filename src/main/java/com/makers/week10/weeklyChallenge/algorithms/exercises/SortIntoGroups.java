package com.makers.week10.weeklyChallenge.algorithms.exercises;

import com.makers.week10.weeklyChallenge.algorithms.tooling.Samples;

import java.util.ArrayList;
import java.util.List;

public class SortIntoGroups {
    List<String> group = Samples.cohort;
    Integer numberOfGroups = 3;

    public static List<List<String>> createTeams(List<String> group, Integer numberOfGroups) {
        List<List<String>> newGroups = createGroups(numberOfGroups);
        for(int i=0; i < group.size() ; i++) {
            String teamMember = group.get(i);
            int groupIndex = i % numberOfGroups;

            newGroups.get(groupIndex).add(teamMember);
        }
        return newGroups;
    }

    public static List<List<String>> createGroups(Integer numberOfGroups) {
        List<List<String>> groups = new ArrayList<List<String>>();
        for(int i=0; i < numberOfGroups; i++) {
            groups.add(new ArrayList<>());
        }
        return groups;
    }
}
