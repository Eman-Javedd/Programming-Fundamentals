import java.util.Scanner;
	public class LabTask23{
		public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of students in class a:");
		int a= scanner.nextInt();
		System.out.println("Enter number of students in class b:");		
		int b = scanner.nextInt();
		System.out.println("Enter number of students in class c:");
		int c = scanner.nextInt();

		int desksA = (a + 1)/2;
		int desksB = (b + 1)/2;
		int desksC = (c + 1)/2;
		int totalDesks = desksA + desksB + desksC;

		System.out.println("Minimum number of desks to purchase:" + totalDesks);

		scanner.close ();
	}
}