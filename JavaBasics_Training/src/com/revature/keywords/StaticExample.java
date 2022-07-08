package com.revature.keywords;

public class StaticExample {

	// instance variables
	private int instanceInt;
	private String instanceString;
	
	// static variables
	// All static variables are their own copy and can be accessed within the class
	private static int staticInt = 0;
	
	public StaticExample() {
		
	}
	
	public StaticExample(int instanceInt, String instanceString) {
		this.instanceInt = instanceInt;
		this.instanceString = instanceString;
		// Let's increment that staticInt everytime the constructor is called
		staticInt++;
	}
	
	
	@Override
	public String toString() {
		return "StaticExample [instanceInt= " + instanceInt + ", instanceString= " + instanceString + "]";
	}

	/*
	 * We've seen static before but what is the purpose?
	 * Where do we use it?
	 * 
	 * The static keyword can be applied to methods and even field
	 */
	public static void main(String[] args) {
		
		StaticExample staticExample1 = new StaticExample(1, "one");
		StaticExample staticExample2 = new StaticExample(2, "two");
//		System.out.println(staticExample1);
//		System.out.println(staticExample2);
		/*
		 * When accessing a static variable or method, you shouldn't use a reference to an
		 * instance of the class. You should use the class name instead
		 */
		System.out.println(StaticExample.staticInt);
		staticExample1.printMessage(); // calling an instance method
		
		/*
		 * Calling a static method does NOT require that you create an instance of your
		 * class. You simply use the class name to call the method. When a method or a field
		 * is marked static.
		 */
		StaticExample.printStaticMessage(); // calling a static method
	} // main()
	
	public void printMessage() {
		System.out.println("I am an instance method.");
	} // printMessage
	
	
	public static void printStaticMessage() {
		// You cannot access non-static methods inside a static block or method
		// printMessage()
		System.out.println("I am a static method.");
	}
} // StaticExample()


