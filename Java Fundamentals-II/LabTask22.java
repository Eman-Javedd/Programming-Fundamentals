import java.util.Scanner;
	public class LabTask22{
		public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value of N: ");
		System.out.println("Enter the value of K: ");

		int N = scanner.nextInt();
		int K= scanner.nextInt();

		int applesPerStudent = K/N;
		int applesRemaining = K% N;

		System.out.println(applesPerStudent);
		System.out.println(applesRemaining);

		scanner.close();
	}
}