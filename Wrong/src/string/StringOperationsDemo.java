package string;

import java.util.Scanner;
import java.util.regex.*;

public class StringOperationsDemo {
    private static String str2;

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 🌟 String Creation (Literal & Object)
        System.out.print("Enter a string: ");
        String str1 = scanner.nextLine(); // User input string
        setStr2(new String(str1));
        
        // 🌟 String Length & Character Access
        System.out.println("\n--- STRING METHODS ---");
        System.out.println("Length of String: " + str1.length());
        System.out.print("Enter an index to get character: ");
        int index = scanner.nextInt();
        if (index >= 0 && index < str1.length()) {
            System.out.println("Character at index " + index + ": " + str1.charAt(index));
        } else {
            System.out.println("Invalid index!");
        }
        scanner.nextLine(); // Consume newline
        
        // 🌟 Substring & Case Conversion
        System.out.println("Substring (0 to 3): " + str1.substring(0, Math.min(3, str1.length())));
        System.out.println("Uppercase: " + str1.toUpperCase());
        System.out.println("Lowercase: " + str1.toLowerCase());

        // 🌟 String Concatenation
        System.out.print("Enter a string to concatenate: ");
        String str3 = scanner.nextLine();
        System.out.println("Concatenation using '+': " + str1 + " " + str3);
        System.out.println("Concatenation using concat(): " + str1.concat(" ").concat(str3));

        // 🌟 String Comparison
        System.out.print("Enter another string to compare: ");
        String str4 = scanner.nextLine();
        System.out.println("Using equals(): " + str1.equals(str4));
        System.out.println("Using compareTo(): " + str1.compareTo(str4));
        System.out.println("Using == (reference comparison): " + (str1 == str4));

        // 🌟 String Immutability
        String immutableTest = "Java";
        immutableTest.concat(" Programming");
        System.out.println("\nImmutable Test (String remains same): " + immutableTest);

        // 🌟 StringBuffer (Mutable String)
        StringBuffer sb = new StringBuffer(str1);
        sb.append(" Rocks!");
        System.out.println("\nStringBuffer (Mutable): " + sb);
        sb.insert(5, " is");
        System.out.println("After Insertion: " + sb);
        sb.reverse();
        System.out.println("After Reversing: " + sb);
        sb.reverse(); // Revert back
        
        // 🌟 StringBuilder (Faster for single-threaded)
        StringBuilder sbd = new StringBuilder(str1);
        sbd.append(" is awesome!");
        System.out.println("\nStringBuilder: " + sbd);

        // 🌟 String Replace & Trim
        System.out.println("\nReplaced 'a' with '@': " + str1.replace("a", "@"));
        System.out.println("Trimmed String: '" + str1.trim() + "'");

        // 🌟 String Splitting
        System.out.print("Enter a sentence to split by spaces: ");
        String sentence = scanner.nextLine();
        String[] words = sentence.split(" ");
        System.out.println("Words in Sentence:");
        for (String word : words) {
            System.out.println(word);
        }

        // 🌟 Regular Expressions
        System.out.print("Enter an email for validation: ");
        String email = scanner.nextLine();
        Pattern pattern = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
        Matcher matcher = pattern.matcher(email);
        System.out.println("Valid Email: " + matcher.matches());

        scanner.close();
    }

	public static String getStr2() {
		return str2;
	}

	public static void setStr2(String str2) {
		StringOperationsDemo.str2 = str2;
	}
}