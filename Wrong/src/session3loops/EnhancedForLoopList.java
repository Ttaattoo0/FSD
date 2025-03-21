package session3loops;

import java.util.ArrayList;

public class EnhancedForLoopList {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Enhanced for loop for ArrayList
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
