package com.revature.abstracttypes;

/*
 * 
 */
public abstract class Animal {
	
	private int age;
	private int numOfOrgans;
	private String habitat;
	
	public Animal() {
		
	}
	
	public Animal(int age, int numOfOrgans, String habitat) {
		this.age = age;
		this.numOfOrgans = numOfOrgans;
		this.habitat = habitat;
	}
	
	/*
	 * An abstract method cannot be "final". Also can't be "static"
	 */
	public abstract void makeSound();
	
	public void eat() {
		System.out.println("Chomp");
	}
	
	public void sleep() {
		System.out.println("zzzzzzzzzz");
	}
}
