package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;
import java.util.*;

public class CollectionTestSuite {


    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after(){
        System.out.println("Test Case: end");
    }


    @Test
    public void testOddNumbersExterminatorEmptyList(){

        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        ArrayList<Integer> oddList = new ArrayList<Integer>();
        oddList.add(5);
        oddList.add(7);

        oddNumbersExterminator.exterminate(oddList);
        if (oddNumbersExterminator.evenList.isEmpty()){
            System.out.println("the list is empty");
            }else
            System.out.println("not empty");
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        ArrayList<Integer> listOfNumbers = new ArrayList<Integer>();
        listOfNumbers.add(10);
        listOfNumbers.add(6);
        listOfNumbers.add(5);
        listOfNumbers.add(12);

        oddNumbersExterminator.exterminate(listOfNumbers);

        for (int i=0; i<oddNumbersExterminator.evenList.size(); i++){
            Assert.assertTrue("false: ", oddNumbersExterminator.evenList.get(i) % 2  == 0);

        }
    }


}

