package watch;

import java.util.Scanner;

public class ifelse {
public static void main(String[] args) {
	try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter your age");
		int age = sc.nextInt();
		
		if(age>=18) {
			System.out.println("Eligible to vote");
		}else {
			System.out.println("Not eligible to vote");
		}
	}
}
}
