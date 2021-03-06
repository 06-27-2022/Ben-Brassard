package com.revature.dsa;

public class UsingArrays {
	
	float myFloat;
	double myDouble;
	char myChar;
	boolean myBoolean;
	byte myByte;
	short myShort;
	int myInt;
	long myLong;
	
	public static void main(String[] args) {
		
		// Creating arrays
		int[] arr = {3, 22, 98, 12};
		int[] arr2 = new int[10];
		int[] arr3 = new int[]{3, 2, 12, 3, 5};
		
		// Accessing single elements in array
		// int a = arr[1];
		
		System.out.println(arr[3]);
		arr[3] = 50;
		System.out.println(arr[3]);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		} // for()
		
		// All arrays have primitive values, even if you don't give them one
		for(int i =0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		} // for()
		
		UsingArrays usingArrays = new UsingArrays();
		
		System.out.println(usingArrays.myBoolean);
		System.out.println(usingArrays.myFloat);
		// The default value for char is null character (\u0000)
		System.out.println(usingArrays.myChar);
	} // main
} // UsingArrays
