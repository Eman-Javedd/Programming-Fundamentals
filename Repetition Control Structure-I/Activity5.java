import java.util.Scanner;
	public class Activity5{
		public static void main(String [] args){
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the weight of the package in pounds:");
		double weight = input.nextDouble();
		
	if ((weight == 2) || (weight < 2)){
		System.out.println("The shipping charge is $1.10");
		} else if ((weight > 2) && (weight < 6)) {
		System.out.println("The shipping charge is $2.20");
		} else if ((weight > 6) && (weight < 10)){
		System.out.println("The shipping charge is $3.70");
		} else {
		System.out.println("The shipping charge is $3.80");
		}
		input.close();
	}
}