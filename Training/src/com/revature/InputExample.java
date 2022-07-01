package com.revature;

import java.util.Scanner;

public class InputExample {

	public static void main(String[] args) {
		
		// System.out.println("output");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("What is your name: ");
		String username = scan.next();
		
		scan.nextLine();
		
		System.out.print("What is your age: ");
		String age = scan.nextLine();
		
		int numericAge = Integer.parseInt(age);
		
		System.out.println("Hello, " + username + "! You are "
				+ age + " years old!");
		
		scan.close();
	} //  main()
} // InputExample
