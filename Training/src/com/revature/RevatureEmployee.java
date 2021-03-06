package com.revature;

public class RevatureEmployee {
	
	String name;
	int age;
	String department;
	float salary;
	
	RevatureEmployee(String initialName, int initialAge, String initialDepartment,
			float salary){
		this.name = initialName;
		this.age = initialAge;
		this.department = initialDepartment;
		this.salary = salary;
		
	} // RevatureEmployee()
	
	void printEmployeeDetails() {
		System.out.print("Employee Name: " + this.name + ", Employee Age: "
				+ this.age + ", Employee Dept: " + this.department +
				", Salary: " + this.salary);
		System.out.println("\n");
		return; 
	} // printEmployeeDetails()
	
	int calculateRemainingWorkYears() {
		
		int remainingYears = 55 - this.age;
		
		return remainingYears;
	} // calculateRemainingWorkYears()
	
	void giveRaise(float raise) {
		this.salary += raise;
	} // giveRaise
	
	public static void main(String[] args) {
		
		RevatureEmployee ben = new RevatureEmployee("Ben", 22, "Training", 65f);
		
//		ben.name = "Ben";
//		ben.age = 22;
//		ben.department = "Training";
		
		ben.giveRaise(1000000);
		ben.printEmployeeDetails();
		
		int benRemainingWorkYears = ben.calculateRemainingWorkYears();
		
		System.out.println("Ben can retire in " + benRemainingWorkYears + " years.");
	} // main

} // RevatureEmployee
