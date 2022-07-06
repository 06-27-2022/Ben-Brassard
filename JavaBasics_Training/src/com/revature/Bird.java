package com.revature;

/*
 * When we talk about inheritance, we are talking about the ability for one class to
 * inherit properties and behaviors from another class. The class from which a class inherits
 * is called its parent class or "super" class.
 * 
 * In order to make a child class, you must use the "extends" keyword.
 * 
 * Please note that Java does NOT support multiple inheritance with the same class.
 */

public class Bird extends DinosaurxD{
	
	/*
	 * When you declare properties on a child class, be sure that you do not
	 * accidentally "shadow" the parent class's properties. Shadowing occurs
	 * when you effectively hide the parent class's properties by naming a child class'
	 * properties the exact same thing that you named the parent class' properties.
	 */
	String chirp;
	
	Bird() {
		/*
		 * The implementation (logic inside of the curly braces)
		 * for a constructor is never really empty. The very first line of any constructor is
		 * actually a call to the parent class's constructor.
		 * 
		 * This means that this happens implicitly: super()
		 * 
		 * Please understand that if you choose to type super(), it MUST be the 
		 * first line of the constructor.
		 */
		super();
	} // Bird()
	
	Bird(String name, String habitat) {
		super(name, habitat);
		this.height = 0;
	} // Bird()
	
	Bird(String name, String habitat, int height) {
		super(name, habitat, height);
	} // Bird(String, String, int)
	
	@Override
	void eat() {
		/*
		 *  super keyword: this keyword is used to refer to the super class (parent class)
		 *  instance of a method or constructor
		 *  
		 *  It can also be used to refer to the super class' instance
		 */
		
		// This calls the parent's overridden version of the eat method
		super.eat();
		System.out.println("Eats a ton!");
	} // eat()
	
	void fly( ) {
		System.out.println(super.name + " can fly!");
	}
	
	public static void main(String[] args) {
		
		/*
		 * Please note that a Bird object has the properties of a
		 * Dinosaur object: name, habitat, and height
		 */
		Bird bigBird = new Bird();
		
		
		/*
		 * Method Overriding allows a child class to provide a specific implementation
		 * of a method
		 * 
		 * With method overriding you have the same method name and same method
		 * signature but different implementation
		 * 
		 */
		
		bigBird.eat();
		bigBird.eat(10);
		
		bigBird.fly();
		
	} // main()
	
} //
