//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.m3.JavaBasics;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public RockPaperScissors() {
    }

    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        boolean playAgain = true;

        while(playAgain) {
            System.out.print("How many rounds do you want to play? ");
            int round = Integer.parseInt(inputReader.nextLine());
            if (round < 1 || round > 10) {
                System.out.println("Error: The number of rounds is out of range(1-10).");
                return;
            }

            int tie = 0;
            int userWin = 0;
            int computerWin = 0;

            for(int i = 0; i < round; ++i) {
                String[] choice = new String[]{"nope", "Rock", "Paper", "Scissors"};
                Random rng = new Random();

                int playerChoice;
                do {
                    do {
                        System.out.println("1: Rock; 2: Paper; 3: Scissors");
                        System.out.print("Player's choice: ");
                        playerChoice = Integer.parseInt(inputReader.nextLine());
                    } while(playerChoice < 1);
                } while(playerChoice > 3);

                int computerChoice = rng.nextInt(3) + 1;
                System.out.println("Player's choice:   " + choice[playerChoice]);
                System.out.println("Computer's choice: " + choice[computerChoice]);
                if (playerChoice == computerChoice) {
                    ++tie;
                    System.out.println("Tie!");
                } else if (playerChoice > computerChoice) {
                    if (playerChoice == 3 && computerChoice == 1) {
                        ++computerWin;
                        System.out.println("Computer Wins!");
                    } else {
                        ++userWin;
                        System.out.println("Player Wins!");
                    }
                } else if (playerChoice == 1 && computerChoice == 3) {
                    ++userWin;
                    System.out.println("Player Wins!");
                } else {
                    ++computerWin;
                    System.out.println("Computer Wins!");
                }
            }

            System.out.println();
            System.out.println("Ties: " + tie + "; Player wins: " + userWin + "; Computer wins: " + computerWin);
            System.out.print("Final winner: ");
            if (userWin > computerWin) {
                System.out.println("Player");
            } else if (computerWin > userWin) {
                System.out.println("Computer");
            } else {
                System.out.println("None");
            }

            String playAgainStr;
            do {
                System.out.print("(yes/no) Do you want to play again? ");
                playAgainStr = inputReader.nextLine();
            } while(!playAgainStr.equals("yes") && !playAgainStr.equals("no") && !playAgainStr.equals("Yes") && !playAgainStr.equals("No"));

            if (playAgainStr.equals("no") || playAgainStr.equals("No")) {
                System.out.println("Thank you for playing!");
                playAgain = false;
            }
        }

    }
}