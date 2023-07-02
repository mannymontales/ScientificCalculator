package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        Console.println("Welcome to Halictidae Calculator!");
        Console.println("I'm here to help!");
        String chooseOperation = Console.getStringInput("What operation would you like to perform today?\n" +
                "( + ) ( - ) ( * ) ( / ) ( ^ ) ( sqr ) ( sqrt ) (exponentiation) (invert sign)\n" +
                "(sine) (cosine) (tangent) (inverseSine) (inverseCosine) (inverseTangent) (log) (inverseLog)" +
                " (naturalLog) (inverseNaturalLog) (factorial)\n" +
                "(clearError)" +
                "\nPlease type it in as you see in the parentheses ---> ");

        double numberOne;
        double numberTwo;

            switch (chooseOperation) {
                case "+":
                    numberOne = Console.getDoubleInput("Please enter first number: ");
                    numberTwo = Console.getDoubleInput("Please enter second number: ");
                    Calculator.addTwoNums(numberOne, numberTwo);
                    break;
                case "-":
                    numberOne = Console.getDoubleInput("Please enter first number: ");
                    numberTwo = Console.getDoubleInput("Please enter second number: ");
                    Calculator.subtractTwoNums(numberOne, numberTwo);
                    break;
                case "*":
                    numberOne = Console.getDoubleInput("Please enter first number: ");
                    numberTwo = Console.getDoubleInput("Please enter second number: ");
                    Calculator.multiplyTwoNums(numberOne, numberTwo);
                    break;
                case "/":
                    numberOne = Console.getDoubleInput("Please enter first number: ");
                    numberTwo = Console.getDoubleInput("Please enter second number: ");
                    Calculator.divide(numberOne, numberTwo);
                    break;
                case "exponentiation":
                    numberOne = Console.getDoubleInput("Please enter first number: ");
                    numberTwo = Console.getDoubleInput("Please enter second number: ");
                    Calculator.exponentiation(numberOne, numberTwo);
                    break;
                case "sqr":
                    numberOne = Console.getDoubleInput("Please enter the number you want squared: ");
                    Calculator.square(numberOne);
                    break;
                case "sqrt":
                    numberOne = Console.getDoubleInput("Please enter the number you want the square root of: ");
                    Calculator.squareRoot(numberOne);
                    break;
                case "invert sign":
                    numberOne = Console.getDoubleInput("Please enter the number which sign you want to inverse: ");
                    Calculator.invertSign(numberOne);
                    break;
                case "sine":
                    numberOne = Console.getDoubleInput("Please enter the number you want to Sine of: ");
                    Science.Sin(numberOne);
                    break;
                case "cosine":
                    numberOne = Console.getDoubleInput("Please enter the number you want to Cosine of: ");
                    Science.Cos(numberOne);
                    break;
                case "tangent":
                    numberOne = Console.getDoubleInput("Please enter the number you want to Tangent of: ");
                    Science.Tan(numberOne);
                    break;
                case "inverseSine":
                    numberOne = Console.getDoubleInput("Please enter the number you want to Inverse Sine of: ");
                    Science.aSin(numberOne);
                    break;
                case "inverseCosine":
                    numberOne = Console.getDoubleInput("Please enter the number you want to Inverse Cosine of: ");
                    Science.aCos(numberOne);
                    break;
                case "inverseTangent":
                    numberOne = Console.getDoubleInput("Please enter the number you want to Inverse Tangent of: ");
                    Science.aTan(numberOne);
                    break;
                case "log":
                    numberOne = Console.getDoubleInput("Please enter the number you want the log of: ");
                    Science.log(numberOne);
                    break;
                case "inverseLog":
                    numberOne = Console.getDoubleInput("Please enter the number you want the inverse log of: ");
                    Science.invLog(numberOne);
                    break;
                case "naturalLog":
                    numberOne = Console.getDoubleInput("Please enter the number you want the natural log of: ");
                    Science.natLog(numberOne);
                    break;
                case "inverseNaturalLog":
                    numberOne = Console.getDoubleInput("Please enter the number you want the inverse natural log of: ");
                    Science.invNatLog(numberOne);
                    break;
                case "factorial":
                    numberOne = Console.getDoubleInput("Please enter the number you want the factorial of: ");
                    Science.factorial(numberOne);
                    break;
                default:
                    Console.print("That command does not exist please enter another command: ");
                    break;
        }
    }
}



