import java.util.Scanner;
	public class LabTask21{
	static Scanner console= new Scanner (System.in);

		public static void main(String[] args){

		System.out.print("Enter a decimal number : ");
		double amount = console.nextDouble();
		double dollar=amount;
		System.out.println(" dollars= "+ dollar);
		
		amount=amount *100;
		double cents=amount;
		System.out.println("cents= "+ cents);

		dollar = cents /100;
		cents =cents%100;
		
		double quarters = cents /25;
		cents=cents%25;

		double dimes = cents /10;
		cents=cents% 10;

		double nickels = cents / 5;
		cents=cents% 5;

		double pennies = cents;

		System.out.println("Quarters:" +quarters);
		System.out.println("Dimes:" +dimes);
		System.out.println("Nickels:" +nickels);
		System.out.println("Pennies:" +pennies);
	}
}