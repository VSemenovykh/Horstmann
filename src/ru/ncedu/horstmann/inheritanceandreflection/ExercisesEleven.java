package ru.ncedu.horstmann.inheritanceandreflection;

import java.lang.reflect.Field;

/**
 * This class ExercisesEleven
 * Exercises 11
 * Write the “Hello, World” program, using reflection to look up the out field of
 * java.lang.System and using invoke to call the println method.
 * @version 1.0, 10 Jan 2021
 * @author Vladislav Semenovykh
 */
public class ExercisesEleven {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("java.lang.System");
        Field field = clazz.getDeclaredField("out");
        field.getType().getMethod("println", String.class)
                .invoke(field.get(null), "Hello, World");
    }
}
