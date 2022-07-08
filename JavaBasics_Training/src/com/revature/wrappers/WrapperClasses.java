package com.revature.wrappers;

import java.util.ArrayList;
import java.util.List;

import com.revature.pkg2.Song;

public class WrapperClasses {

	public static void main(String[] args) {
		
		/*
		 * Java has 8 primitive data types. These are NOT Objects types.
		 * you can't call any methods on these values
		 */
		
		int num = 8;
		
		/*
		 * There are Object representations for all of the primitives in Java.
		 * These are referred as Wrapper Classes
		 */
		
		Integer myInt = 0;
		Long myLong = 19L;
		Short myShort = 2;
		Byte myByte = 5;
		Double myDouble = 78D;
		// and so on
		
		/*
		 * Note that you should NOT use the constructors as they're
		 * deprecated. Java is capable of taking a primitive value and
		 * "autoboxing" it into an Object type.
		 * 
		 * These wrapper classes are really useful utilities for converting
		 * between different types. The 'parse' method is really
		 * useful for moving between a String value and a primitive value
		 * 
		 */
		
		String oneTwoThree = "123";
		int actualNum = Integer.parseInt(oneTwoThree);
		
		/*
		 * Wrapper classes are very useful because we can't use
		 * primitives for everything in Java. For instance, if you
		 * wish to use Java collections with generics, you
		 * must use wrapper classes.
		 */
		
		// ArrayList is used as a resizeable array.
		/*
		 * Generally when you use a List, it is recommended that you use
		 * generics. Generics impose a type in a List, meaning you can only
		 * add that certain type.
		 */
		List<Integer> myList = new ArrayList<>();
		
		// myList.add("Ben");
		myList.add(8);
		myList.add(100);
		// myList.add(new Song());
		
		System.out.println(myList);
		
	} // main()
}
