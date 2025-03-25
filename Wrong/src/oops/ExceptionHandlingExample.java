package oops;

import java.util.Scanner;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            
            if (number < 0) {
                throw new IllegalArgumentException("Number cannot be negative.");
            }
            
            System.out.println("You entered: " + number);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Scanner closed. Program execution completed.");
        }
    }
}

