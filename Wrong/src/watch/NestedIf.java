package watch;

import java.util.Scanner;

public class NestedIf {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter ur age");
			int age = sc.nextInt();
			
			System.out.println("Enter ur weight");
			int weight = sc.nextInt();
			
			if(age>20) {
				if(weight>50) {
					System.out.println("Age and Weight are satisfied, can donate blood");
				} else {
					System.out.println("Under weight can't donate blood");
				}
			}
			else {
				System.out.println("Age not satisfied");
			}
		}
	}
}