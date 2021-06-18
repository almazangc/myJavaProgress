package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

    public class CardGamePusoy {
        public static void main(String[] args) {
            clearConsole(70);
            print("[>> NOTE: Press enter to keep proceeding...");
            clearConsole(70);
            gameLoading();
            gameStart();
        }

        //just for fun loading Screen
        public static void gameLoading() {
            clearConsole(70);
            print("Reading Files...\nPress Enter to continue...");
            clearConsole(70);
            print("Eating Cotton Candy..\nPress Enter to continue...");
            clearConsole(70);
            print("Taking a nap..\nPress Enter to continue...");
            clearConsole(70);
            print("Crying over stuffs..\nPress Enter to continue...");
            clearConsole(70);
            print("Getting bored...\nPress Enter to continue...");
            clearConsole(70);
            print("Opened the game...\nPress Enter to continue...");
            clearConsole(70);
            print("Beep..\nPress Enter to continue...");
            clearConsole(70);
            print("Bleep.. *Strange noises\nPress Enter to continue...");
            clearConsole(70);
            print("Booting up...\nPress Enter to continue...");
            clearConsole(70);
            print("Kaboom...? *WTH\nPress Enter to continue...");
            clearConsole(70);

            for (int i = 0; i < 2; i++) {
                print("[ Loading ....       ]");
                clearConsole(70);
                print("[ Loading .......    ]");
                clearConsole(70);
                print("[ Loading ...........]");
                clearConsole(70);
            }
            print("<...Loading Complete...>");
        }

        //Game Process
        public static void gameStart() {
            gameTitle();
            String playerName = getName();

            ArrayList<int[]> participant_Stat = new ArrayList<>();
            int[] p_0 = {0, 0};
            participant_Stat.add(p_0);
            int[] p_1 = {0, 0};
            participant_Stat.add(p_1);
            int[] p_2 = {0, 0};
            participant_Stat.add(p_2);
            int[] p_3 = {0, 0};
            participant_Stat.add(p_3);

            gameLoop(playerName, participant_Stat);
        }

        //Game Loop of actions
        public static void gameLoop(String playerName, ArrayList<int[]> participant_Stat) {

            boolean isRunning = true;

            while (isRunning) {
                int menu_SelectedAction = gameMenu();
                switch (menu_SelectedAction) {
                    case 1:
                        clearConsole(70);
                        print(">> Selected Action: New Game...");
                        newGame(playerName, participant_Stat);
                        break;
                    case 2:
                        clearConsole(70);
                        print(">> Selected Action: Game Stats...");
                        gameStats(playerName, participant_Stat);
                        break;
                    case 3:
                        clearConsole(70);
                        print(">> Selected Action: Game Information...");
                        gameInfo();
                        break;
                    case 4:
                        clearConsole(70);
                        print(">> Selected Action: Project Team Members...");
                        teamMembers();
                        break;
                    case 5:
                        clearConsole(70);
                        print(">> Selected Action: Quit Game...");
                        isRunning = gameStop();
                        break;
                }
            }
        }

        //Game Menu of actions
        public static int gameMenu() {

            String[] gameAction = {"New Game", "Stats", "Game Information", "Project Team Members", "Quit"};

            clearConsole(70);

            System.out.println("     Game Menu List\n"
                    + "_________________________\n");

            for (int i = 0; i < gameAction.length; i++) {
                System.out.println("[ " + (i + 1) + " ] [>  " + gameAction[i]);
            }

            return readInt(gameAction.length);
        }

        //Clearing Console Display
        public static void clearConsole(int n) {
            for (int i = 0; i < n; i++) {
                System.out.println();
            }
        }

        //DisplayStopper
        public static void anyContinue() {
            new Scanner(System.in).nextLine();
        }

        //Display Message with pause just aesthetic
        public static void print(String text) {
            System.out.print("\r" + text);
            anyContinue();
        }

        //Game Title
        public static void gameTitle() {
            clearConsole(70);

            print("  [---------------------]\n"
                    + "\n       CHINESE POKER"
                    + "\n         P U S O Y  "

                    + "\n\n[>>  Card Game Project  <<]");


        }

        //parse int for invalid inputs thing
        public static int readString() {
            String read = new Scanner(System.in).nextLine();

            if (read.equals("")) {
                read = "Invalid";
            }

            if (read.matches("[0-9]*")) {
                return Integer.parseInt(read);
            } else {
                return 0;
            }

        }

        //Get String input
        public static int readInt(int range) {
            boolean isInRange = false;

            System.out.print("\n[>> Response: ");
            int response = readString();


            while (!isInRange) {
                if (response > 0 & response <= range) {
                    isInRange = true;
                } else {
                    System.out.println("_________________________\nPlease Enter a Valid Response");
                    System.out.print("\n[>> Response: ");
                    response = readString();
                }
            }
            return response;
        }

        //get user ign
        public static String getName() {
            clearConsole(70);
            print("Game Mascot: Hello Player, Nice to meet you");
            clearConsole(70);
            print("???: Hi, hahaha nice to meet yah..");
            clearConsole(70);
            print("Game Mascot: Anyways please enter your desired name");

            return confirmName();
        }

        //nameValidation
        public static String confirmName() {
            boolean isConfirmed = false;

            String playerName;
            do {
                clearConsole(70);

                System.out.print("Please enter your desired name\nInput: ");
                playerName = new Scanner(System.in).nextLine();

                clearConsole(70);

                print("Your name is " + playerName + "...");

                System.out.print("\nIs that correct?" +
                        "\n\t[ 1 ]  Yes, I affirm." +
                        "\n\t[ 2 ]  No, I want to change.\n");

                int input = readInt(2);

                if (input == 1) {
                    clearConsole(70);
                    print("Okay, Your character name is now ( " + playerName + " )");
                    isConfirmed = true;
                }

            } while (!isConfirmed);

            return playerName;
        }

        //Game Information
        public static void gameInfo() {
            clearConsole(70);
            print("[>> Information about the game mechanic contents");

            clearConsole(70);
            print("[>> Game Rule");
            gameRules();

            clearConsole(70);
            print("[>> Game Scoring");
            gameScoring();

            clearConsole(70);
            print("[>> Game Card Hand Ranking");
            gameHand_Ranking();

            clearConsole(70);
        }

        //Game Rules
        public static void gameRules() {
            //Information of Rules
            print("\n___________________________________________________\nChinese Poker (Pusoy)\n"
                    + "\n\tA card game played by a four participants"
                    + "\n\tin which each participant holds 13 shuffled cards."
                    + "\n\tWherein each participant must arrange the cards into 3 Hand Types"
                    + "\n_____________________________________________________________________"
                    + "\n\n\tFront Hand"
                    + "\n\t\tCardCount: 3"
                    + "\n\t\tPossible Hand Combination: Three of a Kind, One Pair, High Card"
                    + "\n\tMiddle Hand"
                    + "\n\t\tCardCount: 5"
                    + "\n\t\tPossible Hand Combination: All"
                    + "\n\tBack Hand"
                    + "\n\t\tCardCount: 5"
                    + "\n\t\tPossible Hand Combination: All"
                    + "\n_______________________________________________________________________"
                    + "\n\nWherein Hands are arrange from Lowest{Front} to Highest{Back} Hand Combination"
                    + "\n\nIf the participant fails to arrange his/her cards from Lowest to High. He/She will loss 3 units and lost the game.");
        }

        //Game Scoring
        public static void gameScoring() {
            //Information of Scoring
            print("\n___________________________________________________\n"
                    + "The cards of banker and each participant are compared."
                    + "\nWherein each hand is compared from Back to Front Hand."
                    + "\nEach Hand with higher hand combination wins"
                    + "\nIf the hand had a same combination, the hand is compared by its card value."
                    + "\nIf the card has the same value they are compared by the suit type."
                    + "\n"
                    + "\n"
                    + "Suit Type Ranking"
                    + "\n\t♦ > ♣ > ♥ > ♠ [Highest to Lowest]"
                    + "\nCard Value Ranking"
                    + "\n\t A, K, J, 10,..2 [Highest to Lowest]"
                    + "\nHand Combination Ranking...."
                    + "\n\nEach Winning Hand get 1 unit");

        }

        //Game Hand Ranking
        public static void gameHand_Ranking() {
            //Information of Standard Poker Hand Ranking

            print("\n___________________________________________________"
                    + "\nHand Combination and Examples {Highest to Lowest}" +
                    "\nRoyal Flush\n\t8-7-6-5-4 (all of the same suit)" +
                    "\nStraight Flush\n\t8-7-6-5-4 (all of the same suit)" +
                    "\nFour-of-a-Kind\n\tA-4-4-4-4" +
                    "\nFull House\n\t A-A-A-J-J (three of one, two of the other)" +
                    "\nFlush\n\tA-J-8-4-2 (all of the same suit)" +
                    "\nStraight\n\t 8-7-6-5-4 (of various suits)" +
                    "\nThree-of-a-Kind\n\t(Set/Trips): *-*-5-5-5" +
                    "\nTwo Pair\n\tA-A-J-J-*" +
                    "\nOne Pair\n\tA-A-*-*-*" +
                    "\nHigh Card\n\tA-*-*-*-* (different suits, non-connected, unpaired)");
        }

        //New Game
        public static void newGame(String player, ArrayList<int[]> participant_Stat) {
            cardsLoop(player, participant_Stat);
        }

        //Data of cards suit, participants, un-shuffled and shuffled Cards
        public static void cardsLoop(String player, ArrayList<int[]> participant_Stat) {

            String[] suit = {"♦", "♣", "♥", "♠"};
            String[] participants = {"Banker ( " + player + " )",
                    "Player  ( Oppa )",
                    "Player  ( BakaTaco )",
                    "Player  ( HeartHeater )"};

            ArrayList<String> playingCards = new ArrayList<>();
            addCards(playingCards, suit);

            //Card Shuffling
            clearConsole(70);
            print("Shuffling Cards...");
            ArrayList<String[]> shuffledCards = new ArrayList<>();
            shuffleRandom(shuffledCards, playingCards);

            System.out.println("Cards Shuffled... ");
            cardDisplay(shuffledCards, participants);
            print("\n...Enter to Continue...");

            ArrayList<ArrayList> cardCombination = cardCombination(playingCards);

            ArrayList<ArrayList> participantCards = sortHand(playingCards, shuffledCards, cardCombination);

            scoring(participantCards, participants, cardCombination, participant_Stat);
        }

        //list of card combinations
        public static ArrayList<ArrayList> cardCombination(ArrayList<String> playingCards) {

            ArrayList<ArrayList> cardCombination = new ArrayList<>();

            ArrayList<String[]> combiRoyalStraight = isRoyalStraight(playingCards);
            cardCombination.add(combiRoyalStraight);

            ArrayList<String[]> combiStraightFlush = isStraightFlush(playingCards);
            cardCombination.add(combiStraightFlush);

            cardCombination.add(isFourKind(playingCards));
            cardCombination.add(isFullHouse(playingCards));

            ArrayList<String[]> combiFlush = isFlush(playingCards);
            combiFlush = removeExtra(combiFlush, combiRoyalStraight);
            combiFlush = removeExtra(combiFlush, combiStraightFlush);
            cardCombination.add(combiFlush);

            ArrayList<String[]> combiStraight = isStraight(playingCards);
            combiStraight = removeExtra(combiStraight, combiStraightFlush);
            combiStraight = removeExtra(combiStraight, combiRoyalStraight);
            cardCombination.add(combiStraight);

            cardCombination.add(isThreeKind(playingCards));
            cardCombination.add(isTwoPair(playingCards));
            cardCombination.add(isPair(playingCards));
            cardCombination.add(isHighCard(playingCards));

            return cardCombination;
        }

        //Sort Each Players Cards into each Hand
        public static ArrayList<ArrayList> sortHand(ArrayList<String> playingCards, ArrayList<String[]> shuffledCards, ArrayList<ArrayList> cardCombination) {

            ArrayList<ArrayList> sortedPlayerHand = new ArrayList<>();

            //Loop for each participants cards
            for (String[] playerCards : shuffledCards) {

                //Storage for each participants cards
                ArrayList<String> participantCards = new ArrayList<>();

                //Converts array string into list
                participantCards.addAll(Arrays.asList(playerCards));

                ArrayList<String> backHand = new ArrayList<>(); // 0
                ArrayList<String> middleHand = new ArrayList<>(); // 1
                ArrayList<String> frontHand = new ArrayList<>(); // 2

                handPosition:
                for (int handPosition = 0; handPosition < 3; handPosition++) {
                    //Loop to access each combinationList
                    for (ArrayList<String[]> arrString : cardCombination) {

                        //loop to get array String in each combinations
                        for (String[] strings : arrString) {

                            int count = 0;

                            //loop to access each Array String and compare to participants Card
                            for (String tmp : strings) {

                                //loop for access on each player cards
                                for (String tmp1 : participantCards) {

                                    //compare each cards and check if all match
                                    if (tmp.equals(tmp1)) {
                                        count++;
                                    }
                                }

                            }
                            //if all match gets the combination and remove the cards
                            if (count == strings.length) {

                                //loop to access each Array String and compare to participants Card
                                for (String tmp : strings) {

                                    //loop for access on each player cards
                                    for (int m = 0; m < participantCards.size(); m++) {

                                        String tmp1 = participantCards.get(m);

                                        //compare each cards and check if all match
                                        if (tmp.equals(tmp1)) {

                                            //adds to  sorted hand
                                            switch (handPosition) {
                                                case 0:
                                                    backHand.add(tmp1);
                                                    break;
                                                case 1:
                                                    middleHand.add(tmp1);
                                                    break;
                                                case 2:
                                                    frontHand.add(tmp1);
                                                    break;
                                                default:
                                                    break;
                                            }

                                            //remove the sorted hand
                                            participantCards.remove(m);
                                        }
                                    }
                                }
                                //Changes Hand Pos
                                continue handPosition;
                            }
                        }
                    }
                }

                //complete the 5 size of back hand
                if (backHand.size() < 5) {

                    //size of unfilled cards
                    int unfilled = 5 - backHand.size();
                    minus:
                    for (int y = 0; y < unfilled; y++) {

                        //Gets the list of high Cards
                        ArrayList<String[]> highCards = cardCombination.get(9);

                        for (String[] arr : highCards) {

                            String tmp1 = arr[0];

                            for (int k = 0; k < participantCards.size(); k++) {

                                if (tmp1.equals(participantCards.get(k))) {
                                    backHand.add(participantCards.get(k));
                                    participantCards.remove(k);
                                    continue minus;
                                }
                            }
                        }

                    }
                }

                //completes the 5 size of mid hand
                if (middleHand.size() < 5) {

                    //size of unfilled cards
                    int unfilled = 5 - middleHand.size();
                    minus:
                    for (int y = 0; y < unfilled; y++) {

                        //Gets the list of high Cards
                        ArrayList<String[]> highCards = cardCombination.get(9);

                        for (String[] arr : highCards) {

                            String tmp1 = arr[0];

                            for (int k = 0; k < participantCards.size(); k++) {

                                if (tmp1.equals(participantCards.get(k))) {
                                    middleHand.add(participantCards.get(k));
                                    participantCards.remove(k);
                                    continue minus;
                                }
                            }
                        }
                    }
                }

                frontHand.addAll(participantCards);

                ArrayList<ArrayList> playerCard = new ArrayList<>();
                playerCard.add(frontHand);
                playerCard.add(middleHand);
                playerCard.add(backHand);


                sortedPlayerHand.add(playerCard);
            }
            return sortedPlayerHand;
        }

        //Scoring for Each Hand
        public static void scoring(ArrayList<ArrayList> participantCards, String[] participants, ArrayList<ArrayList> cardCombination, ArrayList<int[]> participant_Stat) {

            ArrayList<ArrayList> playerHandScore = new ArrayList<>();
            ArrayList<ArrayList> playerHandType = new ArrayList<>();

            for (ArrayList<ArrayList> deck : participantCards) {

                ArrayList<Integer> eachHandScore = new ArrayList<>();
                ArrayList<String> eachHandType = new ArrayList<>();


                nextHand:
                for (ArrayList arrayList : deck) {
                    int score = 0;

                    for (int type = 0; type < cardCombination.size(); type++) {

                        ArrayList<String[]> combiType = cardCombination.get(type);

                        for (String[] strings : combiType) {

                            int count = 0;
                            score++;

                            String[] combiPattern = strings;

                            for (int n = 0; n < combiPattern.length; n++) {

                                String pattern = combiPattern[n];

                                for (int ii = 0; ii < ((ArrayList<String>) arrayList).size(); ii++) {

                                    String handPattern = ((ArrayList<String>) arrayList).get(ii);

                                    if (pattern.equals(handPattern)) {
                                        count++;
                                    }
                                }
                            }

                            if (count == combiPattern.length) {

                                eachHandScore.add(score);

                                if (type == 0) {
                                    eachHandType.add("Royal Flush");
                                } else if (type == 1) {
                                    eachHandType.add("Straight Flush");
                                } else if (type == 2) {
                                    eachHandType.add("Four of a Kind");
                                } else if (type == 3) {
                                    eachHandType.add("Full House");
                                } else if (type == 4) {
                                    eachHandType.add("Flush     ");
                                } else if (type == 5) {
                                    eachHandType.add("Straight");
                                } else if (type == 6) {
                                    eachHandType.add("Three of a Kind");
                                } else if (type == 7) {
                                    eachHandType.add("Two Pair");
                                } else if (type == 8) {
                                    eachHandType.add("One Pair");
                                } else {
                                    eachHandType.add("High Card");
                                }
                                continue nextHand;
                            }
                        }
                    }
                }
                playerHandScore.add(eachHandScore);
                playerHandType.add(eachHandType);
            }

            for (int i = 1; i < participantCards.size(); i++) {
                int bScore = 0, pScore = 0;

                //Read Bankers
                ArrayList<ArrayList> Banker = participantCards.get(0);
                ArrayList<String> bankerhandType = playerHandType.get(0);
                ArrayList<Integer> bankerScore = playerHandScore.get(0);
                ArrayList<Integer> playerScore = playerHandScore.get(i);


                int[] p_score = participant_Stat.get(i);
                int[] b_score = participant_Stat.get(0);

                System.out.println(participants[0] +
                        "\n______________________________________________________________________________________________ [ U N I T ]");

                for (int j = 0; j < Banker.size(); j++) {
                    switch (j) {
                        case 0:
                            System.out.print("\t[>> Front Hand Cards: \t" + bankerhandType.get(0) + "\t");
                            break;
                        case 1:
                            System.out.print("\t[>> Middle Hand Cards: \t" + bankerhandType.get(1) + "\t");
                            break;
                        default:
                            System.out.print("\t[>> Back Hand Cards: \t" + bankerhandType.get(2) + "\t");
                            break;
                    }

                    ArrayList<String> eachHand = Banker.get(j); // Players Hand

                    for (String s : eachHand) {    //
                        System.out.print(s + "\t");// Display
                    }

                    if (bankerScore.get(j) < playerScore.get(j)) {
                        if (j == 0) {
                            System.out.print("\t\t");
                        }
                        System.out.print("\t[  +1  ]");
                        bScore++;
                    } else {
                        if (j == 0) {
                            System.out.print("\t\t");
                        }
                        System.out.print("\t[  -1  ]");
                    }

                    System.out.println();
                }
                System.out.println();


                ArrayList<String> playerhandType = playerHandType.get(i);
                ArrayList<ArrayList> playerHand = participantCards.get(i);

                //Read Participant
                System.out.println(participants[i] +
                        "\n______________________________________________________________________________________________ [ U N I T ]");

                for (int j = 0; j < playerHand.size(); j++) {
                    switch (j) {
                        case 0:
                            System.out.print("\t[[> Front Hand Cards: \t" + playerhandType.get(0) + "\t");
                            break;
                        case 1:
                            System.out.print("\t[[> Middle Hand Cards: \t" + playerhandType.get(1) + "\t");
                            break;
                        default:
                            System.out.print("\t[[> Back Hand Cards: \t" + playerhandType.get(2) + "\t");
                            break;
                    }

                    ArrayList<String> eachHand = playerHand.get(j); // Players Hand

                    for (String s : eachHand) {    //
                        System.out.print(s + "\t");// Display
                    }

                    if (bankerScore.get(j) > playerScore.get(j)) {
                        if (j == 0) {
                            System.out.print("\t\t");
                        }
                        System.out.print("\t[  +1  ]");
                        pScore++;
                    } else {
                        if (j == 0) {
                            System.out.print("\t\t");
                        }
                        System.out.print("\t[  -1  ]");
                    }
                    System.out.println();
                }
                System.out.println("\n");

                if (pScore > bScore) {

                    System.out.println("\n[__<<   " + participants[i] + " Won!!!" + "   >>__]");
                    //add wins and subtracts loss
                    p_score[0] += 1;
                    if (p_score[1] == 0) {
                        p_score[1] = 0;
                    } else {
                        p_score[1] -= 1;
                    }


                    b_score[1] += 1;
                    if (b_score[0] == 0) {
                        b_score[0] = 0;
                    } else {
                        b_score[0] -= 1;
                    }

                } else {
                    System.out.println("\n[__<< " + participants[0] + " Won!!!" + " >>__]");

                    //add wins and subtracts loss
                    b_score[0] += 1;
                    if (b_score[1] == 0) {
                        b_score[1] = 0;
                    } else {
                        b_score[1] -= 1;
                    }


                    p_score[1] += 1;
                    if (p_score[0] == 0) {
                        p_score[0] = 0;
                    } else {
                        p_score[0] -= 1;
                    }
                }

                participant_Stat.set(i, p_score);
                participant_Stat.set(0, b_score);

                print("\nNext....");
                clearConsole(70);
            }
        }

        //Cards Assignment of values
        public static void addCards(ArrayList playingCards, String[] suit) {

            //Assignments of card Values
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 13; j++) {
                    if (j < 9) {
                        playingCards.add(suit[i] + " " + (j + 2));
                    } else if (j == 9) {
                        playingCards.add(suit[i] + " J");
                    } else if (j == 10) {
                        playingCards.add(suit[i] + " Q");
                    } else if (j == 11) {
                        playingCards.add(suit[i] + " K");
                    } else {
                        playingCards.add(suit[i] + " A");
                    }
                }
            }
        }

        //Generates Random Numbers will be use to assign shuffled cards
        public static int[] generateNumber() {

            int[] rnd = new int[52];
            Random rng = new Random();

            for (int i = 0; i < 52; i++) {
                rnd[i] = -1;
            }
            for (int j = 0; j < 52; j++) {

                int x = rng.nextInt(52);

                for (int i = 0; i < 52; i++) {
                    if (x == rnd[i]) {
                        x = rng.nextInt(52);
                        i = -1;
                    }
                }
                rnd[j] = x;
            }
            return rnd;
        }

        //Randomize 13 cards for 4 players
        public static void shuffleRandom(ArrayList<String[]> shuffledCards, ArrayList playingCards) {

            int[] rnd = generateNumber();

            String[] player_1_Banker = new String[13];
            for (int i = 0; i < 13; i++) {
                player_1_Banker[i] = playingCards.get(rnd[i]).toString();
            }
            shuffledCards.add(player_1_Banker);

            String[] player_2 = new String[13];
            for (int i = 13; i < 26; i++) {
                player_2[i - 13] = playingCards.get(rnd[i]).toString();
            }
            shuffledCards.add(player_2);

            String[] player_3 = new String[13];
            for (int i = 26; i < 39; i++) {
                player_3[i - 26] = playingCards.get(rnd[i]).toString();
            }
            shuffledCards.add(player_3);

            String[] player_4 = new String[13];
            for (int i = 39; i < 52; i++) {
                player_4[i - 39] = playingCards.get(rnd[i]).toString();
            }
            shuffledCards.add(player_4);

        }

        //For Cards Display
        public static void cardDisplay(ArrayList<String[]> shuffledCards, String[] participant) {

            clearConsole(70);
            System.out.println("This is Shuffled Cards for 4 players\n");

            for (int i = 0; i < shuffledCards.size(); i++) {
                String[] playerCard_tmp = shuffledCards.get(i);
                for (int j = 0; j < participant.length; j++) {
                    if (i == j) {
                        System.out.println(participant[j] + " cards :");
                    }
                }
                for (String x : playerCard_tmp) {
                    System.out.print(x + "\t");
                }
                System.out.println("\n");
            }
        }

        //ArrayList String to Sting [] , Merging of Partition Participants Cards
        public static String[] listToArr(ArrayList<String> x, String[] y) {

            //this doesn't seem working
            for (int i = 0; i < x.size(); i++) {
                y[i] = x.get(i);
            }

            return y;
        }

        //Royal Straight Flush Combinations
        public static ArrayList<String[]> isRoyalStraight(ArrayList<String> Cards) {

            ArrayList<String[]> combinationList = new ArrayList<>();

            int[] pos = {12, 11, 10, 9, 8};

            for (int i = 0; i < 4; i++) {

                String[] add = {Cards.get(pos[0]), Cards.get(pos[1]), Cards.get(pos[2]), Cards.get(pos[3]), Cards.get(pos[4])};

                combinationList.add(add);

                for (int j = 0; j < pos.length; j++) {
                    pos[j] += 13;
                }

            }

            return combinationList;
        }

        //Straight Flush Combinations
        public static ArrayList<String[]> isStraightFlush(ArrayList<String> Cards) {

            //pattern for Combinations
            int[] pos = {11, 10, 9, 8, 7};


            //All possible combinations storage
            ArrayList<String[]> combinationList = new ArrayList<>();

//loop control
            boolean isRunning = true;

            while (isRunning) {

                //temporary storage for combinations
                ArrayList<String> temp = new ArrayList<>();
                for (int i = 0; i < pos.length; i++) {

                    //add the card corresponding pos
                    temp.add(Cards.get(pos[i]));

                    pos[i] -= 1;

                    if (pos[4] == 38) {
                        isRunning = false;
                    }

                    if (pos[4] == -1 || pos[4] == 12 || pos[4] == 25 || pos[4] == 38) {
                        System.out.println();
                        for (int x = 0; x < pos.length; x++) {
                            pos[x] += 21;
                        }
                    }
                }
                System.out.println();

                String[] combination = new String[pos.length];

                //converts list to arr and merges values
                listToArr(temp, combination);

                //add the new array of combination to a list
                combinationList.add(combination);


            }
            return combinationList;
        }

        //Straight Combinations gonna fix later spaghetti
        public static ArrayList<String[]> isStraight(ArrayList<String> Cards) {

            ArrayList<String[]> combinationList = new ArrayList<>();

            int[] pos = {12, 11, 10, 9, 8};
            int size = 52;

            boolean isRunning = true;
            while (isRunning) {

                for (int i = pos[0]; i < size; i += 13) {

                    for (int j = pos[1]; j < size - 1; j += 13) {

                        for (int k = pos[2]; k < size - 2; k += 13) {

                            for (int l = pos[3]; l < size - 3; l += 13) {

                                for (int m = pos[4]; m < size - 4; m += 13) {

                                    String[] add = {Cards.get(i), Cards.get(j), Cards.get(k), Cards.get(l), Cards.get(m)};

                                    combinationList.add(add);
                                }
                            }
                        }
                    }
                }

                for (int i = 0; i < pos.length; i++) {
                    pos[i] -= 1;
                }

                size--;

                if (pos[4] == -1) {
                    isRunning = false;
                }

            }
            return combinationList;

        }

        //Flush Combinations
        public static ArrayList<String[]> isFlush(ArrayList<String> Cards) {

            //List for combinations
            ArrayList<String[]> combinationList = new ArrayList<>();

            int indxStart = 12; //from A to 2

            for (int type = 0; type < 4; type++) {

                int iX = indxStart - 12;

                for (int i = indxStart; i >= iX; i--) {

                    //Index assignment
                    String s0 = Cards.get(i);

                    //loop for index 1 add
                    for (int j = i - 1; j >= iX; j--) {

                        //Index assignment for index 1
                        String s1 = Cards.get(j);

                        for (int k = j - 1; k >= iX; k--) {

                            //Assignment for index 2
                            String s2 = Cards.get(k);

                            for (int l = k - 1; l >= iX; l--) {

                                //Assignment of value to index 3
                                String s3 = Cards.get(l);

                                for (int m = l - 1; m >= iX; m--) {

                                    //Assign to index 4
                                    String s4 = Cards.get(m);

                                    String[] add = {s0, s1, s2, s3, s4};

                                    combinationList.add(add);
                                }
                            }
                        }
                    }
                }
                indxStart += 13;
            }

            return combinationList;

        }

        //Four of a kind combinations
        public static ArrayList<String[]> isFourKind(ArrayList<String> Cards) {

            ArrayList<String[]> combinationList = new ArrayList<>();

            int[] pos = {12, 25, 38, 51};
            int size = 52;

            boolean isRunning = true;
            while (isRunning) {

                for (int i = pos[0]; i < size; i += 13) {

                    for (int j = i + 13; j < size; j += 13) {

                        for (int k = j + 13; k < size; k += 13) {

                            for (int l = k + 13; l < size; l += 13) {

                                String[] add = {Cards.get(i), Cards.get(j), Cards.get(k), Cards.get(l)};
                                combinationList.add(add);
                            }
                        }
                    }
                }

                for (int i = 0; i < pos.length; i++) {
                    pos[i] -= 1;
                }
                size--;

                if (pos[0] == -1) {
                    isRunning = false;
                }

            }

            return combinationList;

        }

        //Full House Combinations
        public static ArrayList<String[]> isFullHouse(ArrayList<String> Cards) {

            ArrayList<String[]> combinationList = new ArrayList<>();

            int[] pos = {12, 25, 38, 0, 13};
            int size = 52;
            int x;

            boolean isRunning = true;
            while (isRunning) {

                for (int i = pos[0]; i < size; i += 13) {

                    for (int j = i + 13; j < size; j += 13) {

                        for (int k = j + 13; k < size; k += 13) {

                            pos[3] = 0;
                            pos[4] = 13;
                            x = 40;

                            while (pos[3] < 13) {


                                if (pos[0] == pos[3]) {
                                    pos[3]++;
                                    pos[4]++;
                                    x++;
                                }


                                for (int l = pos[3]; l < x; l += 13) {

                                    for (int m = l + 13; m < 52; m += 13) {

                                        String[] add = {Cards.get(i), Cards.get(j), Cards.get(k), Cards.get(l), Cards.get(m)};

                                        combinationList.add(add);
                                    }
                                }

                                for (int l = 3; l < pos.length; l++) {
                                    pos[l]++;
                                }
                                x++;
                            }
                        }
                    }
                }

                for (int i = 0; i < pos.length - 2; i++) {
                    pos[i]--;
                }

                size--;

                if (pos[0] == -1) {
                    isRunning = false;
                }

            }

            return combinationList;
        }

        //Three of a Kind Combinations
        public static ArrayList<String[]> isThreeKind(ArrayList<String> Cards) {

            ArrayList<String[]> combinationList = new ArrayList<>();

            int[] pos = {12, 25, 38};
            int size = 52;

            boolean isRunning = true;
            while (isRunning) {

                for (int i = pos[0]; i < size; i += 13) {

                    for (int j = i + 13; j < size; j += 13) {

                        for (int k = j + 13; k < size; k += 13) {

                            String[] add = {Cards.get(i), Cards.get(j), Cards.get(k)};

                            combinationList.add(add);
                        }
                    }
                }

                for (int i = 0; i < pos.length; i++) {
                    pos[i] -= 1;
                }
                size--;

                if (pos[0] == -1) {
                    isRunning = false;
                }

            }
            return combinationList;
        }

        //Two pair Combinations
        public static ArrayList<String[]> isTwoPair(ArrayList<String> Cards) {

            ArrayList<String[]> combinationList = new ArrayList<>();

            int[] pos = {12, 25, 0, 13};
            int size = 52;
            int x;

            boolean isRunning = true;
            while (isRunning) {

                for (int i = pos[0]; i < size; i += 13) {

                    for (int j = i + 13; j < size; j += 13) {

                        pos[2] = 0;
                        pos[3] = 13;
                        x = 13;

                        while (pos[2] < pos[0]) {

                            for (int k = pos[2]; k < size - x; k += 13) {

                                for (int l = k + 13; l < 52; l += 13) {

                                    String[] add = {Cards.get(i), Cards.get(j), Cards.get(k), Cards.get(l)};
                                    combinationList.add(add);
                                }
                            }

                            for (int k = 2; k < pos.length; k++) {
                                pos[k]++;
                            }
                            x--;
                        }
                    }
                }

                for (int i = 0; i < 2; i++) {
                    pos[i]--;
                }

                size--;

                if (pos[0] == -1) {
                    isRunning = false;
                }

            }

            return combinationList;
        }

        //Pair Combinations
        public static ArrayList<String[]> isPair(ArrayList<String> Cards) {

            ArrayList<String[]> combinationList = new ArrayList<>();

            int[] pos = {12, 25};
            int size = 52;

            boolean isRunning = true;
            while (isRunning) {
                for (int i = pos[0]; i < size; i += 13) {
                    for (int j = i + 13; j < size; j += 13) {
                        String[] add = {Cards.get(i), Cards.get(j)};
                        combinationList.add(add);
                    }
                }
                for (int i = 0; i < pos.length; i++) {
                    pos[i] -= 1;
                }
                size--;

                if (pos[0] == -1) {
                    isRunning = false;
                }
            }
            return combinationList;
        }

        //High Cards List
        public static ArrayList<String[]> isHighCard(ArrayList<String> Cards) {
            ArrayList<String[]> combinationList = new ArrayList<>();

            for (int i = 12; i >= 0; i--) {
                for (int j = i; j < 52; j += 13) {
                    String[] add = {Cards.get(j)};
                    combinationList.add(add);
                }
            }

            return combinationList;
        }

        //Remove Combination from List which is found in higher Hand Card
        public static ArrayList<String[]> removeExtra(ArrayList<String[]> x, ArrayList<String[]> y) {

            for (int i = 0; i < x.size(); i++) {
                for (String[] strings : y) {

                    String[] xi = x.get(i);

                    int matchCount = 0;

                    for (int k = 0; k < 5; k++) {
                        if (xi[k].equals(strings[k])) {
                            matchCount++;
                        }

                    }

                    if (matchCount == 5) {
                        x.remove(i);
                    }
                }
            }

            return x;
        }

        //Game Character Stats
        public static void gameStats(String playerName, ArrayList<int[]> participant_Stat) {
            clearConsole(70);
            String[] participants = {"Banker ( " + playerName + " )",
                    "Player  ( Oppa )",
                    "Player  ( BakaTaco )",
                    "Player  ( HeartHeater )"};
            for (int i = 0; i < participant_Stat.size(); i++) {


                int[] statScore = participant_Stat.get(i);

                clearConsole(70);
                System.out.println("[>> " + participants[i]
                        + "\n_____________________________");

                for (int j = 0; j < statScore.length; j++) {
                    if (j == 0) {
                        System.out.println("     Win's:\t" + statScore[0]);
                    } else {
                        System.out.println("     Loss:\t" + statScore[1]);
                    }
                }
                System.out.println("\n[ < < < < <______> > > > > ]");
                print("\n....Press Enter to Continue...");
            }


        }

        //Information about us
        public static void teamMembers() {

            clearConsole(70);
            String[] members = {"Agustin, Carla L.",
                    "Almazan, Gilbert C.",
                    "Amarillo, Vic Alfred",
                    "Barroga, Jeorge Michael P.",
                    "Bonete, Jake Edard A."};

            System.out.println("[[> Members of the Group Project <]]");

            for (String tmp : members) {
                System.out.println("[||\t" + tmp);
            }

            print("\n...Thanks for the time...");

        }

        //Exit Method
        public static boolean gameStop() {
            clearConsole(70);
            print("Game Mascot: This stop the game *sob*sob...\n");
            clearConsole(70);

            System.out.println("Game Mascot: bye bye now??"
                    + "\n\t[ 1 ]  Yes, it was fun..."
                    + "\n\t[ 2 ]  No, lel...");

            int isExit = readInt(2);

            if (isExit == 1) {
                clearConsole(70);
                print("Game Mascot: Bye bye, Come Play with me again...");
                clearConsole(70);
                return false;
            }
            clearConsole(70);
            print("Game Mascot: Im Happy, for not abandoning me *Cry cry*....");
            return true;
        }
    }

