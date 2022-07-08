package com.revature.abstracttypes;

/*
 * Java doesn't support multiple inheritance
 * So we have to use inferences
 * Key differences:
 * 1. It is implicitly abstract; this means that you don't have to type
 * 'abstract' in front of it.
 * 
 * 2. All of its methods are assumed to be abstract; this means that you don't
 * have to type 'abstract' in front of the methods
 * 
 * 3. All of its methods are also assumed to be public: this means that you don't have
 * to type 'public' in front of the methods.
 */
interface Mammal{

	/*
	 * It is also possible for interfaces to have fields.
	 * Interfaces can extend other interfaces
	 */
	public static final int BRAIN_COMPLEXITY = 9001;
	void beWarmBlooded();
	/*
	 * What if you want default implementations?
	 * 
	 * 1. To make the method static: Static methods must have implementations
	 * 2. To use the "default" keyword. Default methods must have implementations too.
	 */
	
	static void drinkMilk() {
		System.out.println("Baby mammals drink milk.");
	}
	
	default void liveBirth() {
		System.out.println("Mammals don't lay eggs.");
	}
}

