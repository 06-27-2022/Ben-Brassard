
public class ArraySums {

	static int findSumOfArray(int[] arr) {
		
		int sum = 0;
		
		for (int i : arr) {
			sum += i;
		} // for()
		
		return sum;
	} // findSumOfArray()
	
	
	public static void main(String[] args) {
		int[] arr1 = {3, 2, 3};
		int[] arr2 = {1};
		int[] bigArray = {3, 4, 332, 4, 3, 222, 402, 8392, 83, 2, 1, 244,
				5, 4, 33, 842, 0, 0, 0, 2, 3, 4, 0, 8871, 3, 1, 7, 9, 900,
				1, 19, 23, 98, 89, 733, 437, 87, 98};
		int[] emptyArray = {};
		
		System.out.println("The sum of arr1 is " + findSumOfArray(arr1));
		System.out.println("The sum of arr2 is " + findSumOfArray(arr2));
		System.out.println("The sum of bigArray " + findSumOfArray(bigArray));
		System.out.println("The sum of emptyArray is " + findSumOfArray(emptyArray));
		
	} // main
} // ArraySums
