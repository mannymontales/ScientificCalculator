package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.MainApplication;
import com.zipcodewilmington.scientificcalculator.Calculator;
import com.zipcodewilmington.scientificcalculator.Science;
import org.apache.commons.io.output.ByteArrayOutputStream;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

public class ScientificTest {
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
    public void sinTest1() {
        //Given, this is the expected behavior
        //change variables to names of group's methods
        double x = 60;
        double expected = Math.sin(x);

        //When
        //calling groups class and method to store the value of the actual method
        //
        double actual = Science.Sin(x);

        //Then
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void cosTest1() {
        //Given, this is the expected behavior
        //change variables to names of group's methods
        double x = 60;
        double expected = Math.cos(x);

        //When
        //calling groups class and method to store the value of the actual method
        //
        double actual = Science.Cos(x);

        //Then
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void tanTest1() {
        //Given, this is the expected behavior
        //change variables to names of group's methods
        double x = 60;
        double expected = Math.tan(x);

        //When
        //calling groups class and method to store the value of the actual method
        //
        double actual = Science.Tan(x);

        //Then
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void asinTest1() {
        //Given, this is the expected behavior
        //change variables to names of group's methods
        double x = 60;
        double expected = Math.asin(x);

        //When
        //calling groups class and method to store the value of the actual method
        //
        double actual = Science.aSin(x);

        //Then
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void acosTest1() {
        //Given, this is the expected behavior
        //change variables to names of group's methods
        double x = 60;
        double expected = Math.acos(x);

        //When
        //calling groups class and method to store the value of the actual method
        //
        double actual = Science.aCos(x);

        //Then
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void atanTest1() {
        //Given, this is the expected behavior
        //change variables to names of group's methods
        double x = 60;
        double expected = Math.atan(x);

        //When
        //calling groups class and method to store the value of the actual method
        //
        double actual = Science.aTan(x);

        //Then
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void logTest1() {
        //Given, this is the expected behavior
        //change variables to names of group's methods
        double x = 60;
        double expected = Math.log(x);

        //When
        //calling groups class and method to store the value of the actual method
        //
        double actual = Science.log(x);

        //Then
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void inverseLogTest1() {
        //Given, this is the expected behavior
        //change variables to names of group's methods
        double x = 60;
        double expected = Math.log10(x);

        //When
        //calling groups class and method to store the value of the actual method
        //
        double actual = Science.invLog(x);

        //Then
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void naturalLogTest1() {
        //Given, this is the expected behavior
        //change variables to names of group's methods
        double x = 60;
        double expected = Math.log(x);

        //When
        //calling groups class and method to store the value of the actual method
        //
        double actual = Science.natLog(x);

        //Then
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void inverseNaturalLogTest1() {
        //Given, this is the expected behavior
        //change variables to names of group's methods
        double x = 60;
        double expected = Math.exp(Math.log(x));

        //When
        //calling groups class and method to store the value of the actual method
        //
        double actual = Science.invNatLog(x);

        //Then
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void factorialTest1() {
        //Given, this is the expected behavior
        //change variables to names of group's methods
        double storedNum = 5;
        double x = storedNum;
        double expected = 120;
        double total = 1;
        for (int i = 0; 0 < x; i++){

            // add N to the total sum of the number
            total *= x;//3
            x -= 1;
            //have total increment with i till its less than n
        }
        //When
        //calling groups class and method to store the value of the actual method
        //
        double actual = Science.factorial(storedNum);

        //Then
        Assert.assertEquals(expected, actual, 0.001);
    }
}
