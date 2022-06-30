package com.revature;

public class RevatureEmployee {
	
	String name;
	int age;
	String department;
	
	RevatureEmployee(String initialName, int initialAge, String initialDepartment){
		name = initialName;
		age = initialAge;
		department = initialDepartment;
		
	} // RevatureEmployee()
	
	
	
	public static void main(String[] args) {
		
		RevatureEmployee ben = new RevatureEmployee("Ben", 22, "Training");
		
//		ben.name = "Ben";
//		ben.age = 22;
//		ben.department = "Training";
		
	} // main

} // RevatureEmployee
