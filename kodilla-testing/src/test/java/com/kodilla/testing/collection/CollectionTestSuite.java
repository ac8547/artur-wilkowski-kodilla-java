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

        Assert.assertEquals(0,oddNumbersExterminator.exterminate(oddList).size());

    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        ArrayList<Integer> listOfNumbers = new ArrayList<Integer>();
        listOfNumbers.add(10);
        listOfNumbers.add(6);
        listOfNumbers.add(5);
        listOfNumbers.add(12);

        Assert.assertEquals(3, oddNumbersExterminator.exterminate(listOfNumbers).size() );
    }
}

