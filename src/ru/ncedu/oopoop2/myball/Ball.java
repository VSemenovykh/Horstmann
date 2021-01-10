package ru.ncedu.oopoop2.myball;

import java.util.Objects;

/**
 * This class Ball
 * Override methods equals and hashcode
 * @version 2.0, 3 Jan 2021
 * @author Vladislav Semenovykh
 */
public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    /**
     * Constructor - creating a new instance with specific values
     * @param x
     * @param y
     * @param radius
     * @param speed
     * @param direction
     */
    public Ball(float x, float y, int radius, int speed, int direction){
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = (float)(speed*Math.cos(direction));
        this.yDelta = (float)(speed*Math.sin(direction));
    }

    /**
     * Method to get values field {@link #x}
     * @return x
     */
    public float getX(){
        return this.x;
    }

    /**
     * Procedure for determination field {@link #x}
     * @parem x
     */
    public void setX(float x){
        this.x = x;
    }

    /**
     * Method to get values field {@link #y}
     * @return y
     */
    public float getY() {
        return this.y;
    }

    /**
     * Procedure for determination field {@link #y}
     * @param y
     */
    public void setY(float y){
        this.y = y;
    }

    /**
     * Method to get values radius {@link #radius}
     * @return radius
     */
    public int getRaadius(){
        return this.radius;
    }

    /**
     * Procedure for determination producer {@link #radius}
     * @param radius
     */
    public void setRadius(int radius){
        this.radius = radius;
    }

    /**
     * Method to get values xDelta {@link #xDelta}
     * @return delataX
     */
    public float getDeltaX(){
        return this.xDelta;
    }

    /**
     * Procedure for determination field {@link #xDelta}
     * @param xDelta
     */
    public void setxDelta(float xDelta){
        this.xDelta = xDelta;
    }

    /**
     * Method to get values yDelta {@link #yDelta}
     * @return deltaY
     */
    public float getDeltaY(){
        return this.yDelta;
    }

    /**
     * Procedure for determination field {@link #yDelta}
     * @param yDelta
     */
    public void setyDelta(float yDelta){
        this.yDelta = yDelta;
    }

    /**
     * Method move the ball one step
     * @return x + deltaX Move the ball one step deltaX
     * @return y + deltay Move the ball one step deltaY
     */
    public void move(){
        this.x += getDeltaX();
        this.y += getDeltaY();
    }

    /**
     * Method reverses the direction of horizontal movement of the ball
     * @return deltaX = -deltaX
     */
    public void reflectHorizontal(){
        this.xDelta = -getDeltaX();
    }

    /**
     * Method reverses the direction of vertical movement of the ball
     * @return deltaY = -deltaY
     */
    public void refletVertical(){
        this.yDelta = -getDeltaY();
    }

    /**
     * String representation instance this class
     * @return "Ball[({@link #x},{@link #y}), speed=({@link #xDelta}, {@link #yDelta})]"
     */
    public String toString() {
        return "Ball[(" + this.x +
                    "," + this.y + ")" +
            ", speed=(" + this.xDelta +
                    "," + this.yDelta + ")]";
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
        Ball ball = (Ball) o;
        return  Float.compare(ball.x, x) == 0 &&
                Float.compare(ball.y, y) == 0 &&
                radius == ball.radius &&
                Float.compare(ball.xDelta, xDelta) == 0 &&
                Float.compare(ball.yDelta, yDelta) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, radius, xDelta, yDelta);
    }
}
