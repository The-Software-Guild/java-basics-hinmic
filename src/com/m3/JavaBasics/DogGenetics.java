package com.m3.JavaBasics;

import java.util.Scanner;
import java.util.Random;

public class DogGenetics {

    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        Random rng = new Random();
        int remainChance = 100;
        int randomNumber;
        String dogName;
        String[] dogBreeds = {"St. Bernard", "Chihuahua", "Dramatic RedNosed Asian Pug",
                "Common Cur", "King Doberman"};

        // Get the name of the dog from input
        System.out.print("What is your dog's name? ");
        dogName = inputReader.nextLine();

        // Print the DNA background report
        System.out.println("Well then, I have this highly reliable report on "
                + dogName + "'s prestigious background right here.\n");
        System.out.println(dogName + " is:\n");
        // Create random percentage of each dog breed
        for(int i = 0; i < dogBreeds.length - 1; i++) {
            randomNumber = rng.nextInt(remainChance) + 1;
            remainChance -= randomNumber;
            System.out.println(randomNumber + "% " + dogBreeds[i]);
        }
        System.out.println(remainChance + "% " + dogBreeds[dogBreeds.length - 1] + "\n");

        System.out.println("Wow, that's QUITE the dog!");
    }
}