package com.revature;

/*
 * Java uses curly braces to denote a variabl's scope. A variable
 * is in scope for the entirety of the "block" inside of which it was declared.
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
	String habitat;
	/**
	 * Height measured in feet
	 */
	int height;
	
	
	DinosaurxD(){
		
	} // DinosaurxD
	
	/**
	 * 
	 * @param name
	 * @param habitat
	 * @param height
	 * 
	 * All of the parameters here are local variables. This means
	 * that they are only in scope for this particular constructor.
	 */
	DinosaurxD(String name, String habitat, int height) {
		
		this.name = name;
		this.habitat = habitat;
		this.height = height;
		
		
	} // DinosaurxD()
	
	public static void main(String[] args) {
		
		DinosaurxD trex = new DinosaurxD("T-Rex", "Land", 100);
		
	} // main()
	
	
}
