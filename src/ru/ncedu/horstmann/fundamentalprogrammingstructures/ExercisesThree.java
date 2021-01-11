package ru.ncedu.horstmann.fundamentalprogrammingstructures;

/**
 * This class ExercisesThree
 * Exercises 3
 * Using only the conditional operator, write a program that reads three
 * integers and prints the largest. Repeat with Math.max.
 * @version 1.0, 3 Jan 2021
 * @author Vladislav Semenovykh
 */
public class ExercisesThree {
    private int x;
    private int y;
    private int z;
    private int maxNumber;

    /**
     * Constructor - creating a new instance with specific values
     * @param x
     * @param y
     * @param z
     */
    public ExercisesThree(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * Method of finding the maximum value of the medium x, y and z
     */
    public void maxOperator(){
        if(x>y & x>z){
            this.maxNumber = x;
        }else if(y>x & y>z){
            this.maxNumber = y;
        }else{
            this.maxNumber = z;
        }
    }
    public void printResultMaxOperator(){
        System.out.println("Result maxOperator:" + this.maxNumber);
    }

    /**
     * Method of finding the maximum value of the medium x, y and z using function max
     */
    public void maxOperatorFromMath(){
        if(Math.max(x,y)>Math.max(y,z)){
            this.maxNumber = x;
        }else if(Math.max(x,y)>Math.max(x,z)){
            this.maxNumber = y;
        }else{
            this.maxNumber = z;
        }
    }
    public void printResultMaxFromMath(){
        System.out.println("Result maxOperator:" + this.maxNumber);
    }
}
