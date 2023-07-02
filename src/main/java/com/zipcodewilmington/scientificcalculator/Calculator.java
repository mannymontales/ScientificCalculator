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

        public void add(double number) {
            this.display += number;
        }

        public void subtract(double number) {
            this.display -= number;
        }

        public void multiply(double number) {
            this.display *= number;
        }

        public void divide(double number) {
            if (number != 0) {
                this.display /= number;
            } else {
                this.display = Double.NaN; // Set display to NaN for division by zero error
            }
        }

        public void square() {
            this.display = Math.pow(this.display, 2);
        }

        public void squareRoot() {
            this.display = Math.sqrt(this.display);
        }

        public void exponentiation(double number) {
            this.display = Math.pow(this.display, number);
        }

        public void inverse() {
            if (this.display != 0) {
                this.display = 1 / this.display;
            } else {
                this.display = Double.NaN; // Set display to NaN for division by zero error
            }
        }

        public void invertSign() {
            this.display = -this.display;
        }

        public void clearError() {
            if (Double.isNaN(this.display)) {
                this.display = 0;
            }
        }

        public static void main(String[] args) {
            Calculator calculator = new Calculator();
            System.out.println(calculator.getDisplay());  // Output: 0.0

            calculator.setDisplay(5);
            System.out.println(calculator.getDisplay());  // Output: 5.0

            calculator.add(3);
            System.out.println(calculator.getDisplay());  // Output: 8.0

            calculator.square();
            System.out.println(calculator.getDisplay());  // Output: 64.0

            calculator.squareRoot();
            System.out.println(calculator.getDisplay());  // Output: 8.0

            calculator.divide(0);
            System.out.println(calculator.getDisplay());  // Output: NaN

            calculator.clearError();
            System.out.println(calculator.getDisplay());  // Output: 0.0
        }
    }


