package com.revature.dsa;

public class Strings {

	public static void main(String[] args) {
		char[] myFirstName = {'B', 'E', 'N'};
		
		char[] myFullName = new char[12];
		
		for(int i = 0; i < myFirstName.length; i++) {
			myFullName[i] = myFirstName[i];
		} // for()
		
		String myBetterName = "Ben";
		
		myBetterName = myBetterName.concat(" Brassard");
		myBetterName = myBetterName.toUpperCase();
		System.out.println(myBetterName);
		
		String badPracticeName = new String("Ben");
		
	} // main
} // Strings
