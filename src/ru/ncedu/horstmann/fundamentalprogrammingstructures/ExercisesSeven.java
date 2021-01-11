package ru.ncedu.horstmann.fundamentalprogrammingstructures;

import static java.lang.Math.abs;

/**
 * This class ExercisesSeven
 * Exercises 7
 * Write a program that reads in two integers between 0 and 4294967295,
 * stores them in int variables, and computes and displays their unsigned
 * sum, difference, product, quotient, and remainder. Do not convert them
 * to long values.
 * @version 1.0, 4 Jan 2021
 * @author Vladislav Semenovykh
 */
public class ExercisesSeven {
    private int x;
    private int y;

    public ExercisesSeven(int x, int y){
        this.x = x;
        this.y = y;
    }
    public String sumXY(){
        return Integer.toUnsignedString((int)abs(x+y)).toString();
    }
    public String differentXY(){
        return Integer.toUnsignedString((int)abs(x-y)).toString();
    }
    public String productXY(){
        return Integer.toUnsignedString((int)abs(x*y)).toString();
    }
    public String quotientXY(){
        try {
            return Integer.toUnsignedString((int)abs(x/y)).toString();
        }catch (ArithmeticException e){
            System.out.println("y="+y);
        }
        return "-1";
    }
    public String remainderXY(){
        return Integer.toUnsignedString((int)abs(x%y)).toString();
    }
    public void print(){
        System.out.println("Sum " + x + " and " + y + " : " + sumXY());
        System.out.println("Different " + x + " and " + y + " : " + differentXY());
        System.out.println("Product " + x + " and " + y + " : " +  productXY());
        System.out.println("Quotient " + x + " and " + y + " : " +  quotientXY());
        System.out.println("Remainder " + x + " and " + y + " : " +  remainderXY());
    }
}
