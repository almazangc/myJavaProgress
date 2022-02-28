package com.almazan.Section10.Generics.Challenge;

import java.util.ArrayList;

//Type parameter <T> this is where generic class comes in
public class Teams<T extends Player> implements Comparable<Teams<T>> {
    private String name;
    int playCount = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Teams(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player){
        //Casting player as type player System.out.println(((Player)player).getName() + " is already on this team");
        //By specifying Type parameter extend
        if (members.contains(player)) {
            System.out.println(player.getName() + " is already on this team");
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName() + " is added on team" + this.name);
            return true;
        }
    }

    public int numberOfPlayer(){
        return this.members.size();
    }

    public void matchResult(Teams<T> opponent, int ourScore, int theirScore) {

        String message;

        if(ourScore > theirScore) {
            won++;
            message = " beat ";
        } else if(ourScore == theirScore) {
            tied++;
            message = " drew with ";

        } else {
            lost++;
            message = " lost to ";
        }
        playCount++;
        if(opponent != null) {
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking(){
        return (won * 2) + tied;
    }

    @Override
    public int compareTo(Teams<T> teams) {
        if (this.ranking() > teams.ranking())
            return -1;
        else if (this.ranking() < teams.ranking())
            return 1;
        else
            return 0;

        //return Integer.compare(teams.ranking(), this.ranking());
    }
}
