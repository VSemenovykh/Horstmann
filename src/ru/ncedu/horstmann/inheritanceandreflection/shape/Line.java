package ru.ncedu.horstmann.inheritanceandreflection.shape;

import ru.ncedu.horstmann.inheritanceandreflection.point.Point;

/**
 * This class Line
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
public class Line extends Shape implements Cloneable{
    private Point from;
    private Point to;

    /**
     * Constructor - creating a new instance with specific values
     * @param from
     * @param to
     */
    public Line(Point from, Point to) {
        super(null);
        this.from = from;
        this.to = to;
        this.p = new Point(
                (from.getX() + to.getX()) / 2,
                (from.getY() + to.getY()) / 2
        );
    }

    /**
     * Method to get center point
     * @return Point
     */
    @Override
    public Point getCenter() {
        return p;
    }
    /**
     * String representation instance this class
     * @return "Line = [pFrom = {@link Shape#p}, pTo = {@link #to}]"
     */

    @Override
    public String toString() {
        return "Line{" +
                "p=" + p +
                ", pTo=" + to +
                '}';
    }

    /**
     * Method for clone this instance
     */
    @Override
    public Line clone() {
        try {
            Line cloned = (Line) super.clone();
            cloned.p = new Point(p.getX(), p.getY());
            cloned.from = new Point(from.getX(), from.getY());
            cloned.to = new Point(to.getX(), to.getY());
            return cloned;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
