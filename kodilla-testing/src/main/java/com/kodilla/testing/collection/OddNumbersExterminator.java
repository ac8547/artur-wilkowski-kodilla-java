package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {


    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> evenList = new ArrayList<>();
        for (Integer listOfNumbers : numbers) {
            Integer evenNumber = listOfNumbers;
            if (evenNumber % 2 == 0) {
                evenList.add(evenNumber);
            }
            //System.out.println(evenList);

        }
        return evenList;
    }

}
