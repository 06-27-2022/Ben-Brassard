package com.revature;

public class Book extends Media{
	private int numOfPages;
	private String publishingCompany;
	
	public Book() {
		
	} // Book()
	
	/*
	 * I cannot directly access numOfPages outside this class, even so I want a way
	 * to be able to change the number of pages. In this case, I can make a method
	 * that allows me to indirectly access the number of pages.
	 * 
	 * Methods have logic that can prevent a variable assignment
	 * 
	 * This method is a conventional method called a "setter". Also called "mutator"
	 */
	public void setNumOfPages(int numOfPages) {
		if(numOfPages < 1) {
			System.out.println("Invalid number of pages.");
		} // if()
		else this.numOfPages = numOfPages;
	} // setNumOfPages()
	
	/*
	 * We can also make a method that allows for us to indirectly read from the variables
	 * 
	 * This is a conventional method called a "getter". Also called "accessor"
	 */
	public int getNumOfPages() {
		return this.numOfPages;
	}
	
	// Writing a getter and setter for the publishingCompany field
	
	public void setPublishingCompany(String publishingCompany) {
		this.publishingCompany = publishingCompany;
	}
	
	public String getPublishingCompany() {
		return this.publishingCompany;
	}
} // Book
