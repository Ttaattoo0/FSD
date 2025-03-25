package string;
import java.util.Scanner;

public class StringMethodsExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Displaying original string
        System.out.println("\nOriginal String: " + inputString);

        // 1. Length of the string
        System.out.println("Length: " + inputString.length());

        // 2. Concatenation
        System.out.print("Enter a string to concatenate: ");
        String appendString = scanner.nextLine();
        System.out.println("Concatenated String: " + inputString.concat(appendString));

        // 3. Character Extraction
        System.out.print("Enter an index to extract character: ");
        int index = scanner.nextInt();
        if (index >= 0 && index < inputString.length()) {
            System.out.println("Character at index " + index + ": " + inputString.charAt(index));
        } else {
            System.out.println("Invalid index!");
        }
        scanner.nextLine(); // Consume newline

        // 4. Substring Extraction
        System.out.print("Enter start index for substring: ");
        int start = scanner.nextInt();
        System.out.print("Enter end index for substring: ");
        int end = scanner.nextInt();
        if (start >= 0 && end <= inputString.length() && start < end) {
            System.out.println("Substring: " + inputString.substring(start, end));
        } else {
            System.out.println("Invalid indices for substring!");
        }
        scanner.nextLine(); // Consume newline

        // 5. String Comparison
        System.out.print("Enter a string to compare: ");
        String compareString = scanner.nextLine();
        System.out.println("Equals: " + inputString.equals(compareString));
        System.out.println("Equals Ignore Case: " + inputString.equalsIgnoreCase(compareString));
        System.out.println("CompareTo: " + inputString.compareTo(compareString));

        // 6. Case Conversion
        System.out.println("Uppercase: " + inputString.toUpperCase());
        System.out.println("Lowercase: " + inputString.toLowerCase());

        // 7. Trim
        System.out.println("Trimmed String: " + inputString.trim());

        // 8. Replace Characters
        System.out.print("Enter a character to replace: ");
        char oldChar = scanner.next().charAt(0);
        System.out.print("Enter new character: ");
        char newChar = scanner.next().charAt(0);
        System.out.println("String after replacement: " + inputString.replace(oldChar, newChar));
        scanner.nextLine(); // Consume newline

        // 9. Checking Start/End
        System.out.print("Enter a prefix to check: ");
        String prefix = scanner.nextLine();
        System.out.println("Starts with '" + prefix + "': " + inputString.startsWith(prefix));

        System.out.print("Enter a suffix to check: ");
        String suffix = scanner.nextLine();
        System.out.println("Ends with '" + suffix + "': " + inputString.endsWith(suffix));

        // 10. Searching within a String
        System.out.print("Enter a character to find index of: ");
        char searchChar = scanner.next().charAt(0);
        System.out.println("First Occurrence: " + inputString.indexOf(searchChar));
        System.out.println("Last Occurrence: " + inputString.lastIndexOf(searchChar));
        scanner.nextLine(); // Consume newline

        // 11. Checking if String contains another String
        System.out.print("Enter a substring to check if present: ");
        String substringCheck = scanner.nextLine();
        System.out.println("Contains '" + substringCheck + "': " + inputString.contains(substringCheck));

        // 12. Splitting a String
        System.out.println("Splitting words:");
        String[] words = inputString.split(" ");
        for (String word : words) {
            System.out.println(word);
        }

        // 13. String Join
        System.out.print("Enter three words separated by space: ");
        String word1 = scanner.next();
        String word2 = scanner.next();
        String word3 = scanner.next();
        System.out.println("Joined String: " + String.join("-", word1, word2, word3));
        scanner.nextLine(); // Consume newline

        // 14. String Formatting
        System.out.println("Formatted String: " + String.format("Hello, %s! Your balance is $%.2f", inputString, 123.456));

        // 15. String to Other Types
        System.out.print("Enter a number as string: ");
        String numberString = scanner.nextLine();
        int num = Integer.parseInt(numberString);
        System.out.println("Converted to integer: " + num);

        scanner.close();
    }
}
