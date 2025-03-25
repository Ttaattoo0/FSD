package nestedloops;

public class MultiplicationTable {
    public static void main(String[] args) {
        int size = 10; // Change this to modify the table size

        for (int i = 2; i <= size;) {
            for (int j = 1; j <= size; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println(); // Blank line for better readability
            break;
        }
    }
}
