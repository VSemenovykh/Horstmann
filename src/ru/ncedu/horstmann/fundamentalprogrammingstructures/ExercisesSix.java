package ru.ncedu.horstmann.fundamentalprogrammingstructures;

import java.math.BigInteger;
import java.lang.*;

/**
 * This class ExercisesSix
 * Exercises 6
 * Write a program that computes the factorial n! = 1 × 2 × . . . × n, using
 * BigInteger. Compute the factorial of 1000.
 * @version 1.0, 3 Jan 2021
 * @author Vladislav Semenovykh
 */
public class ExercisesSix {
    private int n;

    /**
     * Constructor - creating a new instance with specific values
     * @param n
     */
    public ExercisesSix(int n){
        this.n = n;
    }

    /**
     * Method to get value factorial
     * @return factorial
     */
    public BigInteger factorialExercisesSix(){
        BigInteger bi = BigInteger.ONE;
        for (int i = 1; i < n; i++)
            bi = bi.add(calculate(BigInteger.valueOf(i), i));
        return bi;
    }
    /**
     * Method fot calculate factorial
     * @param bi
     * @param n
     * @return value object BigInteger
     */
    public BigInteger calculate(BigInteger bi, int n) {
        while(n > 0){
            BigInteger temp = BigInteger.valueOf(n);
            bi = bi.multiply(temp);
            n--;
        }
        return bi;
    }

    public void print(){
        System.out.println("Factorial(" + n + ")= " + factorialExercisesSix());
    }
}
