package ru.ncedu.horstmann.fundamentalprogrammingstructures;

/**
 * This class ExercisesEight
 * Exercises 8
 * Write a program that reads a string and prints all of its nonempty
 * substrings.
 * @version 1.0, 4 Jan 2021
 * @author Vladislav Semenovykh
 */
public class ExercisesEight {
    private String text;
    private String[] result;

    /**
     * Procedure for determination field {@link #text} and {@link #result}
     * @param text
     */
    public void setText(String text){
        this.text = text;
        this.result = text.split("[^(A-Za-z)]+");
    }

    public void printNonemptySubstrings(){
        System.out.println("Result: " );
        for(int i = 0; i<result.length; i++)
            System.out.println(result[i]);
    }
}
