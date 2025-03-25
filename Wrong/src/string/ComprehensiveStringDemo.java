package string;

import java.util.*;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.List;

public class ComprehensiveStringDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 🌟 1. String Basics (User Input)
        System.out.print("Enter a string: ");
        String str1 = scanner.nextLine();
        String str2 = new String(str1); // Using new keyword
        String str3 = str1; // Same as str1 (String Pool)

        System.out.println("\n--- STRING BASICS ---");
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println("String 3: " + str3);
        System.out.println("str1 == str3 (String Pool): " + (str1 == str3));
        System.out.println("str1 == str2 (Different Objects): " + (str1 == str2));
        System.out.println("str1.equals(str2): " + str1.equals(str2));

        // 🌟 2. String Methods
        System.out.println("\n--- STRING METHODS ---");
        System.out.println("Length: " + str1.length());
        System.out.print("Enter an index to get character: ");
        int index = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Character at index " + index + ": " + str1.charAt(index));

        System.out.println("Substring(0, 5): " + (str1.length() >= 5 ? str1.substring(0, 5) : str1));
        System.out.println("Uppercase: " + str1.toUpperCase());
        System.out.println("Lowercase: " + str1.toLowerCase());
        System.out.println("Trim: '" + str1.trim() + "'");

        System.out.print("Enter a word to check in the string: ");
        String checkWord = scanner.nextLine();
        System.out.println("Contains '" + checkWord + "': " + str1.contains(checkWord));

        // 🌟 3. String Concatenation
        System.out.print("\nEnter a string to concatenate: ");
        String concatStr = scanner.nextLine();
        System.out.println("Concatenation (+ operator): " + str1 + concatStr);
        System.out.println("Concatenation (concat method): " + str1.concat(concatStr));

        // 🌟 4. StringBuffer and StringBuilder
        System.out.println("\n--- STRINGBUFFER & STRINGBUILDER ---");
        StringBuffer sb = new StringBuffer(str1);
        sb.reverse();
        System.out.println("StringBuffer Reverse: " + sb);
        sb.reverse(); // Restore

        StringBuilder sbuilder = new StringBuilder(str1);
        sbuilder.append(" - Extended!");
        System.out.println("StringBuilder Append: " + sbuilder);

        // 🌟 5. String Formatting
        System.out.print("\nEnter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println(String.format("Hello, %s! You are %d years old.", name, age));

        // 🌟 6. Regular Expressions
        System.out.print("\nEnter a string to validate (Alphanumeric required): ");
        String regexInput = scanner.nextLine();
        boolean matches = regexInput.matches("[A-Za-z0-9]+");
        System.out.println("Matches Alphanumeric pattern: " + matches);

        // 🌟 7. String Encoding & Decoding
        byte[] encodedBytes = str1.getBytes(StandardCharsets.UTF_8);
        String decodedString = new String(encodedBytes, StandardCharsets.UTF_8);
        System.out.println("Encoded & Decoded String: " + decodedString);

        // 🌟 8. String Manipulation in Java 8+
        List<String> words = Arrays.asList("Java", "is", "awesome");
        String joinedString = String.join(" ", words);
        System.out.println("String.join: " + joinedString);

        StringJoiner joiner = new StringJoiner(", ", "[", "]");
        joiner.add("Apple").add("Banana").add("Cherry");
        System.out.println("StringJoiner: " + joiner);

        String streamJoined = words.stream().collect(Collectors.joining(" - "));
        System.out.println("Stream Joining: " + streamJoined);

        // 🌟 9. Converting Strings
        System.out.print("\nEnter a number string to convert to Integer: ");
        String numStr = scanner.nextLine();
        try {
            int num = Integer.parseInt(numStr);
            System.out.println("Converted Integer: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format!");
        }

        scanner.close();
    }
}
