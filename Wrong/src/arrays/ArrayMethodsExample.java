package arrays;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayMethodsExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Display original array
        System.out.println("Original Array: " + Arrays.toString(arr));

        // Sorting the array
        int[] sortedArray = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortedArray);
        System.out.println("Sorted Array: " + Arrays.toString(sortedArray));

        // Searching in the array
        System.out.print("Enter a number to search: ");
        int key = scanner.nextInt();
        int index = Arrays.binarySearch(sortedArray, key);
        if (index >= 0) {
            System.out.println("Element found at index (sorted array): " + index);
        } else {
            System.out.println("Element not found.");
        }

        // Copying the array
        int[] copiedArray = Arrays.copyOf(arr, arr.length);
        System.out.println("Copied Array: " + Arrays.toString(copiedArray));

        // Filling an array with a specific value
        System.out.print("Enter a value to fill the array: ");
        int fillValue = scanner.nextInt();
        Arrays.fill(copiedArray, fillValue);
        System.out.println("Array after filling: " + Arrays.toString(copiedArray));

        // Reversing the array manually
        int[] reversedArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversedArray[i] = arr[arr.length - 1 - i];
        }
        System.out.println("Reversed Array: " + Arrays.toString(reversedArray));

        scanner.close();
    }
}
