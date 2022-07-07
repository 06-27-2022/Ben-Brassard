package com.revature.pkg2;

import java.time.LocalDate;

import com.revature.Media;

public class Song extends Media{
	
	String artist;
	
	public Song() {
		this.title = "n/a";
		this.dateReleased = LocalDate.now();
		
				
	}
	
	public Song(String title, LocalDate dateReleased, String intendedAudience,
			String artist) {
		super(title, dateReleased, intendedAudience);
		this.artist = artist;
	} // Song()
	
	public static void main(String[] args) {
		Media myMedia = new Media();
		/*
		 * This isn't allowed because intendedAudience is only directly
		 * from the com.revature package due to intendedAudience having
		 * default.
		 */
		// myMedia.intendedAudience = "kids";
		
	}
} // Song()
