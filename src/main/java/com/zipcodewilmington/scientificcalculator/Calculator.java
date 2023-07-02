package com.zipcodewilmington.scientificcalculator;
import java.lang.Math;
public class Calculator {

        private double display;

        public Calculator() {
            this.display = 0;
        }

        public double getDisplay() {
            return this.display;
        }

        public void clearDisplay() {
            this.display = 0;
        }

        public void setDisplay(double number) {
            this.display = number;
        }

        public static double addTwoNums(double x, double y) {
            double sum = x + y;
            Console.print("The sum of " + x + " and " + y + " is " + String.valueOf(sum));
            return sum;
        }

        public static double subtractTwoNums(double x, double y) {
            double difference = x - y;
            Console.print("The difference of " + x + " and " + y + " is " + String.valueOf(difference));
            return difference;
        }

        public static double multiplyTwoNums(double x, double y) {
            double product = x * y;
            Console.print("The product of " + x + " and " + y + " is " + String.valueOf(product));
            return product;
        }

        public static double divide(double x, double y) {
            double quotient = 0;
            if (y != 0) {
                quotient = x /y;
                } else {
                //this.display = Double.NaN; // Set display to NaN for division by zero error
            }
            Console.print("The quotient of " + x + " / " + y + " is " + String.valueOf(quotient));
            return quotient;
        }

        public static double square(double x) {
            double squared = (x * x);
            Console.print(x + " :Squared is  " + String.valueOf(squared));
            return squared;
        }

        public static double  squareRoot(double x) {
            double squareRoot =  Math.sqrt(x);
            Console.print( "The square root of: " + x + " is " + String.valueOf(squareRoot));
            return squareRoot;
        }

        public static double exponentiation(double x, double y) {
            double total =  Math.pow(x , y);

            Console.print(x + " raised to the power of " + y + " is " + total );
            return total;
        }

        public void inverse() {
            if (this.display != 0) {
                this.display = 1 / this.display;
            } else {
                //this.display = Double.NaN; // Set display to NaN for division by zero error

            }
        }

        public static double invertSign(double x) {
            double newNum = 0;
            if (x < 0 ){
                //x is less than in this scenario
                newNum = (x * -1);
            } else {
                newNum = -x;

            }
            Console.print("This number with it's sign inverted is: " + newNum);
            return newNum;
        }

        public void clearError() {
            if (Double.isNaN(this.display)) {
                this.display = 0;
            }
        }
}


