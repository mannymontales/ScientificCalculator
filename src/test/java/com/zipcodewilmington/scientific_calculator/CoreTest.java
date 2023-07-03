package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.Calculator;
import com.zipcodewilmington.scientificcalculator.MainApplication;
import org.apache.commons.io.output.ByteArrayOutputStream;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;


public class CoreTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        // changes "System.out.print" commands to print to this stream, rather than the console
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        // we do this to avoid having any null pointer exceptions
        System.setOut(originalOut);
    }


    @Test
    public void addTest1() {
        //Given, this is the expected behavior
        //change variables to names of group's methods
        double x = 2;
        double y = 4;
        double expectedSum = x + y;

        //When
        //calling groups class and method to store the value of the actual method
        //
        double actual = Calculator.addTwoNums(x,y);

        //Then
        Assert.assertEquals(expectedSum, actual, 0.001);
    }

    @Test
    public void addTest2() {
        //Given, this is the expected behavior
        //change variables to names of group's methods
        double x = 60;
        double y = 40;
        double expectedSum = x + y;

        //When
        //calling group's class and method to store the value of the actual method
        //
        double actual = Calculator.addTwoNums(x, y);

        //Then
        Assert.assertEquals(expectedSum, actual, 0.001);
    }

    @Test
    public void addTest3() {
        //Given, this is the expected behavior
        //change variables to names of group's methods
        double x = 50;
        double y = -40;
        double expectedSum = x + y;

        //When
        //calling group's class and method to store the value of the actual method
        //
        double actual = Calculator.addTwoNums(x, y);

        //Then
        Assert.assertEquals(expectedSum, actual, 0.001);
    }



    @Test
    public void subtractTest1() {

        //Given, this is the expected behavior
        //change variables to names of group's methods
        double x = 6;
        double y = 4;

        double expectedDifference = x - y;

        //When
        //calling groups class and method to store the value of the actual method
        //
        double actual = Calculator.subtractTwoNums(x,y);

        //Then
        Assert.assertEquals(expectedDifference, actual, .001);
    }
    @Test
    public void subtractTest2() {
        //Given, this is the expected behavior
        //change variables to names of group's methods
        double x = -50;
        double y = -90;
        double expectedDifference = x - y;

        //When
        //calling group's class and method to store the value of the actual method
        //
        double actual = Calculator.subtractTwoNums(x, y);

        //Then
        Assert.assertEquals(expectedDifference, actual, 0.001);
    }
    @Test
    public void subtractTest3() {
        //Given, this is the expected behavior
        //change variables to names of group's methods
        double x = -502;
        double y = 600;
        double expected = x - y;

        //When
        //calling group's class and method to store the value of the actual method
        //
        double actual = Calculator.subtractTwoNums(x, y);

        //Then
        Assert.assertEquals(expected, actual, 0.001);
    }



    @Test
    public void multiplyTest1() {

        //Given, this is the expected behavior
        //change variables to names of group's methods
        double x = 2;
        double y = 4;

        double expected = x * y;

        //When
        //calling groups class and method to store the value of the actual method
        //
        double actual = Calculator.multiplyTwoNums(x,y);

        //Then
        Assert.assertEquals(expected, actual, .001);
    }
    @Test
    public void multiplyTest2() {
        //Given, this is the expected behavior
        //change variables to names of group's methods
        double x = 50;
        double y = -40;
        double expected = x * y;

        //When
        //calling group's class and method to store the value of the actual method
        //
        double actual = Calculator.multiplyTwoNums(x, y);

        //Then
        Assert.assertEquals(expected, actual, 0.001);
    }
    @Test
    public void multiplyTest3() {
        //Given, this is the expected behavior
        //change variables to names of group's methods
        double x = -5;
        double y = -10;
        double expected = x * y;

        //When
        //calling group's class and method to store the value of the actual method
        //
        double actual = Calculator.multiplyTwoNums(x, y);

        //Then
        Assert.assertEquals(expected, actual, 0.001);
    }



    @Test
    public void divideTest1() {

        //Given, this is the expected behavior
        //change variables to names of group's methods
        double x = 40;
        double y = 10;
        double expected;

        if (x != 0 && y != 0) {
            expected = x /y;
        } else {
            expected = 0;
        }

        //When
        //calling groups class and method to store the value of the actual method
        //
        double actual = Calculator.divide(x,y);

        //Then
        Assert.assertEquals(expected, actual, .001);
    }
    @Test
    public void divideTest2() {

        //Given, this is the expected behavior
        //change variables to names of group's methods
        double x = 0;
        double y = 50;
        double expected;

        if (x != 0 && y != 0) {
            expected = x /y;
        } else {
            expected = 0;
        }
        //When
        //calling groups class and method to store the value of the actual method
        //
        double actual = Calculator.divide(x,y);

        //Then
        Assert.assertEquals(expected, actual, .001);
    }
    @Test
    public void divideTest3() {
        //Given, this is the expected behavior
        //change variables to names of group's methods
        double x = 40;
        double y = 0;
        double expected;

        if (x != 0 && y != 0) {
            expected = x /y;
        } else {
            expected = 0;
        }

        //When
        //calling groups class and method to store the value of the actual method
        //
        double actual = Calculator.divide(x,y);

        //Then
        Assert.assertEquals(expected, actual, .001);
    }



    @Test
    public void exponentiationTest1() {

        //Given, this is the expected behavior
        //change variables to names of group's methods
        double x = 2;
        double y = 4;
        double expected = Math.pow(x,y);

        //When
        //calling groups class and method to store the value of the actual method
        //
        double actual = Calculator.exponentiation(x, y);

        //Then
        Assert.assertEquals(expected, actual, .001);
    }
    @Test
    public void exponentiationTest2() {

        //Given, this is the expected behavior
        //change variables to names of group's methods
        double x = 4;
        double y = 4;
        double expected = Math.pow(x,y);

        //When
        //calling groups class and method to store the value of the actual method
        //
        double actual = Calculator.exponentiation(x, y);

        //Then
        Assert.assertEquals(expected, actual, .001);
    }
    @Test
    public void exponentiationTest3() {

        //Given, this is the expected behavior
        //change variables to names of group's methods
        double x = 10;
        double y = -10;
        double expected = Math.pow(x,y);

        //When
        //calling groups class and method to store the value of the actual method
        //
        double actual = Calculator.exponentiation(x, y);

        //Then
        Assert.assertEquals(expected, actual, .001);
    }



    @Test
    public void sqrTest1() {

        //Given, this is the expected behavior
        //change variables to names of group's methods
        double x = 2;
        double expected = (x * x);

        //When
        //calling groups class and method to store the value of the actual method
        //
        double actual = Calculator.square(x);

        //Then
        Assert.assertEquals(expected, actual, .001);
    }
    @Test
    public void sqrTest2() {

        //Given, this is the expected behavior
        //change variables to names of group's methods
        double x = 5;
        double expected = (x * x);

        //When
        //calling groups class and method to store the value of the actual method
        //
        double actual = Calculator.square(x);

        //Then
        Assert.assertEquals(expected, actual, .001);
    }
    @Test
    public void sqrTest3() {

        //Given, this is the expected behavior
        //change variables to names of group's methods
        double x = 12;
        double expected = (x * x);

        //When
        //calling groups class and method to store the value of the actual method
        //
        double actual = Calculator.square(x);

        //Then
        Assert.assertEquals(expected, actual, .001);
    }



    @Test
    public void sqrtTest1() {
        //Given, this is the expected behavior
        //change variables to names of group's methods
        double x = 16;
        double expected = Math.sqrt(x);

        //When
        //calling group's class and method to store the value of the actual method
        //
        double actual = Calculator.squareRoot(x);

        //Then
        Assert.assertEquals(expected, actual, 0.001);
    }
    @Test
    public void sqrtTest2() {
        //Given, this is the expected behavior
        //change variables to names of group's methods
        double x = 25;
        double expected = Math.sqrt(x);

        //When
        //calling group's class and method to store the value of the actual method
        //
        double actual = Calculator.squareRoot(x);

        //Then
        Assert.assertEquals(expected, actual, 0.001);
    }
    @Test
    public void sqrtTest3() {
        //Given, this is the expected behavior
        //change variables to names of group's methods
        double x = 100;
        double expected = Math.sqrt(x);

        //When
        //calling group's class and method to store the value of the actual method
        //
        double actual = Calculator.squareRoot(x);

        //Then
        Assert.assertEquals(expected, actual, 0.001);
    }



    @Test
    public void invertSignTest1() {

        //Given, this is the expected behavior
        //change variables to names of group's methods
        double x = 2;
        double expectedSum = x * -1;

        //When
        //calling groups class and method to store the value of the actual method
        //
        double actual = Calculator.invertSign(x);

        //Then
        Assert.assertEquals(expectedSum, actual, .001);
    }
    @Test
    public void invertSignTest2() {
        //Given, this is the expected behavior
        //change variables to names of group's methods
        double x = -16;
        double expectedSum = x * -1;

        //When
        //calling groups class and method to store the value of the actual method
        //
        double actual = Calculator.invertSign(x);

        //Then
        Assert.assertEquals(expectedSum, actual, .001);
    }
    @Test
    public void invertSignTest3() {
        //Given, this is the expected behavior
        //change variables to names of group's methods
        double x = 0;
        double expectedSum = x * -1;

        //When
        //calling groups class and method to store the value of the actual method
        //
        double actual = Calculator.invertSign(x);

        //Then
        Assert.assertEquals(expectedSum, actual, .001);
    }
}