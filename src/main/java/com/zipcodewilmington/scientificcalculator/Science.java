package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class Science {
    public static void Binary () {
        Scanner binaryInput = new Scanner (System.in);

    }



    public static double SinDegree (double input) {

        double sinValue = Math.sin(input);
        System.out.println("sin(" + input + ") = " + sinValue);
        return sinValue;
    }

    public static double CosDegree(double input) {
        double cosValue = Math.cos(input);
        System.out.println("cos(" + input + ") = " + cosValue);
        return cosValue;

    }

    public static double TanDegree (double input) {
        double tanValue = Math.tan(input);
        System.out.println("tan(" + input + ") = " + tanValue);
        return tanValue;

    }

    public static double SinRadian (double input) {
        double sinValue = Math.sin(input);
        System.out.println("sin(" + input + ") = " + sinValue);
        return sinValue;
    }

    public static double CosRadian (double input) {
        double cosValue = Math.sin(input);
        System.out.println("sin(" + input + ") = " + cosValue);
        return cosValue;
    }

    public static double TanRadian (double input) {
        double tanValue = Math.sin(input);
        System.out.println("sin(" + input + ") = " + tanValue);
        return tanValue;
    }

    public static double asinDegree (double input) {
        double asinvalue = Math.asin(input);
        return asinvalue;
    }
    public static double acosDegree (double input) {
        double acosvalue = Math.acos(input);
        return acosvalue;
    }

    public static double atanDegree (double input) {
        double atanvalue = Math.atan(input);
        return atanvalue;
    }

    public static double asinRadian (double input) {
        double asinvalue = Math.asin(input);
        return asinvalue;
    }

    public static double acosRadian (double input) {
        double asinvalue = Math.acos(input);
        return asinvalue;
    }

    public static double atanRadian (double input) {
        double asinvalue = Math.atan(input);
        return asinvalue;
    }

    public static double log (double log) {
        double logValue = Math.log(log);
        return logValue;
    }

    public static double invLog (double invLog) {
        double invLogValue = Math.log10(invLog);
        return invLogValue;
    }

    public static double natLog (double natLog) {
        double natLogValue = Math.log1p(natLog);
        return natLogValue;
    }

    public static double invNatLog (double invNatLog) {
        double invNatLogValue = Math.log10(Math.log1p(invNatLog));
        return invNatLogValue;
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
