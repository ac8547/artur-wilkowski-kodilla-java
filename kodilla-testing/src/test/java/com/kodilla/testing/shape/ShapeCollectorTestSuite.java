package com.kodilla.testing.shape;

import com.kodilla.testing.shape.circle;
import org.junit.*;


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
    public void testAddFigures(){
        Shape circle = new circle();
        ShapeCollector shapeCollector = new ShapeCollector(circle);
        shapeCollector.addFigure(circle);

        Assert.assertEquals(1, shapeCollector.getListQuantity());

    }

    @Test
    public void removeFigure(){
        Shape triangle = new triangle();
        ShapeCollector shapeCollector = new ShapeCollector(triangle);
        shapeCollector.addFigure(triangle);

        boolean result = shapeCollector.removeFigure(triangle);

        Assert.assertTrue(result);
    }

    @Test
    public void getFigure() {
        Shape square = new square();
        ShapeCollector shapeCollector = new ShapeCollector(square);
        shapeCollector.addFigure(square);

        Shape theFigure;
        theFigure = shapeCollector.shape;

        Assert.assertEquals(theFigure, shapeCollector.getFigure(0));
    }

    @Test
    public void TestShowFigures() {

        Shape circle = new circle();
        ShapeCollector shapeCollector_1 = new ShapeCollector(circle);
        shapeCollector_1.addFigure(circle);

        Shape square = new square();
        ShapeCollector shapeCollector = new ShapeCollector(square);
        shapeCollector.addFigure(square);

        Shape triangle = new triangle();
        ShapeCollector shapeCollector2 = new ShapeCollector(triangle);
        shapeCollector2.addFigure(triangle);

        shapeCollector.showFigures();

        //Assert.assertEquals("circle",shapeCollector.showFigures());



    }


}
