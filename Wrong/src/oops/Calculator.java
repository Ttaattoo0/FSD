package oops;

import java.util.Scanner;

// Base class
abstract class Operation {
    abstract double calculate(double a, double b);
}

// Subclasses for different operations
class Addition extends Operation {
    @Override
    double calculate(double a, double b) {
        return a + b;
    }
}

class Subtraction extends Operation {
    @Override
    double calculate(double a, double b) {
        return a - b;
    }
}

class Multiplication extends Operation {
    @Override
    double calculate(double a, double b) {
        return a * b;
    }
}

class Division extends Operation {
    @Override
    double calculate(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Error! Division by zero.");
        }
    }
}

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter an operator (+, -, *, /):");
        char operator = scanner.next().charAt(0);

        System.out.println("Enter second number:");
        double num2 = scanner.nextDouble();

        Operation operation;
        switch (operator) {
            case '+':
                operation = new Addition();
                break;
            case '-':
                operation = new Subtraction();
                break;
            case '*':
                operation = new Multiplication();
                break;
            case '/':
                operation = new Division();
                break;
            default:
                System.out.println("Invalid operator!");
                scanner.close();
                return;
        }
        
        try {
            double result = operation.calculate(num1, num2);
            System.out.println("The result is: " + result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        
        scanner.close();
    }
}