package ru.ncedu.horstmann.fundamentalprogrammingstructures;

import java.util.Random;

/**
 * This class ExerciseTen
 * Exercises 10
 * Write a program that produces a random string of letters and digits
 * by generating a random long value and printing it in base 36.
 * @version 1.0, 4 Jan 2021
 * @author Vladislav Semenovykh
 */
public class ExercisesTen {
    static final int BASE = 36;
    static final String LETTERS_AND_DIGITS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    /**
     * Method for generating a random string length 36
     * @return random string
     */
    public String generateString(){
        StringBuffer sb = new StringBuffer();
        Random random = new Random();
        for(int i = 0; i < this.BASE; i++) {
            int index = random.nextInt(LETTERS_AND_DIGITS.length());
            char randomChar = LETTERS_AND_DIGITS.charAt(index);
            sb.append(randomChar);
        }
        return sb.toString();
    }

    public void printGenerateString(){
        System.out.println("Random String is: " + generateString());
        System.out.println("Length string: " + generateString().length());
    }
}
