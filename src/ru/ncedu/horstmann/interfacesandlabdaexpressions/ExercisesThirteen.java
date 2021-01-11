package ru.ncedu.horstmann.interfacesandlabdaexpressions;

/**
 * This class ExercisesThirteen
 * Exercises 13
 * Write a method that takes an array of Runnable instances and returns a
 * Runnable whose run method executes them in order. Return a lambda
 * expression.
 * @version 1.0, 10 Jan 2021
 * @author Vladislav Semenovykh
 */
public class ExercisesThirteen {
    /**
     * Method that takes an array of Runnable instances and returns a Runnable
     * whose run method executes them in order. Return a lambda
     * @param runnables
     * @return Runnable
     */
    public Runnable get(Runnable[] runnables) {
        return () -> {
            for (Runnable r : runnables)
                r.run();
        };
    }
}
