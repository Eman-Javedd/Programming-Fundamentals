import java.util.Scanner;
	public class LabTask26 {
		public static void main(String [] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the pay rate per hour: $");
		double payRate = input.nextDouble();
		System.out.println("Enter the number of hours worked each week:");
		double hoursPerWeek = input.nextDouble();

		int weeks = 5;
		double taxRate = 0.14;
		double clothesPercentage = 0.10;
		double suppliesPercentage = 0.01;
		double savingsBondsPercentage = 0.25;
		double parentsContributionPerDollar = 0.50;

		double totalIncome = payRate * hoursPerWeek * weeks;
		double incomeAfterTaxes = totalIncome * (1- taxRate);
		double moneyForClothes = incomeAfterTaxes * clothesPercentage;
		double moneyForSupplies = incomeAfterTaxes * suppliesPercentage;
		double remainingAfterExpenses =incomeAfterTaxes - moneyForClothes - moneyForSupplies;
		double moneyForSavingsBonds = remainingAfterExpenses * savingsBondsPercentage;
		double parentsContribution = moneyForSavingsBonds * parentsContributionPerDollar;

		System.out.println("\nResults:");
		System.out.printf(" a. Income before Taxes:$%.2f, after taxes: $%.2f\n", totalIncome,incomeAfterTaxes);
		System.out.printf(" b. money spent on clothes and accessories: $%.2f\n", moneyForClothes);
		System.out.printf(" c. Money spent on school supplies: $%.2f\n", moneyForSupplies);
		System.out.printf(" d. Money spent on savings bonds: $%.2f\n", moneyForSavingsBonds);
		System.out.printf(" e. Money parents spent on additional savings bonds $%.2f\n", parentsContribution);
	}
}