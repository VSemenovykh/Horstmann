package ru.ncedu.horstmann.interfacesandlabdaexpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

/**
 * This class LuckySort
 * Exercises 8
 * Implement the method void luckySort(ArrayList<String> strings, Comparator<String> comp)
 * that keeps calling Collections.shuffle on the array list until the elements are in increasing order,
 * as determined by the comparator.
 * @version 1.0, 5 Jan 2021
 * @author Vladislav Semenovykh
 */
public class LuckySort {
    /**
     * Keeps calling Collections.shuffle on the array list until the elements are in increasing order,
     * as determined by the comparator
     * @param strings
     * @param comparator
     */
    public void luckySort(ArrayList<String> strings, Comparator<String> comparator){
        while (!strings.stream().sorted(comparator).collect(Collectors.toList()).equals(strings)){
            Collections.shuffle(strings);
            System.out.println(strings);
        }
    }
}
