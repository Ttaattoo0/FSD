package practice;

import java.util.Scanner;

public class UnitConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the value to convert:");
        double value = scanner.nextDouble();
        
        System.out.println("Choose conversion: ");
        System.out.println("1: Miles to Kilometers");
        System.out.println("2: Kilometers to Miles");
        int choice = scanner.nextInt();
        
        if (choice == 1) {
            double km = value * 1.60934;
            System.out.println(value + " miles = " + km + " kilometers");
        } else if (choice == 2) {
            double miles = value / 1.60934;
            System.out.println(value + " kilometers = " + miles + " miles");
        } else {
            System.out.println("Invalid choice");
        }
        
        scanner.close();
    }
}