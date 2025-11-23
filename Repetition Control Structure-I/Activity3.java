import java.util.Scanner;
	public class Activity3{
		public static void main(String[] args ){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = input.nextInt ();
		
		if (number > 0) {
			System.out.println("The number is positive.");
			if (number %2 == 0){
			System.out.println("It is an even number");
			} else {
				System.out.println("Its an odd number");
			}
		} else if (number < 0){
			System.out.println("The number is negative");
		} else {
			System.out.println("The number is zero");
			}
		input.close();
		}
	}