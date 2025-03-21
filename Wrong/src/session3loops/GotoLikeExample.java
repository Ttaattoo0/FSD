package session3loops;
public class GotoLikeExample {
    public static void main(String[] args) {
        int i = 1;

        loopStart: // Label
        while (true) {
            System.out.println("Iteration: " + i);
            i++;
            if (i > 5) break loopStart; // Acts like a goto
        }
    }
}
