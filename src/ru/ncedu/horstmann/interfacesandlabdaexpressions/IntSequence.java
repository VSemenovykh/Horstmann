package ru.ncedu.horstmann.interfacesandlabdaexpressions;

import java.util.Arrays;
import java.util.NoSuchElementException;

/**
 * This class IntSequence
 * Exercises 4
 * Implement a static of method of the IntSequence class that yields a sequence
 * with the arguments. For example, IntSequence.of(3, 1, 4, 1, 5, 9) yields a
 * sequence with six values. Extra credit if you return an instance of an
 * anonymous inner class.
 *
 * Exercises 5
 * Add a static method with the name constant of the IntSequence class that
 * yields an infinite constant sequence. For example, IntSequence.constant(1)
 * yields values 1 1 1..., ad infinitum. Extra credit if you do this with a
 * lambda expression.
 * @version 1.0, 5 Jan 2021
 * @author Vladislav Semenovykh
 */
public class IntSequence {
    /**
     * Static method which set values
     * @param values
     */
    public static IntSequence of(int... values) {
        return new IntSequence() {
            int[] elementData = Arrays.copyOf(values, values.length);
            int cursor;
          //  @Override
            public int next() {
                if (cursor >= elementData.length)
                    throw new NoSuchElementException();
                else
                    return elementData[cursor++];
            }

          //  @Override
            public boolean hasNext() {
                return cursor < elementData.length;
            }
        };
    }

    /*Exercises 5*/
    /**
     * Static method prints an infinite sequenceStatic
     * @param i
     */
    public static IntSequence constant(int i) {
        return new IntSequence() {
        //    @Override
            public int next() {
                return value;
            }
        //    @Override
            public boolean hasNext() {
                return true;
            }
            final int value = i;
        };
    }

    /**
     * Extra method as lambda expression
     * @param i
     */
    public static void constantExtra(int i){
        Runnable r = () -> {
            while(true){
                System.out.println(i);
            }
        };
        new Thread(r).start();
    }
}
