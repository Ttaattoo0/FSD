package watch;

import java.util.Scanner;

public class SwitchCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter four numbers:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();
        double num4 = scanner.nextDouble();

        System.out.println("Choose an operation: +, -, *, /");
        char operator = scanner.next().charAt(0);

        double result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2 + num3 + num4;
                break;
            case '-':
                result = num1 - num2 - num3 - num4;
                break;
            case '*':
                result = num1 * num2 * num3 * num4;
                break;
            case '/':
                if (num2 != 0 && num3 != 0 && num4 != 0) {
                    result = num1 / num2 / num3 / num4;
                } else {
                    System.out.println("Error! Division by zero.");
                    scanner.close();
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator!");
                scanner.close();
                return;
        }

        System.out.println("Result: " + result);
        scanner.close();
    }
}
