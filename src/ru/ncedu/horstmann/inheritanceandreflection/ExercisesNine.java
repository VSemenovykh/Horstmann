package ru.ncedu.horstmann.inheritanceandreflection;

import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.StringJoiner;

/**
 * This class ExercisesNine
 * Exercises 9
 * Write a “universal” toString method that uses reflection to yield a string with all
 * instance variables of an object. Extra credit if you can handle cyclic references.
 * @version 1.0, 10 Jan 2021
 * @author Vladislav Semenovykh
 */
public class ExercisesNine {
    /**
     * @param o
     * @return “universal” toString
     */
    public String toString(Object o) throws Exception {
        Class<?> clazz = o.getClass();
        StringJoiner joiner = new StringJoiner(",", clazz.getName() + "{", "}");
        for (Field field : clazz.getDeclaredFields()) {
            field.setAccessible(true);
            joiner.add(field.getName() + "=" + field.get(o).toString());
        }
        return joiner.toString();
    }
}
