package ru.ncedu.horstmann.inheritanceandreflection.point;

import java.util.Objects;

/**
 * This class LabeledPoint
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
 * Exercises 5????
 * Define clone methods for the classes of the preceding exercise.
 * @version 1.0, 6 Jan 2021
 * @author Vladislav Semenovykh
 */
public class LabeledPoint extends Point {
    private String label;
    private Point p;

    /**
     * Constructor - creating a new instance with specific values
     */
    public LabeledPoint(String label, double x, double y){
        super(x,y);
        this.label = label;
    }
    /**
     * Method to get field {@link Point#x}
     * @return x
     */
    public double getX(){
        return super.x;
    }

    /**
     * Method to get field {@link Point#y}
     * @return y
     */
    public double getY(){
        return super.y;
    }

    /**
     * Method to get field {@link #label}
     * @return y
     */
    public String getLabel() {
        return this.label;
    }

    /**
     * Procedure for determination field {@link #label}
     * @param label
     */
    public void setLabel(String label){
        this.label = label;
    }

    /**
     * String representation instance this class
     * @return "LabelePoint = [ Point = [x = {@link Point#x}, y = {@link Point#y}], label = {@link #label}]"
     */
    @Override
    public String toString() {
        return super.toString() + ",[label=" + label + "]";
    }

    /**
     * Method is compare this instance with Object o
     * @param o
     * @return true if this instance == Object o, otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Point)) return false;
        LabeledPoint that = (LabeledPoint) o;
        return Objects.equals(label, that.label);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), label);
    }

    /**
     * Method for clone this instance
     */
    @Override
    public LabeledPoint clone() throws CloneNotSupportedException{
        LabeledPoint labeledPoint = (LabeledPoint) super.clone();
        labeledPoint.p = (Point) p.clone();
        return labeledPoint;
    }
}
