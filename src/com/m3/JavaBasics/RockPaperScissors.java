package com.m3.JavaBasics;

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);

        boolean playAgain = true;

        while (playAgain) {
            int round; // number of rounds to play
            String playAgainStr;

            // get variable: round from the player
            System.out.print("How many rounds do you want to play? ");
            round = Integer.parseInt(inputReader.nextLine());
            // input validation for variable: round
            if (round < 1 || round > 10) {
                System.out.println("Error: The number of rounds is out of range(1-10).");
                return;
            } else {
                int tie = 0;
                int userWin = 0;
                int computerWin = 0;

                for (int i = 0; i < round; i++) {
                    int playerChoice, computerChoice;
                    String[] choice = {"nope", "Rock", "Paper", "Scissors"};
                    Random rng = new Random();

                    // get valid input for variable: playerChoice from players
                    do {
                        System.out.println("1: Rock; 2: Paper; 3: Scissors");
                        System.out.print("Player's choice: ");
                        playerChoice = Integer.parseInt(inputReader.nextLine());
                    } while (playerChoice < 1 || playerChoice > 3);

                    // get variable: computerChoice randomly from computers
                    computerChoice = rng.nextInt(3) + 1;

                    // print choice of each side
                    System.out.println("Player's choice:   " + choice[playerChoice]);
                    System.out.println("Computer's choice: " + choice[computerChoice]);

                    // record and show results of each round
                    if (playerChoice == computerChoice) {
                        tie++;
                        System.out.println("Tie!");
                    } else if (playerChoice > computerChoice) {
                        if (playerChoice == 3 && computerChoice == 1) {
                            computerWin++;
                            System.out.println("Computer Wins!");
                        }
                        else {
                            userWin++;
                            System.out.println("Player Wins!");
                        }
                    } else {
                        if (playerChoice == 1 && computerChoice == 3) {
                            userWin++;
                            System.out.println("Player Wins!");
                        }
                        else {
                            computerWin++;
                            System.out.println("Computer Wins!");
                        }
                    }
                }

                // show the overall result of the game
                System.out.println();
                System.out.println("Ties: " + tie + "; Player wins: " +
                        userWin + "; Computer wins: " + computerWin);
                System.out.print("Final winner: ");
                if (userWin > computerWin) {
                    System.out.println("Player");
                } else if (computerWin > userWin) {
                    System.out.println("Computer");
                } else {
                    System.out.println("None");
                }

                // ask the player if he/she wants to play again
                do {
                    System.out.print("(yes/no) Do you want to play again? ");
                    playAgainStr = inputReader.nextLine();
                } while (!playAgainStr.equals("yes") && !playAgainStr.equals("no") &&
                        !playAgainStr.equals("Yes") && !playAgainStr.equals("No"));

                if (playAgainStr.equals("no") || playAgainStr.equals("No")) {
                    System.out.println("Thank you for playing!");
                    playAgain = false;
                }
            }
        }
    }
}
