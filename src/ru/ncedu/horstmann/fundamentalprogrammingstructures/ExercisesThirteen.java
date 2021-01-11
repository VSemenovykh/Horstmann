package ru.ncedu.horstmann.fundamentalprogrammingstructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * This class ExercisesThirteen
 * Exercises 13
 * Write a program that prints a lottery combination, picking six distinct
 * numbers between 1 and 49. To pick six distinct numbers, start with an
 * array list filled with 1...49. Pick a random index and remove the element.
 * Repeat six times. Print the result in sorted order.
 * @version 1.0, 4 Jan 2021
 * @author Vladislav Semenovykh
 */
public class ExercisesThirteen {
    private List<Integer> lottery;
    private List<Integer> pickSixNumber;

    /**
     * Method of filling values in the list
     * @return list
     */
    public List fillList(){
        List<Integer> newlottery = new ArrayList<Integer>();
        this.lottery = new ArrayList<Integer>();
        for (int i=1;i<= 49; i++)
             newlottery.add(i);
        this.lottery.addAll(newlottery);
        return this.lottery;
    }

    /**
     * Method for pick six distinct numbers
     * @return list from six numbers
     */
    public List pickSixNumber(){
        List<Integer> newPickSixNumber = new ArrayList<Integer>();
        Random random = new Random();
        int iter = 0;
        while(iter < 6){
            int index = random.nextInt(lottery.size());
            newPickSixNumber.add(lottery.get(index));
            lottery.remove(lottery.get(index));
            iter++;
        }
      //  Collections.sort(newPickSixNumber);
        newPickSixNumber.sort((x,y) -> (x-y)); //Lambda Expression
        this.pickSixNumber = newPickSixNumber;
        return this.pickSixNumber;
    }

    public void printPickSixNumber(){
        System.out.println("The Lottery: " + fillList());
        System.out.println("The Lottery combination: " + pickSixNumber());
    }
}
