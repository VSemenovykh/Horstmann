package ru.ncedu.horstmann.fundamentalprogrammingstructures;

/**
 * This class ExercisesTwo
 * Exercises 2
 * Write a program that reads an integer angle (which may be positive or
 * negative) and normalizes it to a value between 0 and 359 degrees. Try
 * it first with the % operator, then with floorMod.
 * @version 1.0, 3 Jan 2021
 * @author Vladislav Semenovykh
 */
public class ExercisesTwo {
    private int angle;
    private int div;

    /**
     * Constructor - creating a new instance with specific values
     * @param angle
     * @param div
     */
    public ExercisesTwo(int angle, int div){
        if(Math.abs(angle) < 0 | Math.abs(angle) > 359){
            System.out.println("Enter number in range 0-359");
        }else{
            this.angle = angle;
            this.div = div;
        }
    }

    /**
     * @return values after operator %
     */
    public int operatorOne(){
           return (this.angle % div);
    }

    public void printResultOperatorOne(){
           System.out.println("Result operatorOne where %: " + operatorOne());
    }

    /**
     * @return values after function floorMod
     */
    public int operatorTwo(){
        return Math.floorMod(this.angle,div);
    }

    public void printResultOperatorTwo(){
        System.out.println("Result operatorTwo where floorMod: " + operatorTwo());
    }
}
