package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.MainApplication;
import org.junit.Assert;
import org.junit.Test;

public class ScientificTest {
    @Test
    public void sine(){

        //Given, this is the expected behavior
        //change variables to names of group's methods
        int x = 2;
        int y = 4;

        int expectedSine = Math.sin();

        //When
        //calling groups class and method to store the value of the actual method
        //
        int actual = MainApplication.add(4,2);

        //Then
        Assert.assertEquals(expectedSine, actual);
    }

    @Test
    public void cosine(){

        //Given, this is the expected behavior
        //change variables to names of group's methods
        int x = 2;
        int y = 4;

        int expectedCosine = Math.cos();

        //When
        //calling groups class and method to store the value of the actual method
        //
        int actual = MainApplication.add(4,2);

        //Then
        Assert.assertEquals(expectedCosine, actual);
    }

    @Test
    public void tangent(){

        //Given, this is the expected behavior
        //change variables to names of group's methods
        int x = 2;
        int y = 4;

        int expectedtan = Math.tan();

        //When
        //calling groups class and method to store the value of the actual method
        //
        int actual = MainApplication.add(4,2);

        //Then
        Assert.assertEquals(expectedtan, actual);
    }

    @Test
    public void inverseSine(){

        //Given, this is the expected behavior
        //change variables to names of group's methods
        int x = 2;
        int y = 4;

        int expectedInverseSine = Math.asin();

        //When
        //calling groups class and method to store the value of the actual method
        //
        int actual = MainApplication.add(4,2);

        //Then
        Assert.assertEquals(expectedInverseSine, actual);
    }

    @Test
    public void inverseCosine(){

        //Given, this is the expected behavior
        //change variables to names of group's methods
        int x = 2;
        int y = 4;

        int expectedInverseCosine = Math.acos();

        //When
        //calling groups class and method to store the value of the actual method
        //
        int actual = MainApplication.add(4,2);

        //Then
        Assert.assertEquals(expectedInverseCosine, actual);
    }

    @Test
    public void inverseTangent(){

        //Given, this is the expected behavior
        //change variables to names of group's methods
        int x = 2;
        int y = 4;

        int expectedInverseTangent = Math.atan();

        //When
        //calling groups class and method to store the value of the actual method
        //
        int actual = MainApplication.add(4,2);

        //Then
        Assert.assertEquals(expectedInverseTangent, actual);
    }

    @Test
    public void log(){

        //Given, this is the expected behavior
        //change variables to names of group's methods
        int x = 2;
        int y = 4;

        int expectedLog = Math.log();

        //When
        //calling groups class and method to store the value of the actual method
        //
        int actual = MainApplication.add(4,2);

        //Then
        Assert.assertEquals(expectedLog, actual);
    }

    @Test
    public void inverseLog(){

        //Given, this is the expected behavior
        //change variables to names of group's methods
        int x = 2;
        int y = 4;

        int expectedInverseLog = x + y;

        //When
        //calling groups class and method to store the value of the actual method
        //
        int actual = MainApplication.add(4,2);

        //Then
        Assert.assertEquals(expectedSum, actual);
    }

    @Test
    public void naturalLog(){

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
    public void inverseNaturalLog(){

        //Given, this is the expected behavior
        //change variables to names of group's methods
        int x = 2;
        int y = 4;

        int expectedInverseNaturalLog = Math.exp();

        //When
        //calling groups class and method to store the value of the actual method
        //
        int actual = MainApplication.add(4,2);

        //Then
        Assert.assertEquals(expectedInverseNaturalLog, actual);
    }

    @Test
    public void factorial(){

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
