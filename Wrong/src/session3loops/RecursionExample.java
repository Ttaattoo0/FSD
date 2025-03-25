package session3loops;
public class RecursionExample {
    public static void countdown(int n) {
        if (n <= 0) {
            System.out.println("Done!");
            return;
        }
        System.out.println(n);
        countdown(n - 1);
    }

    public static void main(String[] args) {
        countdown(5);
    }
}
