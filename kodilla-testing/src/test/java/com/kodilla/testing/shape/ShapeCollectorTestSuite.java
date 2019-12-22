package com.kodilla.testing.shape;


import org.junit.*;

import java.util.ArrayList;
import java.util.List;


public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

        @Test
        public void testAddFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            //When
            shapeCollector.addFigure(new circle(54));

            //Then
            Assert.assertEquals(1, shapeCollector.getFiguresCollection().size());
        }

        @Test
        public void testRemoveFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();

            shapeCollector.addFigure(new circle(54));

            //When
            boolean result = shapeCollector.removeFigure(new circle(54));

            //Then
            Assert.assertEquals(0, shapeCollector.getFiguresCollection().size());
        }

        @Test
        public void testGetFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape circle = new circle(54);
            shapeCollector.addFigure(circle);

            //When
            Shape circles1 = shapeCollector.getFigure(0);
            //Then
            Assert.assertEquals(circle,circles1);
        }

        @Test
        public void testShowFigures() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new circle(54);
            Shape shape1 = new triangle(5,10);
            shapeCollector.addFigure(shape);
            shapeCollector.addFigure(shape1);

            ArrayList<Shape> newList = new ArrayList<>();
            newList.add(shape);
            newList.add(shape1);

            //When
            List<Shape> shapesList = shapeCollector.getFiguresCollection();
            //Then
            Assert.assertEquals(newList.toString(), shapesList.toString());

            shapeCollector.showFigures();
        }


    }