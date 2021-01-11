package ru.ncedu.horstmann.fundamentalprogrammingstructures;

import java.util.Random;

/**
 * This class ExFive
 * Exercises 5
 * What happens when you cast a double to an int that is larger than the
 * largest possible int value? Try it out.
 * @version 1.0, 3 Jan 2021
 * @author Vladislav Semenovykh
 */
public class ExercisesFive {
    public static void main(String[] args) throws CloneNotSupportedException {
        int max = 10000;
        int min = 1000;
        Random rand = new Random();
        double randomDouble = Integer.MAX_VALUE + rand.nextInt((max - min) + 1);
        System.out.println("before: " +randomDouble);
        randomDouble = (double)Integer.MAX_VALUE + (double)rand.nextInt((max - min) + 1);
        System.out.println("after: " + randomDouble);
    }
}
