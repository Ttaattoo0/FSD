package nestedloops;
public class NestedLoopContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (j == 2) {
                    continue; // Skips iteration when j = 2
                }
                System.out.println("i: " + i + ", j: " + j);
            }
        }
    }
}
