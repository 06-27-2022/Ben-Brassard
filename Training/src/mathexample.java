public class mathexample {
	
	public static void main(String[] args) {
		
		int a = 200;
		int b = 50;
		
		// Prints 250
		System.out.println(Math.addExact(a, b)); 
		
		/* Throws the ArithmeticException
		 * Math.addExact(Integer.MAX_VALUE, 1); 
		 */
		
		// Prints 150
		System.out.println(Math.subtractExact(a, b));
		
		// System.out.println(Math.subtractExact(Long.MIN_VALUE, 1));
		
		// Prints 51
		System.out.println(Math.incrementExact(b));
		
		// System.out.println(Math.incrementExact(Integer.MAX_VALUE));
		
		// Prints 199
		System.out.println(Math.decrementExact(a));
		// Math.decrementExact(Long.MIN_VALUE);
		
		// Prints 10,000
		System.out.println(Math.multiplyExact(a, b));
		
		// System.out.println(Math.multiplyExact(Long.MAX_VALUE, 2));
		
		// Prints -50
		System.out.println(Math.negateExact(b));
		
		// System.out.println(Math.negateExact(Integer.MIN_VALUE));
		
	} // main
} // mathexample 