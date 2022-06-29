public class Looping {
	public static void main(String[] args) {
		
		// for loop
		/*
		for (int i = 0; i < 17; i++) {
			System.out.println(i);
		} // for ()
		*/
		
		// while loops
		/*
		int wEx = 0;
		boolean keepGoing = true;
		
		while(wEx < 10) {
			System.out.println(wEx);
			wEx++;
		} // while()
		
		
		while(keepGoing) {
			System.out.println("Hi!!");
			wEx++;
			
			if(wEx == 10) {
				break;
			} // if ()
		} // while ()
		
		*/
		
		// do while loop, will run at least once if while isn't true
		/*
		boolean keepGoing = false;
		do {
			System.out.println("DoWhile works!");
		} while (keepGoing);
		*/
		
		// Enhanced for loop (for each)
		int[] numberArray = {1, 2, 3, 4, 10, 35, 16};
		
		for (int num: numberArray) {
			System.out.println(num);
		} // for ()
		
	} // main()
} // Looping ()