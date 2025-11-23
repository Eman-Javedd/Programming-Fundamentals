import java.util.Scanner;
	public class LabT2 {
		public static void main(String [] args){
		Scanner input = new Scanner (System.in);
		int a = 1;
		int b = 1;
		System.out.println("Enter an integer :");
		int n = input.nextInt();
		while (a <= n){
		b = b * a;
		a++;
		}
		System.out.println("The factorial of " + n + " = " + b);
		input.close();
		}
	}