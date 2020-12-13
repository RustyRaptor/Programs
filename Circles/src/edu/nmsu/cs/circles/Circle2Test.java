package edu.nmsu.cs.circles;

/***
 * Example JUnit testing class for Circle2 (and Circle)
 *
 * - must have your classpath set to include the JUnit jarfiles - to run the test do: java
 * org.junit.runner.JUnitCore Circle2Test - note that the commented out main is another way to run
 * tests - note that normally you would not have print statements in a JUnit testing class; they are
 * here just so you see what is happening. You should not have them in your test cases.
 ***/

import org.junit.*;

public class Circle2Test {
    // Data you need for each test case
    private Circle2 circle2;

    //
    // Stuff you want to do before each test case
    //
    @Before
    public void setup() {
        System.out.println("\nTest starting...");
        circle2 = new Circle2(1, 2, 3);
    }

    //
    // Stuff you want to do after each test case
    //
    @After
    public void teardown() {
        System.out.println("\nTest finished.");
    }

    //
    // Test a simple positive move
    //
    @Test
    public void simpleMove() {
        Point p;
        System.out.println("Running test simpleMove.");
        p = circle2.moveBy(1, 1);
        Assert.assertTrue(p.x == 2 && p.y == 3);
    }

    //
    // Test a simple negative move
    //
    @Test
    public void simpleMoveNeg() {
        Point p;
        System.out.println("Running test simpleMoveNeg.");
        p = circle2.moveBy(-1, -1);
        Assert.assertTrue(p.x == 0 && p.y == 1);
    }

    //
    // Test with different values
    //
    @Test
    public void simpleMoveDiff() {
        Point p;
        System.out.println("Running test simpleMoveDiff.");
        p = circle2.moveBy(2, 3);
        Assert.assertTrue(p.x == 3 && p.y == 5);
    }
    //
    // Test negative with different values
    //
    @Test
    public void simpleMoveNegDiff() {
        Point p;
        System.out.println("Running test simpleMoveDiff.");
        p = circle2.moveBy(-2, -3);
        Assert.assertTrue(p.x == -1 && p.y == -1);
    }

    //
    // Test scaling with a positive value
    //
    @Test
    public void simpleScale() {
        Point p;
        System.out.println("Running test simpleMoveDiff.");
        circle2.scale(2);
        Assert.assertTrue(circle2.radius == 6);
    }

    //
    // Test scaling with a fractional value
    //
    @Test
    public void simpleScaleFrac() {
        Point p;
        System.out.println("Running test simpleScaleFrac.");
        circle2.scale(2.5);
        Assert.assertTrue(circle2.radius == 7.5);
    }

    public static void main(String args[]) {
        try {
            org.junit.runner.JUnitCore.runClasses(
                    java.lang.Class.forName("Circle2Test"));
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }

}
