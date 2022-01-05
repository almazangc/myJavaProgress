package com.almazan;

import java.util.*; //* as wildcard package import

/**
 * this is broken
 */

public class Maze2DimensionalArrays {

    static final Scanner in = new Scanner (System.in);

    static byte [][] maze_map = new byte [25][30]; //mazeSize
    static byte yAxis = 1, xAxis = 0; //Player position
    static byte RL = 1; //player direction
    static String response; //userInput

    public static void main(String[] args) {

        initializedMazeMap();

        running:
        while (true){

            displayMazeMap();

            if (maze_map [24][28] == 2){ // winning condition

                System.out.println("YOU WON !!!!!");
                System.out.print("\nDo you want to play again? Y : N ");

                while (true){
                    System.out.print("\nResponse: ");
                    response = in.nextLine();
                    switch (response){
                        case "yAxis": case "y":
                            newGame();
                            continue running;
                        case "N": case "n":
                                displayTeam();
                            break running;
                        default:
                            System.out.print("Invalid Response!!");
                    }
                }
            }

            System.out.print("Facing: ");
            System.out.print((RL == 0)? "▲ North ▲": (RL == 1)? "► East ►": (RL == 2) ? "▼ South ▼" : "◄ West ◄");

            while (true) {

                displayActions();

                input:
                // loop for invalid inputs
                while (true) {
                    maze_map[yAxis][xAxis] = 2;

                    System.out.print("\nResponse: ");

                    response = in.nextLine();
                    System.out.print("====================\n");
                    switch (response.toLowerCase()) {
                        case "b": case "f": case "l": case "r": case "x":  case "n":
                            break;
                        default:
                            System.out.print("Invalid Input Move!"
                                    + "\n====================");
                            continue;
                    }

                    while (true) {

                        if (maze_map[yAxis][xAxis] != 1) { //Condition for not damaging 1 and 3, only walks on empty path

                            switch (response) {
                                case "n": //new game
                                    newGame();
                                    continue running;
                                case "x":
                                    exit();
                                    break running;
                                case "l":// turn left
                                    if (RL == 1) {
                                        RL = 0;
                                        continue running;
                                    }
                                    if (RL == 0) {
                                        RL = 3;
                                        continue running;
                                    }
                                    RL -= 1;
                                    continue running;
                                case "r":
                                    if (RL == 3) {
                                        RL = 0;
                                        continue running;
                                    }
                                    RL++;
                                    continue running;
                                case "f":
                                    maze_map[yAxis][xAxis] = 0;
                                    switch (RL) {
                                        case 0:
                                            yAxis--;
                                            if (maze_map[yAxis][xAxis] == 1) {
                                                yAxis++;
                                                wallCollision();
                                                continue input;
                                            } else {
                                                maze_map[yAxis][xAxis] = 2;
                                                continue running;
                                            }
                                        case 1:
                                            xAxis++;
                                            if (maze_map[yAxis][xAxis] == 1) {
                                                xAxis--;
                                                wallCollision();
                                                continue input;
                                            } else {
                                                maze_map[yAxis][xAxis] = 2;
                                                continue running;
                                            }
                                        case 2:
                                            yAxis++;
                                            if (maze_map[yAxis][xAxis] == 1) {
                                                yAxis--;
                                                wallCollision();
                                                continue input;
                                            } else {
                                                maze_map[yAxis][xAxis] = 2;
                                                continue running;
                                            }
                                        case 3:
                                            xAxis--;
                                            if (xAxis == -1) {
                                                wallCollision();
                                                xAxis++;
                                                continue input;
                                            } else {
                                                if (maze_map[yAxis][xAxis] == 1) {
                                                    xAxis++;
                                                    wallCollision();
                                                    continue input;
                                                } else {
                                                    maze_map[yAxis][xAxis] = 2;
                                                    continue running;
                                                }
                                            }
                                    }
                                    break;
                                case "b":
                                    maze_map[yAxis][xAxis] = 0;
                                    switch (RL) {
                                        case 0:
                                            yAxis++;
                                            if (maze_map[yAxis][xAxis] == 1) {
                                                yAxis--;
                                                wallCollision();
                                                continue input;
                                            } else {
                                                maze_map[yAxis][xAxis] = 2;
                                                continue running;
                                            }
                                        case 1:
                                            xAxis--;
                                            if (xAxis == -1) {
                                                wallCollision();
                                                xAxis++;
                                                continue input;
                                            } else {
                                                if (maze_map[yAxis][xAxis] == 1) {
                                                    xAxis++;
                                                    wallCollision();
                                                    continue input;
                                                } else {
                                                    maze_map[yAxis][xAxis] = 2;
                                                    continue running;
                                                }
                                            }
                                        case 2:
                                            yAxis--;
                                            if (maze_map[yAxis][xAxis] == 1) {
                                                yAxis++;
                                                wallCollision();
                                                continue input;
                                            } else {
                                                maze_map[yAxis][xAxis] = 2;
                                                continue running;
                                            }
                                        case 3:
                                            xAxis++;
                                            if (maze_map[yAxis][xAxis] == 1) {
                                                xAxis--;
                                                wallCollision();
                                                continue input;
                                            } else {
                                                maze_map[yAxis][xAxis] = 2;
                                                continue running;
                                            }
                                    }
                                    break;
                            }
                        }
                    }
                }
            }
        }
    }

