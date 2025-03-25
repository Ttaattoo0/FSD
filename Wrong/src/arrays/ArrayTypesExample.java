package arrays;

import java.util.Scanner;

public class ArrayTypesExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. One-Dimensional Array
        System.out.print("Enter size of One-Dimensional Array: ");
        int size1D = scanner.nextInt();
        int[] oneDArray = new int[size1D];
        System.out.println("Enter elements:");
        for (int i = 0; i < size1D; i++) {
            oneDArray[i] = scanner.nextInt();
        }
        System.out.println("One-Dimensional Array:");
        for (int num : oneDArray) {
            System.out.print(num + " ");
        }
        System.out.println("\n");

        // 2. Two-Dimensional Array
        System.out.print("Enter number of rows for Two-Dimensional Array: ");
        int rows2D = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols2D = scanner.nextInt();
        int[][] twoDArray = new int[rows2D][cols2D];
        System.out.println("Enter elements:");
        for (int i = 0; i < rows2D; i++) {
            for (int j = 0; j < cols2D; j++) {
                twoDArray[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Two-Dimensional Array:");
        for (int i = 0; i < rows2D; i++) {
            for (int j = 0; j < cols2D; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // 3. Jagged Array
        System.out.print("Enter number of rows for Jagged Array: ");
        int rowsJagged = scanner.nextInt();
        int[][] jaggedArray = new int[rowsJagged][];
        for (int i = 0; i < rowsJagged; i++) {
            System.out.print("Enter number of elements in row " + (i + 1) + ": ");
            int cols = scanner.nextInt();
            jaggedArray[i] = new int[cols];
            System.out.println("Enter elements:");
            for (int j = 0; j < cols; j++) {
                jaggedArray[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Jagged Array:");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // 4. Three-Dimensional Array
        System.out.print("Enter depth of Three-Dimensional Array: ");
        int depth3D = scanner.nextInt();
        System.out.print("Enter rows: ");
        int rows3D = scanner.nextInt();
        System.out.print("Enter columns: ");
        int cols3D = scanner.nextInt();
        int[][][] threeDArray = new int[depth3D][rows3D][cols3D];
        System.out.println("Enter elements:");
        for (int i = 0; i < depth3D; i++) {
            for (int j = 0; j < rows3D; j++) {
                for (int k = 0; k < cols3D; k++) {
                    threeDArray[i][j][k] = scanner.nextInt();
                }
            }
        }
        System.out.println("Three-Dimensional Array:");
        for (int i = 0; i < depth3D; i++) {
            System.out.println("Depth " + (i + 1) + ":");
            for (int j = 0; j < rows3D; j++) {
                for (int k = 0; k < cols3D; k++) {
                    System.out.print(threeDArray[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        scanner.close();
    }
}
