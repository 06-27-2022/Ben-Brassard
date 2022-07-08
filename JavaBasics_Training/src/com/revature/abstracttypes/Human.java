package com.revature.abstracttypes;

public class Human extends Animal{
	
	public Human() {
		
	}
	
	@Override
	public void makeSound() {
		System.out.println("Hello!");
	}
}
