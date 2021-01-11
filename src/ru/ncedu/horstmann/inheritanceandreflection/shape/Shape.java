package ru.ncedu.horstmann.inheritanceandreflection.shape;

import ru.ncedu.horstmann.inheritanceandreflection.point.Point;

/**
 * This class Shape
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
public abstract class Shape extends Point implements Cloneable{
    protected Point p;

    /**
     * Constructor - creating a new instance with specific values
     * @see #Shape(Point)
     */
    public Shape(){
        p = new Point(0.0, 0.0);
    }
   /**
    * Constructor - creating a new instance with specific values
    * @param p
    */
   public Shape(Point p){
        this.p = p;
    }

   /**
    * Method to get moves the point
    * @param dx
    * @param dy
    */
   public void moveBy(double dx, double dy){
        p = new Point(p.getX() + dx, p.getY() + dy);
    }

   /**
    *Abstract method to get center point
    */
    public abstract Point getCenter();

    /**
     * Method for clone this instance
     */
    @Override
    public Shape clone() throws CloneNotSupportedException{
        return (Shape) super.clone();
    }

    public class Rectangle extends Shape implements Cloneable{
        private double width;
        private double height;

        /**
         * Constructor - creating a new instance with specific values
         * @param topLeft
         * @param width
         * @param height
         */
        public Rectangle(Point topLeft, double width, double height) {
            super(topLeft);
            this.width = width;
            this.height = height;
        }

        /**
         * Method to get center point
         * @return point
         */
        @Override
        public Point getCenter() {
            return new Point((p.getX() + width) / 2, (p.getY() + height) / 2);
        }

        /**
         * String representation instance this class
         * @return "Rectangle = [width = {@link #width}, height = {@link #height}, p = {@link Shape#p}]"
         */
        @Override
        public String toString() {
            return "Rectangle{" +
                    "width=" + width +
                    ", height=" + height +
                    ", p=" + p +
                    '}';
        }

        /**
         * Method for clone this instance
         */
        @Override
        public ru.ncedu.horstmann.inheritanceandreflection.shape.Rectangle clone() {
            try {
                ru.ncedu.horstmann.inheritanceandreflection.shape.Rectangle cloned = (ru.ncedu.horstmann.inheritanceandreflection.shape.Rectangle) super.clone();
                cloned.p = new Point(p.getX(), p.getY());
                return cloned;
            } catch (CloneNotSupportedException e) {
                return null;
            }
        }
    }
}
