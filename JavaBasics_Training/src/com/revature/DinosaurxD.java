package com.revature;

/*
 * Java uses curly braces to denote a variabl's scope. A variable
 * is in scope for the entirety of the "block" inside of which it was declared.
 * 
 * Recall that every class inherits from the Object class in Java. We now know that inheritance
 * suggests that we inherit behavior and state from the parent class. This would suggest that methods
 * from the Object class must be inherited by all classes in Java.
 */
public class DinosaurxD {

	/*
	 * Classes can have state (fields) and behavior (methods)
	 *
	 */
	
	/**
	 * This type of comment is used to generate JavaDocs for our
	 * source code. Can be very helpful once projects get larger.
	 * Name corresponds to the dinosaur's name
	 */
	String name;
	/**
	 * This variable does not point to an object.
	 */
	String habitat;
	/**
	 * Height measured in feet
	 * 
	 * This has a default value of 0.
	 */
	int height;
	
	// Polymorphism means many forms
	/* Overloading - when you have the same method name with
	* a different method sign
	*/

	// no args contructor
	DinosaurxD(){
		
	} // DinosaurxD
	
	DinosaurxD(String name, String habitat) {
		this.name = name;
		this.habitat = habitat;
	} // DinosaurxD
	/**
	 * 
	 * @param name
	 * @param habitat
	 * @param height
	 * 
	 * All of the parameters here are local variables. This means
	 * that they are only in scope for this particular constructor.
	 * This is an example of Constructor Overloading. Parameterized
	 * Constructor.
	 */
	DinosaurxD(String name, String habitat, int height) {
		
		// Contructor Chaining
		this(name, habitat);
		
		// this.name = name;
		// this.habitat = habitat;
		this.height = height;
		
		
	} // DinosaurxD()
	
	void roar() {
		System.out.println("Roar very ferociously");
	} // roar()
	
	// Method Overloading
	void roar(String name) {
		System.out.println(name + " roars!");
	} // roar()
	
	void eat() {
		System.out.println("*eats loudly*");
	} // eat()
	
	void eat(int timesADay) {
		System.out.println("*eats loudly* " + timesADay + " times a day.");
	} // eat()
	
	/*
	 * The toString method is inherited from the Object class. It returns a String representation
	 * of your Object.
	 * 
	 * Please note that Java knows that it should call toString when you want
	 * to print an object. As such, you rarely have to call it yourself
	 */
	@Override
	public String toString() {
		
		return "Name: " + this.name + ", Habitat: " + this.habitat + ", Height: " + this.height;
	}
	
	public static void main(String[] args) {
		
		/*
		 * Unlike instance variables, local variables must be initialized
		 * before you use them. In other works, a variable declaration will not suffice.
		 * You must make sure that a local variable points to some value or object before using
		 * it. Yes, this is even true for primitive types.
		 */
		
		DinosaurxD trex = new DinosaurxD("T-Rex", "Land", 100);
		DinosaurxD triceratops = new DinosaurxD("Triceratops", "Land", 40);
		DinosaurxD pterodactyl = new DinosaurxD("Pterodactyl", "Land, but they fly", 30);
		
		DinosaurxD[] dinosaurs = {trex, triceratops, pterodactyl};
		
		// Let's say we want to iterate over our dinosaurs using loop
		for(DinosaurxD dino : dinosaurs) {
			if(!dino.habitat.equals("Land")) {
				// Continue
				continue;
			} // if()
			System.out.println(dino.name + " ");
		} // for()
		
		trex.eat();
		trex.eat(10);
		System.out.println(triceratops);
	} // main()
	
	
}
