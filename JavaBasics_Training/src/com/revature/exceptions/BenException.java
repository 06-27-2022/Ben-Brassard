package com.revature.exceptions;

import java.util.Scanner;

/*
 * You can create custom exceptions in Java. You can do so
 * by simply extending the Exception class.
 * 
 * There are actually two types of Exceptions in Java.
 * Unchecked (RuntimeException) or checked Exceptions. Unchecked exceptions do
 * not have to be handled, so the code will still compile. Checked exceptions are required
 * to be handled or the code fails to compile.
 * 
 * Checked exceptions are exceptions that inherit from the Exception class.
 * Unchecked exceptions are exceptions that inherit from the RuntimeException class.
 * 
 * 				Throwable
 * 			/				\
 * 		Exception			Error
 * 			|
 * 		RuntimeException	
 */
public class BenException extends Exception{
	
	/*
	 * Only here to remove the warning related to not having a serial
	 * version UID for deserialization of this type is you're using Java
	 * Serialization.
	 */
	private static final long serialVersionUID = 1L;

	
	public BenException() {
		
	}
	
	public BenException(String message) {
		super(message);
	}
	
	public static void main(String[] args) {
		
		BenException benException = new BenException();
		/*
		 * You can throw an exception whenever you want, you just have to know
		 * which exception you need
		 */
		System.out.print("Type your name: ");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		
		/*
		 * Moved this logic into a method to observe how we can propagate
		 * exceptions up to the caller.
		 */
//		if(name.equals("Ben")) {
//			try {
//				throw new BenException();
//			} catch(BenException e) {
//				System.out.println("You are not authorized to use this app");
//			}
//		} // if()
		/*
		 * We forced main to handle it with the "throws" keyword
		 */
		try {
			benException.takeName(name);
		} catch(BenException e) {
			System.out.println(e.getMessage());
		}
		scan.close();
	} // main()
	
	public void takeName(String name) throws BenException {
		
		if(name.equals("Ben")) {
//			try {
//				throw new BenException("User's name is Ben!");
//			} catch(BenException e) {
//				System.out.println(e.getMessage());
//			}
			
			
		}
	}
} // BenException
