package ru.ncedu.horstmann.inheritanceandreflection.point;

import java.util.Objects;

/**
 * This class Point
 * Exercises 1
 * Define a class Point with a constructor public Point(double x, double y) and
 * accessor methods getX, getY. Define a subclass LabeledPoint with a constructor
 * public LabeledPoint(String label, double x, double y) and an accessor method
 * getLabel.
 *
 * Exercises 2
 * Define toString, equals, and hashCode methods for the classes of the preceding
 * exercise.
 *
 * Exercises 3
 * Make the instance variables x and y of the Point class in Exercise 1 protected.
 * Show that the LabeledPoint class can access these variables only in LabeledPoint
 * instances.
 *
 * Exercises 5
 * Define clone methods for the classes of the preceding exercise.
 * @version 1.0, 6 Jan 2021
 * @author Vladislav Semenovykh
 */
public class Point implements Cloneable{
    protected double x;
    protected double y;

    /**
     * Constructor - creating a new instance with specific values
     *  @see #Point(double, double)
     */
    public Point(){
        this.x = 0;
        this.y = 0;
    }

    /**
     * Constructor - creating a new instance with specific values
     * @param x
     * @param y
     * @see #Point()
     */
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    /**
     * Method to get field {@link #x}
     * @return x
     */
    public double getX(){
        return this.x;
    }

    /**
     * Procedure for determination field {@link #x}
     * @param x
     */
    public void setX(double x){
        this.x = x;
    }

    /**
     * Method to get field {@link #y}
     * @return y
     */
    public double getY(){
        return this.y;
    }

    /**
     * Procedure for determination field {@link #y}
     * @param y
     */
    public void setY(double y){
        this.y = y;
    }

    /**
     * String representation instance this class
     * @return "Point = [x = {@link #x}, y = {@link #y}]"
     */
    @Override
    public String toString() {
        return getClass().getName()+ " = [x=" + x + ", y=" + y + "]";
    }

    /**
     * Method is compare this instance with Object o
     * @param o
     * @return true if this instance == Object o, otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Double.compare(point.x, x) == 0 &&
                Double.compare(point.y, y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    /**
     * Method for clone this instance
     */
    @Override
    public Point clone() throws CloneNotSupportedException{
        return (Point) super.clone();
    }
}
