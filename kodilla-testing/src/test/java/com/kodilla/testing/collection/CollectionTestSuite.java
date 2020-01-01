package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite {


    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }


    @Test
    public void testOddNumbersExterminatorEmptyList() {

        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        ArrayList<Integer> oddList = new ArrayList<Integer>();

        Assert.assertEquals(0, oddNumbersExterminator.exterminate(oddList).size());

    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        listOfNumbers.add(10);
        listOfNumbers.add(6);
        listOfNumbers.add(5);
        listOfNumbers.add(12);

        ArrayList<Integer> expectedNumbers = new ArrayList<>();
        expectedNumbers.add(10);
        expectedNumbers.add(6);
        expectedNumbers.add(12);

        Assert.assertEquals(expectedNumbers.get(0), oddNumbersExterminator.exterminate(listOfNumbers).get(0));
        Assert.assertEquals(expectedNumbers.get(1), oddNumbersExterminator.exterminate(listOfNumbers).get(1));
        Assert.assertEquals(expectedNumbers.get(2), oddNumbersExterminator.exterminate(listOfNumbers).get(2));

        /*

        for (int i = 0; i < oddNumbersExterminator.exterminate(listOfNumbers).size(); i++) {
            Assert.assertTrue("false: ", oddNumbersExterminator.exterminate(listOfNumbers).get(i) % 2 == 0);


         */

        }

    }


