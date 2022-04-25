package com.m3.JavaBasics;

import java.util.Scanner;

public class HealthyHearts {

    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        int age, maxHR;
        long lowerHR, upperHR;

        // Get the age of the user
        System.out.print("What is your age? ");
        age = Integer.parseInt(inputReader.nextLine());

        // Calculate the maximum heart rate and display it
        maxHR = 220 - age;
        System.out.println("Your maximum heart rate should be " + maxHR +
                " beats per minute");

        // Calculate the target HR Zone and display it
        lowerHR = Math.round(maxHR * 0.50);
        upperHR = Math.round(maxHR * 0.85);
        System.out.println("Your target HR Zone is " + lowerHR + " - " + upperHR +
                " beats per minute");
    }
}
