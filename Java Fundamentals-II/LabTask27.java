import java.util.Scanner;
	public class LabTask27 {
		public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int classAPrice = 20;
		int classBPrice = 15;
		int classCPrice = 10;
		int classDPrice = 5;

		System.out.println("Enter number of tickets sold for class A: ");
		int classATickets = scanner.nextInt();

		System.out.println("Enter number of tickets sold for class B: ");
		int classBTickets = scanner.nextInt();

		System.out.println("Enter number of tickets sold for class C: ");
		int classCTickets = scanner.nextInt();

		System.out.println("Enter number of tickets sold for class D: ");
		int classDTickets = scanner.nextInt();

		int classAIncome = classATickets * classAPrice;
		int classBIncome = classBTickets * classBPrice;
		int classCIncome = classCTickets * classCPrice;
		int classDIncome = classDTickets * classDPrice;

		int totalIncome =classAIncome + classBIncome + classCIncome + classDIncome;

		System.out.println("\nIncome from ticket sales:");
		System.out.println("Class A : $" + classAIncome);
		System.out.println("Class B : $" + classBIncome);
		System.out.println("Class C : $" + classCIncome);
		System.out.println("Class D : $" + classDIncome);
		System.out.println("Total income: $" + totalIncome);

		scanner.close();
	}
}