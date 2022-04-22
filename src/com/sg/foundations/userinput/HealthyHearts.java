package com.sg.foundations.userinput;

import java.util.Scanner;

import static java.lang.Math.round;

public class HealthyHearts {

    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);

        int age, max;
        double lower, upper;

        System.out.print("What is your age? ");
        age = Integer.parseInt(inputReader.nextLine());
        max = 220 - age;
        lower = max * 0.50;
        upper = max * 0.85;
        System.out.println("Your maximum heart rate should be " + max + " beats per minute.");
        System.out.print("Your target HR Zone is " + round(lower) + " - " + round(upper) + " beats per minute.");
    }
}
