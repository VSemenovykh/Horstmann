package ru.ncedu.horstmann.fundamentalprogrammingstructures;

/**
 * This class ExercisesFour
 * Exercises 4
 * Write a program that prints the smallest and largest positive double values.
 * Hint: Look up Math.nextUp in the Java API.
 * @version 1.0, 3 Jan 2021
 * @author Vladislav Semenovykh
 */
public class ExercisesFour {
    private double minValue;
    private double maxValue;
    private double value;

    /**
     * Constructor - creating a new instance with specific values
     * @param value
     */
    public ExercisesFour(double value){
        if(value >= 0) this.value = value;
        else System.out.println("value is negative");
    }

    /**
     * Method where using functions nextDown and nextUp
     */
    public void operatorNextUpAndNextDown(){
        this.minValue = Math.nextDown(value);
        this.maxValue = Math.nextUp(value);
    }

    public void printRefultOperator(){
        System.out.println("Result operatorNextUpAndNextDown:");
        System.out.println("nextDown: ("+value+") = "+minValue);
        System.out.println("nexUp: ("+value+") = "+maxValue);
    }
}
