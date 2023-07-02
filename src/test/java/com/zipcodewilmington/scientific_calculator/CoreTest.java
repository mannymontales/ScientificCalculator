package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.Calculator;
import com.zipcodewilmington.scientificcalculator.MainApplication;
import org.junit.Assert;
import org.junit.Test;
import Ma

public class CoreTest {
    @Test
    public void add(){

        //Given, this is the expected behavior
        //change variables to names of group's methods
        double x = 2;
        double y = 4;

        double expectedSum = x + y;

        //When
        //calling groups class and method to store the value of the actual method
        //
        double actual = Calculator.addTwoNums(4,2);

        //Then
        Assert.assertEquals(expectedSum, actual);
    }

    @Test
    public void subtract(){

        //Given, this is the expected behavior
        //change variables to names of group's methods
        int x = 2;
        int y = 4;

        int expectedDifference = x - y;

        //When
        //calling groups class and method to store the value of the actual method
        //
        int actual = MainApplication.add(4,2);

        //Then
        Assert.assertEquals(expectedDifference, actual);
    }

    @Test
    public void divide(){

        //Given, this is the expected behavior
        //change variables to names of group's methods
        int x = 2;
        int y = 4;

        int expectedQuotient = x / y;

        //When
        //calling groups class and method to store the value of the actual method
        //
        int actual = MainApplication.add(4,2);

        //Then
        Assert.assertEquals(expectedQuotient, actual);
    }

    @Test
    public void multiply(){

        //Given, this is the expected behavior
        //change variables to names of group's methods
        int x = 2;
        int y = 4;

        int expectedProduct = x * y;

        //When
        //calling groups class and method to store the value of the actual method
        //
        int actual = MainApplication.add(4,2);

        //Then
        Assert.assertEquals(expectedProduct, actual);
    }

    @Test
    public void square(){

        //Given, this is the expected behavior
        //change variables to names of group's methods
        double x;

        double expectedSquare = Math.pow(x);

        //When
        //calling groups class and method to store the value of the actual method
        //
        int actual = MainApplication.add(4,2);

        //Then
        Assert.assertEquals(expectedSquare, actual);
    }

    @Test
    public void squareRoot(){

        //Given, this is the expected behavior
        //change variables to names of group's methods
        int x = 2;
        int y = 4;

        int expectedSquareRoot = Math.sqrt();

        //When
        //calling groups class and method to store the value of the actual method
        //
        int actual = MainApplication.add(4,2);

        //Then
        Assert.assertEquals(expectedSquareRoot, actual);
    }

    @Test
    public void exponentiation(){

        //Given, this is the expected behavior
        //change variables to names of group's methods
        int x = 2;
        int y = 4;

        int expectedExponentiation = Math.pow(x, y);

        //When
        //calling groups class and method to store the value of the actual method
        //
        int actual = MainApplication.add(4,2);

        //Then
        Assert.assertEquals(expectedExponentiation, actual);
    }

    @Test
    public void inverseOfNumber(){

        //Given, this is the expected behavior
        //change variables to names of group's methods
        int x = 2;
        int y = 4;

        int expectedSum = x + y;

        //When
        //calling groups class and method to store the value of the actual method
        //
        int actual = MainApplication.add(4,2);

        //Then
        Assert.assertEquals(expectedSum, actual);
    }

    @Test
    public void invertSignOfNumber(){

        //Given, this is the expected behavior
        //change variables to names of group's methods
        int x = 2;
        int y = 4;

        int expectedInverseSignOfNumber = Math.abs();

        //When
        //calling groups class and method to store the value of the actual method
        //
        int actual = MainApplication.add(4,2);

        //Then
        Assert.assertEquals(expectedSum, actual);
    }

    @Test
    public void err(){

        //Given, this is the expected behavior
        //change variables to names of group's methods
        int x = 2;
        int y = 4;

        int expectedSum = x + y;

        //When
        //calling groups class and method to store the value of the actual method
        //
        int actual = MainApplication.add(4,2);

        //Then
        Assert.assertEquals(expectedSum, actual);
    }

    @Test
    public void shi(){

        //Given, this is the expected behavior
        //change variables to names of group's methods
        int x = 2;
        int y = 4;

        int expectedSum = x + y;

        //When
        //calling groups class and method to store the value of the actual method
        //
        int actual = MainApplication.add(4,2);

        //Then
        Assert.assertEquals(expectedSum, actual);
    }
}
