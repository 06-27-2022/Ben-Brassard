package com.revature.exceptions;

import java.time.LocalDate;
import java.util.Scanner;

/*
 * One of the features of Java is its built-in exception handling. This means that 
 * when something goes "wrong", Java has a built-in mechanism the developer can take
 * advantage of to correct it.
 * 
 * Simply put, an Exception is an unexpected event that disrupts the normal flow of
 * your application.
 */
public class ExceptionExamples {

	public static void main(String[] args) {
		
		// Let's take input for a user to allow them to pick a num from the array and print it
		Scanner scan = new Scanner(System.in);
		System.out.print("Which index would you like to see: ");
		int userSelection = scan.nextInt();
		int[] myNums = {2, 5, 3, 5, 6, 7, 8, 1010};
		// myNums[2] = 8; // This line throws an ArrayIndexOutOfBoundsException
		
		String myString = "A String";
		// myString.charAt(20); // This line throws a StringIndexOutOfBoundsException
		
		// LocalDate myDate = LocalDate.of(2022, 20, 21); // Throws a DateTimeException
		
		// Let's print the user's num selection:
		/*
		 * Because we know that there is the potential for an Exception to
		 * be thrown, especially in this case because we're taking user input
		 * and using it to access an element in our array. If an Exception is thrown,
		 * our goodbye message is never printed. We ideally want to be able to move
		 * past the Exception even if it is thrown.
		 * 
		 * In order to do this, I will do what we call 'handling the exception' by using
		 * a try-catch block.
		 * 
		 * We put our risky code inside our try block.There should be only one try block!
		 * Try cannot be used alone. Must be followed by either a catch block
		 * or a finally block.
		 * 
		 * If an exception is thrown, we course correct our app inside of a catch block
		 * after our try block. When using a catch block, you must specify the Exception
		 * you are expecting to be thrown.
		 * 
		 * You are allowed to have multiple catch blocks, BUT the exceptions should
		 * go from most to least specific.
		 * 
		 * You can also optionally have another block at the end called a 'finally block'.
		 * In fact, you can just have try-finally. The finally block always runs; there are
		 * some exceptions to the rule. For instance, if there are some unrecoverable errors
		 * in your program, the finally block won't run.
		 * 
		 * Why would you want a block that always runs? Sometimes there are things that we need to run
		 * regardless of Exceptions
		 */
		try {
			System.out.println(myNums[userSelection]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Not a valid index!");
		} finally {
			System.out.println("I always run.");
		}
		
		
		System.out.println("Thanks for playing!");
		
		scan.close();
	} // main()
}
