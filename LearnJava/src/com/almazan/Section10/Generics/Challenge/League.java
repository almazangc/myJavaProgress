package com.almazan.Section10.Generics.Challenge;

import java.util.ArrayList;
import java.util.Collections;

/**
 * ArrayList<Team> teams;
 * Collections.sort(teams);
 *
 * Create a generic class to implement a league table for a sport.
 * The class should allow teams to be added to the list, and store
 * a list of teams that belong to the league.
 *
 * Your class should have a method to print out the teams in order,
 * with the team at the top of the league printed first.
 *
 * Only teams of the same type should be added to any particular
 * instance of the league class - the program should fail to compile
 * if an attempt is made to add an incompatible team.
 */
public class League<T extends Teams> {
    public String name;
    private ArrayList<T> league = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public boolean add(T team) {
        if(league.contains(team)) {
            return false;
        }
        league.add(team);
        return true;
    }

    public void showLeagueTable() {
        Collections.sort(league);
        for(T t : league) {
            System.out.println(t.getName() + ": " + t.ranking());
        }
    }
}
