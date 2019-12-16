package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    ArrayList<Integer> evenList;

    public OddNumbersExterminator(){
        evenList = new ArrayList<Integer>();
    }

public void exterminate(ArrayList<Integer> numbers){
    for (Integer listOfNumbers : numbers){
        Integer evenNumber = listOfNumbers;
        if (evenNumber % 2 == 0){
            evenList.add(evenNumber);
        }


    }

    }

}
