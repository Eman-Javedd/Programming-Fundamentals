import java.util.Scanner;
	public class LabTask25{
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double cartonCapacity = 3.78;
		double costPerLiter = 0.38;
		double profitPerCarton = 0.27;

		System.out.println("Enter the total amount ofmilk produced in the morning (in liters) :");
		double totalMilk = input.nextDouble();
		
		int cartonsNeeded = (int) Math.round (totalMilk / cartonCapacity);

		double cost = totalMilk * costPerLiter;

		double profit = cartonsNeeded * profitPerCarton;

		System.out.println("Number of milk cartons needed: " + cartonsNeeded);
		System.out.println("Cost of producing milk: $" + cost);
		System.out.println("Profit for producing milk: $" + profit);

		input.close();
	}
}