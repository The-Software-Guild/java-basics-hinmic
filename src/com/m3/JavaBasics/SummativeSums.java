package com.m3.JavaBasics;

public class SummativeSums {

    public static void main(String[] args) {
        int[] array1 = {1, 90, -33, -55, 67, -16, 28, -55, 15};
        int[] array2 = {999, -60, -77, 14, 160, 301};
        int[] array3 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130,
                140, 150, 160, 170, 180, 190, 200, -99};

        System.out.println("#1 Array Sum: " + summativeSums(array1));
        System.out.println("#2 Array Sum: " + summativeSums(array2));
        System.out.println("#3 Array Sum: " + summativeSums(array3));
    }

    public static int summativeSums(int[] array) {
        int sum = 0;

        // Add all the integers in the array
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum;
    }
}
