package com.almazan.Section10.Generics.Challenge;

public class Main {
    public static void main(String[] args) {
//        FootballPlayer pet = new FootballPlayer("Pet");
//        BaseballPlayer moe = new BaseballPlayer("Moe");
//        SoccerPlayer coe = new SoccerPlayer("Coe");
//
//        //Assignment of generic Class
//        Teams<FootballPlayer> FbTeam = new Teams<>("FbTeam");
//        FbTeam.addPlayer(pet);
//
//        Teams<BaseballPlayer> BbTeam = new Teams<>("BbTeam");
//        BbTeam.addPlayer(moe);
//
//        Teams<SoccerPlayer> ScTeam = new Teams<>("ScTeam");
//        ScTeam.addPlayer(coe);
//
//        System.out.println(FbTeam.numberOfPlayer());
//        System.out.println(BbTeam.numberOfPlayer());
//        System.out.println(ScTeam.numberOfPlayer());

        //Teams<String> outsideClass = new Teams<String>("ain't gonna work");


//        FootballPlayer joe = new FootballPlayer("Joe");
//        BaseballPlayer pat = new BaseballPlayer("Pat");
//        SoccerPlayer beckham = new SoccerPlayer("Beckham");
//
//        Teams<FootballPlayer> adelaideCrows = new Teams<>("Adelaide Crows");
//        adelaideCrows.addPlayer(joe);
////        adelaideCrows.addPlayer(pat);
////        adelaideCrows.addPlayer(beckham);
//
//        System.out.println(adelaideCrows.numberOfPlayer());
//
//        Teams<BaseballPlayer> baseballTeam = new Teams<>("Chicago Cubs");
//        baseballTeam.addPlayer(pat);
//
//        Teams<SoccerPlayer> brokenTeam = new Teams<>(" this won't work");
//        brokenTeam.addPlayer(beckham);
//
//        Teams<FootballPlayer> melbourne = new Teams<>("Melbourne");
//        FootballPlayer banks = new FootballPlayer("Gordon");
//        melbourne.addPlayer(banks);
//
//        Teams<FootballPlayer> hawthorn= new Teams<>("Hawthorn");
//        Teams<FootballPlayer> fremantle= new Teams<>("Fremantle");
//
//        hawthorn.matchResult(fremantle, 1, 0);
//        hawthorn.matchResult(adelaideCrows, 3, 8);
//
//        adelaideCrows.matchResult(fremantle, 2, 1);
//        //adelaideCrows.matchResult(baseballTeam, 1, 1);
//
//        System.out.println("Rankings");
//        System.out.println(adelaideCrows.getName() + ": " + adelaideCrows.ranking());
//        System.out.println(melbourne.getName() + ": " + melbourne.ranking());
//        System.out.println(fremantle.getName() + ": " + fremantle.ranking());
//        System.out.println(hawthorn.getName() + ": " + hawthorn.ranking());
//
//        System.out.println(adelaideCrows.compareTo(melbourne)); //4 0 -1
//        System.out.println(adelaideCrows.compareTo(hawthorn)); //4 2 -1
//        System.out.println(hawthorn.compareTo(adelaideCrows)); //2 4 1
//        System.out.println(fremantle.compareTo(melbourne));// 0 0 0

//        ArrayList<Teams> teams;
//        Collections.sort(teams);

        /*
         *   Challenge Test code here
         */

        //League type of Teams type of FootballPlayer
        League<Teams<FootballPlayer>> footballLeague = new League<>("AFL");

        Teams<FootballPlayer> adelaideCrows = new Teams<>("Adelaide Crows");
        Teams<FootballPlayer> melbourne = new Teams<>("Melbourne");
        Teams<FootballPlayer> hawthorn= new Teams<>("Hawthorn");
        Teams<FootballPlayer> fremantle= new Teams<>("Fremantle");
        Teams<BaseballPlayer> baseballTeam = new Teams<>("Chicago Cubs");

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(adelaideCrows, 3, 8);

        adelaideCrows.matchResult(fremantle, 2, 1);

        footballLeague.add(adelaideCrows);
        footballLeague.add(melbourne);
        footballLeague.add(hawthorn);
        footballLeague.add(fremantle);

//        footballLeague.add(baseballTeam); require adding footballPlayer only to the league
        footballLeague.showLeagueTable();

        /**
         * Unchecked warning due to raw types of teams aka not generic allowing different type to be added
         */
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");
        Teams rawTeam = new Teams("Raw Team");
        rawTeam.addPlayer(beckham); // unchecked warning
        rawTeam.addPlayer(pat);     // unchecked warning

        footballLeague.add(rawTeam);     // unchecked warning

        League<Teams> rawLeague = new League<>("Raw");
        rawLeague.add(adelaideCrows);     // no warning
        rawLeague.add(baseballTeam);    // no warning
        rawLeague.add(rawTeam);         // no warning

        League reallyRaw = new League("Really raw");
        reallyRaw.add(adelaideCrows);     // unchecked warning
        reallyRaw.add(baseballTeam);    // unchecked warning
        reallyRaw.add(rawTeam);         // unchecked warning
    }
}
