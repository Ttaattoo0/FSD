package session3loops;
public class AsyncLoopExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(1000); // Simulates async delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Iteration: " + i);
        }
    }
}
