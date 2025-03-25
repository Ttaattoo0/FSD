package session3loops;

import java.util.Scanner;

public class ForLoopExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // For Loop Example - Print numbers from 1 to N
        System.out.println("Enter a number N to print numbers from 1 to N:");
        int N = scanner.nextInt();
        
        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        
       scanner.close();
    }
}