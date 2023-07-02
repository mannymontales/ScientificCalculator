package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class Science {
    public static void Binary () {
        Scanner binaryInput = new Scanner (System.in);

    }

    public static double Sin(double input) {
        double sinValue = Math.sin(input);
        Console.println("sin(" + input + ") = " + sinValue);
        return sinValue;
    }

    public static double Cos(double input) {
        double cosValue = Math.cos(input);
        Console.println("sin(" + input + ") = " + cosValue);
        return cosValue;
    }

    public static double Tan(double input) {
        double tanValue = Math.tan(input);
        Console.println("sin(" + input + ") = " + tanValue);
        return tanValue;
    }

    public static double aSin(double input) {
        double asinvalue = Math.asin(input);
        Console.println("sin(" + input + ") = " + asinvalue);
        return asinvalue;
    }
    public static double aCos(double input) {
        double acosvalue = Math.acos(input);
        Console.println("sin(" + input + ") = " + acosvalue);
        return acosvalue;
    }

    public static double aTan(double input) {
        double atanvalue = Math.atan(input);
        Console.println("sin(" + input + ") = " + atanvalue);
        return atanvalue;
    }

    public static double log (double log) {
        double logValue = Math.log(log);
        Console.println("log(" + log + ") = " + logValue);
        return logValue;
    }

    public static double invLog (double invLog) {
        double invLogValue = Math.log10(invLog);
        Console.println("sin(" + invLog + ") = " + invLogValue);
        return invLogValue;
    }

    public static double natLog (double natLog) {
        double natLogValue = Math.log1p(natLog);
        Console.println("sin(" + natLog + ") = " + natLogValue);
        return natLogValue;
    }

    public static double invNatLog (double invNatLog) {
        double invNatLogValue = Math.log10(Math.log1p(invNatLog));
        Console.println("sin(" + invNatLog + ") = " + invNatLogValue);
        return invNatLogValue;
    }
    
    public static double factorial(double fact) {
        double total = 1;
        for (int i = 0; 0 < fact; i++){

            // add N to the total sum of the number
            total *= fact;//3
            fact -= 1;
            //have total increment with i till its less than n
        }
        Console.println("The factorial is: " + total);
        return total;
    }
    public static int fact (int fact) {
        for (int i = 1;i <= fact; i++) {
            fact = fact * i;
        }
        int factValue = fact;
        return factValue;
    }

    public static void switchUnitsMode () {
        String s = Console.getStringInput("Please enter Degrees or Radians: ");
        if (s.equals("Degrees")) {
            swithUnitsMode(s);
        }
        else {

        }

    }

    public static String swithUnitsMode(String mode) {
        return null;
    }



}
