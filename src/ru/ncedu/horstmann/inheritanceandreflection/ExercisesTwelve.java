package ru.ncedu.horstmann.inheritanceandreflection;

import java.lang.reflect.Method;

/**
 * This class ExercisesTwelve
 * Exercises 12
 * Measure the performance difference between a regular method call and a method
 * сall via reflection.
 * @version 1.0, 10 Jan 2021
 * @author Vladislav Semenovykh
 */
public class ExercisesTwelve {
    private static final String STR = "aliwuiweubw48ghq3948hg948gh9ghpw9g48p498ghpwghP948GHPhgpW984HGP984hgp98WH4GP94";
    private static final int ITERATIONS = 100_000_000;

    public static void main(String[] args) throws Exception {
        long start = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++)
            STR.indexOf("484");
        System.out.printf("%6s ms - regular method call\n", System.currentTimeMillis() - start);


        Method method = String.class.getMethod("indexOf", String.class);
        start = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++)
            method.invoke(STR, "484");
        System.out.printf("%6s ms - a method call via reflection\n", System.currentTimeMillis() - start);
    }
}
