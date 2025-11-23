import java.util.Scanner;
	public class Activity6{
		public static void main(String [] args){
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter the number of packages purchased: ");
		int quantity = scanner.nextInt();
		double discount= 0;
		double pricePerPackage = 99;

		if (quantity >= 100){
			discount = 0.5;
		} else if (quantity >= 50){
			discount = 0.4;
		} else if (quantity >= 20){
			discount = 0.3;
		} else if (quantity >= 10){
			discount = 0.2;
		}
		
		double discountAmount = quantity * pricePerPackage * discount;
		double totalAmount = quantity * pricePerPackage - discountAmount;

		System.out.println("Discount amount: $" + String.format("%.2f", discountAmount));
		System.out.println("Total amount after discount: $" + String.format("%.2f", totalAmount));

		scanner.close();
	}
}