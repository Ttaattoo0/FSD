package nestedloops;
public class NestedLoopBreak {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    break; // Stops the inner loop when i=2, j=2
                }
                System.out.println("i: " + i + ", j: " + j);
            }
        }
    }
}
