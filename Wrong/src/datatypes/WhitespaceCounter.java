package datatypes;

import java.util.Scanner;

public class WhitespaceCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        
        int whitespaceCount = 0;
        
        for (int i = 0; i < input.length(); i++) {
            if (Character.isWhitespace(input.charAt(i))) {
                whitespaceCount++;
            }
        }
        
        System.out.println("Number of whitespace characters: " + whitespaceCount);
        scanner.close();
    }
}
