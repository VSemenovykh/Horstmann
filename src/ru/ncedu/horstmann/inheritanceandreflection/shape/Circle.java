package ru.ncedu.horstmann.inheritanceandreflection.shape;

import ru.ncedu.horstmann.inheritanceandreflection.point.Point;

/**
 * This class Circle
 * Exercises 4
 * Define an abstract class Shape with an instance variable of class Point, a
 * constructor, a concrete method public void moveBy(double dx, double dy) that
 * moves the point by the given amount, and an abstract method public Point
 * getCenter(). Provide concrete subclasses Circle, Rectangle, Line with constructors
 * public Circle(Point center, double radius), public Rectangle(Point topLeft, double width,
 * double height), and public Line(Point from, Point to).
 *
 * Exercises 5
 * Define clone methods for the classes of the preceding exercise.
 * @version 1.0, 6 Jan 2021
 * @author Vladislav Semenovykh
 */
public class Circle extends Shape implements Cloneable{
    private double radius;

    /**
     * Constructor - creating a new instance with specific values
     * @param p
     * @param radius
     */
    public Circle(Point p, double radius) {
        super(p);
        this.radius = radius;
    }

    /**
     * Method to get center point
     * @return point
     */
    @Override
    public Point getCenter() {
        return this.p;
    }

    /**
     * String representation instance this class
     * @return "Circle = [radius = {@link #radius}, p = {@link Shape#p}]"
     */
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", p=" + p +
                '}';
    }

    /**
     * Method for clone this instance
     */
    @Override
    public Circle clone() {
        try {
            Circle cloned = (Circle) super.clone();
            cloned.p = new Point(p.getX(), p.getY());
            return cloned;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

}

