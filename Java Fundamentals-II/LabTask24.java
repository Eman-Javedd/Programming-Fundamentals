import java.util.Scanner;
	public class LabTask24 {
		static Scanner console = new Scanner (System.in);
		public static void main(String [] args) {
			int N, hours, minutes;
			System.out.println("Enter the number of minutes that passed since midnight: ");
			N = console.nextInt();

			hours = N/60;
			minutes = N%60;

			System.out.println("The time is " + hours + ":" + minutes);
			console.close();
		}
}