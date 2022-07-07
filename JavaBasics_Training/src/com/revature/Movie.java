package com.revature;

import java.time.LocalDate;

public class Movie extends Media{
	
	String director;
	
	public static void main(String[] args) {
		Media myMedia = new Media();
		myMedia.title = "Life is Beautiful";
		myMedia.dateReleased = LocalDate.of(2022, 7, 7);
		
		Book myBook = new Book();
		myBook.setNumOfPages(100);
		// This is called encapsulation. You are hiding the direct access to the fields
		System.out.println(myBook.getNumOfPages());
		myBook.setPublishingCompany("Revature Publishing");
	} // main()
} // Movie()
