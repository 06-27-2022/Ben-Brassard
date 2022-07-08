package com.revature.keywords;

import java.util.ArrayList;
import java.util.List;

/*
 * There are many reserved in Java; generally your IDE highlights
 * 
 * The "final" keyword has 3 different uses in Java. It can
 * be used:
 * 
 * 1. with classes: Prevents a class from being subclassed
 * 2. with methods: prevents a method from ever being overriden
 * 3. with variables: prevents us from using the assignment operator
 * 		again.
 */
public final class FinaleExample {
	
	/*
	 * If you have a final variable, be careful and make sure that you
	 * initialize the variable pretty early as you required
	 * to do so.
	 * 
	 * Can do immediately declaration, in the constructor, or in an instance of
	 * a block.
	 */
	private final int finalInt;// = 9;
	
	public FinaleExample() {
		finalInt = 9;
	}
	

	public static void main(String[] args) {
		
		/*
		 * What if you wanted that to be final?
		 * Using final can ensure this but you can still
		 * change its underlying 
		 */
		final String myName = "Ben Brassard";
		final int numOfCards = 52;
		
		// myName = "Sam Brassard";
		final List<String> names = new ArrayList<>();
		names.add("Ben");
		names.add("Sam");
		names.add("Sophie");
		names.add("Hailey");
		names.add("Kenna");
		names.add("Abby");
	} // main()
	
	/*
	 * Final method example
	 */
	
	public final void printMessage() {
		System.out.println("You can't change me!");
	}
	
	
}

class FinalExampleChild /*extends FinaleExample*/{
	
//	@Override
//	public final void printMessage() {
//		
//	}
	
}