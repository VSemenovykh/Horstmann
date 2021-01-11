package ru.ncedu.horstmann.inheritanceandreflection;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/**
 * This class ExercisesTen
 * Exercises 10
 * Use the MethodPrinter program in Section 4.5.1, “Enumerating Class
 * Members,” on p. 160 to enumerate all methods of the int[] class. Extra credit if
 * you can identify the one method (discussed in this chapter) that is wrongly
 * described.
 * @version 1.0, 10 Jan 2021
 * @author Vladislav Semenovykh
 */
public class ExercisesTen {
    /**
     * @param className
     */
    public void printMethods(String className) {
        Class<?> cl = null;
        try {
            cl = Class.forName(className);
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + className);
        }
        while (cl != null) {
            for (Method m : cl.getDeclaredMethods()) {
                System.out.println(
                        Modifier.toString(m.getModifiers()) + " " + m.getReturnType().getCanonicalName()
                                + " " + m.getName() + Arrays.toString(m.getParameters()));
            }
            cl = cl.getSuperclass();
        }
    }
}
