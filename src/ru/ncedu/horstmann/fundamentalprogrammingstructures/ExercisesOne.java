package ru.ncedu.horstmann.fundamentalprogrammingstructures;

/**
 * This class ExercisesOne
 * Exercises 1
 * Write a program that reads an integer and prints it in binary, octal, and
 * hexadecimal. Print the reciprocal as a hexadecimal floating-point number.
 * @version 1.0, 3 Jan 2021
 * @author Vladislav Semenovykh
 */
public class ExercisesOne {
    private int dec;

    /**
     * Constructor - creating a new instance with specific values
     * @see #ExercisesOne(int)
     */
    public ExercisesOne(){}

    /**
     * Constructor - creating a new instance with specific values
     * @see #ExercisesOne()
     */
    public ExercisesOne(int dec){
        this.dec = dec;
    }

    public void printAfter(){
        System.out.println("binary: " + Integer.toBinaryString(dec));
        System.out.println("Octal: " + Integer.toOctalString(dec));
        System.out.println("hexadecimal: " + Integer.toHexString(dec));
    }

    public void printReciprocal(){
        System.out.println("Reciprocal: " + Math.pow(Double.parseDouble(Integer.toHexString(dec)), (double)-1));
    }
}
