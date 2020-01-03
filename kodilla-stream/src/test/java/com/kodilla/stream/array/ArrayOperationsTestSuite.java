package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage(){

        int[] numbers = {2,3,4,5};

        Assert.assertEquals(3.5, ArrayOperations.getAverage(numbers), 001);

    }

}
