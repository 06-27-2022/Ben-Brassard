import java.util.Scanner;

public class EvenOrOdd {

	public EvenOrOdd() {
		
	}
	public void formula(int num) {
		if(num % 2 == 0) {
			System.out.println(num + " is an even number.");
		} // if()
		else {
			System.out.println(num + " is an odd number.");
		} // else
	} // formula(int)
	
	public static void main(String[] args) {
		EvenOrOdd evenOrOdd = new EvenOrOdd();
		
		System.out.print("Type in a number: ");
		Scanner scan = new Scanner(System.in);
		
		int answer = scan.nextInt();
		
		evenOrOdd.formula(answer);
		
		scan.close();
	} // main()
}
