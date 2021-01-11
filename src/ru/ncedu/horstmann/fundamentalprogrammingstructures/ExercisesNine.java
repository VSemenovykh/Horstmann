package ru.ncedu.horstmann.fundamentalprogrammingstructures;

/**
 * This class ExercisesNine
 * Exercises 9
 * Section 1.5.3, “String Comparison” (page 25) has an example of two strings
 * s and t so that s.equals(t) but s != t. Come up with a different example that doesn’t use substring).
 * @version 1.0, 4 Jan 2021
 * @author Vladislav Semenovykh
 */
public class ExercisesNine {
    private String text;
    private String[] result;

    /**
     * Procedure for determination field {@link #text} and {@link #result}
     */
    public void set(String text){
        this.text = text;
        this.result = text.split("[^(A-Za-z)]+");
    }

    public void printNonemptySubstrings(){
        System.out.println("Result: " );
        for(int i = 0; i<result.length; i++)
            System.out.println(result[i]);
    }

    public boolean operatorCompare(String text){
        for(int i = 0; i<result.length; i++)
            if(result[i].compareTo(text) == 0) return true;
        return false;
    }
}
