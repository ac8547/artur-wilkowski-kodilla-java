package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    private ArrayList<Integer> evenList;

    public OddNumbersExterminator(){
        evenList = new ArrayList<Integer>();
    }


public ArrayList<Integer> exterminate(ArrayList<Integer> numbers){
    for (Integer listOfNumbers : numbers){
        Integer evenNumber = listOfNumbers;
        if (evenNumber % 2 == 0){
            evenList.add(evenNumber);
        }
    }
            return evenList;
    }

}
