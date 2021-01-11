package ru.ncedu.horstmann.objectorientedprogramming;

/**
 * This class Car
 * Exercises 8
 * Implement a class Car that models a car traveling along the x-axis, consuming
 * gas as it moves. Provide methods to drive by a given number of
 * miles, to add a given number of gallons to the gas tank, and to get the
 * current distance from the origin and fuel level. Specify the fuel efficiency
 * (in miles/gallons) in the constructor.
 * @version 1.0, 8 Jan 2021
 * @author Vladislav Semenovykh
 */
public class Car {
    private float x;
    private float fuelEfficency;
    private float fuelLevel =100;

    /**
     * Constructor - creating a new instance
     * @param fuelEfficency
     * @param fuelLevel
     */
    public Car(float fuelLevel, float fuelEfficency) {
        // Init position
        this.x = 0;
        this.fuelLevel = this.fuelLevel;
        this.fuelEfficency = fuelEfficency;
    }

    /**
     * Method a given number of miles and print "Fuel exhausted" or "Good driver"
     * @param x
     */
    public void Drive(float x)    {
        if (fuelLevel <= 0)        {
            System.out.println("Fuel exhausted");
            return;
        }
        this.x += x;
        this.fuelLevel -= x* fuelEfficency;
        System.out.println("Good driver");
    }

    /**
     * Procedure for determination field {@link #fuelLevel}
     * @param gal
     */
    public void addGallons(float gal){
        this.fuelLevel += gal;
        if (fuelLevel >= 100)
            fuelLevel = 100;
    }

    /**
     * Method to get field {@link #x}
     * @return distance
     */
    public float getDistance(){
        return Math.abs(this.x);
    }

    /**
     * Method to get field {@link #fuelLevel}
     * @return fuel leve
     */
    public float getFuelLevel(){
        return this.fuelLevel;
    }

    /**
     * String representation instance this class
     * @return "Car = [x = {@link #x}, fuelEfficency = {@link #fuelEfficency}, fuelLevel = {@link #fuelLevel}]"
     */
    @Override
    public String toString() {
        return "Car[" +
                "x=" + x +
                ", fuelEfficency=" + fuelEfficency +
                ", fuelLevel=" + fuelLevel +
                ']';
    }
}
