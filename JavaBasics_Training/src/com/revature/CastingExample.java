package com.revature;

import com.revature.pkg2.Song;

/*
 * Remember that Java statically typed. All variables are declared with a type and
 * those variables must point to the appropriate values or objects.
 * 
 * What happens, however, when you are working with data and you realize that you want
 * to change the type of data you're working with? For instance, what if you start 
 * with one data type and then realize you need a different or smaller/larger date type.
 */
public class CastingExample {

	public static void main(String[] args) {
		
		long someNum = 32431231231L;
		
		/*
		 * Basic syntax for Casting from one primitive type to another. Please note
		 * that you can lose data when you cast from a larger data type to smaller data
		 * type.
		 */
		int myCastedNum = (int) someNum;
		
		System.out.println(myCastedNum);
		
		/*
		 * You can also Object types, BUT you need to be mindful about what the instance (object)
		 * is.
		 * 
		 * Let's start with a lesson in "covariance". This term simply refers to using an object
		 * type as your reference/variable type while the instance is a child type.
		 */
		
		Media myMovie = new Movie();
		Media myBook = new Book();
		Media mySong = new Song();
		Media myMedia = new Media();
		
		/*
		 * You can either "downcast" or "upcast" your types. Downcasting entails
		 * moving from a narrower type (super type) to a broader type (child type)
		 */
		
		Book castedBook = (Book) myBook;
		
		/*
		 * If you attempt to downcast to a type that the Object isn't
		 * (myMedia is NOT pointing to a Book object as we see above), the cast is
		 * going to fail. A ClassCastException will be thrown.
		 */
		Book anotherCastedBook = (Book) myMedia;
	} // main()
}
