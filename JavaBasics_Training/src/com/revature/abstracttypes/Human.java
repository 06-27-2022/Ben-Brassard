package com.revature.abstracttypes;

public class Human extends Animal implements Mammal{
	
	public Human() {
		
	}
	
	@Override
	public void makeSound() {
		System.out.println("Hello!");
	}

	@Override
	public void beWarmBlooded() {
		System.out.println("High 90 blood temp");
		
	}
}
