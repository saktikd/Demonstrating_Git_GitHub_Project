package demo;

import java.util.Scanner;

public class Ex_001 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first number :");
		int a1 = sc.nextInt();
		System.out.println("Enter second number :");
		int a2 = sc.nextInt();
		
		System.out.println("Sum is : "+(a1+a2));
		
		
		
	}

}
