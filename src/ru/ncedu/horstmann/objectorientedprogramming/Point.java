package ru.ncedu.horstmann.objectorientedprogramming;

/**
 * This class Point
 * Exercises 5
 * Implement an immutable class Point that describes a point in the plane. Provide a constructor
 * to set it to a specific point, a no-arg constructor to set it to the origin, and
 * methods getX, getY, translate, and scale. The translate method moves the point by a given
 * amount in x- and y-direction. The scale method scales both coordinates by a given factor.
 * Implement these methods so that they return new points with the results. For example,
 * Point p = new Point(3, 4).translate(1, 3).scale(0.5); should set p to a point with coordinates (2, 3.5).
 * @version 1.0, 5 Jan 2021
 * @author Vladislav Semenovykh
 */
public final class Point{
    private final double x;
    private final double y;

    /**
     * Constructor - creating a new instance with specific values
     * @see #Point(double, double)
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
     * Method to get field {@link #y}
     * @return y
     */
    public double getY(){
        return this.y;
    }

    /**
     * Method translate
     * @return point
     */
    public Point translate(double dx, double dy){
        return new Point(getX() + dx, getY() + dy);
    }

    /**
     * Method scale
     * @return point
     */
    public Point scale(double scale){
        return new Point(getX() * scale, getY() * scale);
    }

    /**
     * Method print result
     */
    public void printResult(){
        System.out.println("New coordinates point: (" + x + ", " + y + ") ");
    }
}