    static void initializedMazeMap() {
        for (byte i = 0; i < 25; i++){
            for (byte j = 0; j < 30; j++){
                if (i == 0 || i == 1 & (j > 2 & j < 10 || j > 16 & j < 22 || j > 22)
                        || i == 2 & (j >= 0 & j < 2 || j > 2 & j < 7 || j > 10 & j < 16 || j > 16 & j < 22 || j == 29)
                        || i == 3 & j != 2 & j != 10 & j != 16 & j != 22 & j != 26
                        || i == 4 & !(j > 1 & j < 6) & j != 10 & j != 16 & j != 22 & j != 26
                        || i == 5 & j != 2 & j != 5 & j != 10 & !(j > 15 & j < 23) & j != 26
                        || i == 6 & j != 2 & !(j > 4 & j < 17) & j != 26
                        || i == 7 & j != 1 & j != 2 & j != 11 & j != 16 & !(j > 23 & j < 27)
                        || i == 8 & j != 2 & j != 11 & !(j > 15 & j < 22) & j != 26
                        || i == 9 & j != 2 & j != 11 & !(j > 20 & j < 28)
                        || i == 10 & j != 2 & j != 8 & !(j > 10 & j < 14) & j != 21 & j != 27
                        || i == 11 & j != 2 & j != 8 & j != 13 & j != 21 & j != 27
                        || i == 12 & !(j > 1 & j < 9) & !(j > 12 & j < 18) & j != 21 & !(j > 23 & j < 28)
                        || i == 13 & j != 3 & j != 13 & j != 17 & j != 21 & j != 27
                        || i == 14 & j != 3 & j != 13 & j != 17 & j != 21 & j != 27
                        || i == 15 & j != 3 & j != 13 & j != 17 & j != 21 & !(j > 21 & j < 28)
                        || i == 16 & j != 3 & !(j > 5 & j < 18) & j != 21 & j != 24
                        || i == 17 & !(j > 0 & j < 4) & j != 6 & j != 16 & !(j > 20 & j < 25)
                        || i == 18 & j != 1 & j != 6 & j != 16 & j != 21 & !(j > 23 & j < 28)
                        || i == 19 & j != 1 & j != 6 & j != 16 & j != 21 & j != 27
                        || i == 20 & !(j > 0 & j < 4) & !(j > 5 & j < 14) & !(j > 15 & j < 19) & j != 21 & j != 27
                        || i == 21 & j != 3 & j != 9 & j != 13 & j != 18 & j != 21 & !(j > 23 & j < 28)
                        || i == 22 & j != 3 & j != 9 & j != 13 & j != 18 & j != 21 & j != 24
                        || i == 23 & !(j > 5 & j < 10) & !(j > 12 & j < 22) & !(j > 23 & j < 29)
                        || i == 24 & j != 28) {
                    maze_map [i] [j] = 1;
                }else if (i == 24 & (j == 28)){
                    maze_map [i] [j] = 3;
                }else {
                    maze_map [i] [j] = 0;
                }
            }
        }
        maze_map [yAxis] [xAxis] = 2; //player facing direction
    }
    static void displayMazeMap() {
        // for map printout
        for (byte[] a  : maze_map){
            for (byte c : a){
                switch (c){
                    case 0: //map empty path
                    case 3: // exit
                        System.out.print("  ");
                        break;
                    case 1: // map walls
                        System.out.print("0 ");
                        break;
                    case 2: // map player facing and position
                        System.out.print(((RL == 0)? "▲":
                                (RL == 1)? "► ":
                                        (RL == 2)? "▼ "
                                                : "◄ "));
                        break;
                }
            }
            System.out.println();
        }
    }

    static void displayActions() {
        System.out.print("\n===================="
                + "\nCoordinates:[" + yAxis + "]" + " [" + xAxis + "]");
        System.out.print("\n==================="
                + "\nSelect your move: "
                + "\nF: One step forward"
                + "\nB: One step backward"
                + "\nL: Turn Left"
                + "\nR: Turn Right"
                + "\nN: New Game"
                + "\nX: Quit"
                + "\n====================");
    }

    static void newGame() {
        maze_map[yAxis][xAxis] = 0;
        maze_map[1][0] = 2;
        yAxis = 1;
        xAxis = 0;
        RL = 1;
        System.out.println("Game Restarted"); // lol
    }

    static void exit() {
        System.out.println("Game Ended");
    }

    static void wallCollision() {
        System.out.print("Cant go through walls!"
                + "\n====================");
    }

    static void displayTeam() {
        System.out.print("Thank You for playing"
                + "\n  Project Members "
                + "\n  Gilbert Almazan "
                + "\n  Josh Rian Go    "
                + "\n  Noriel Emman    "
                + "\n  Janella Tamag   "
                + "\n  Rjhon Cera      \n");
    }


}


