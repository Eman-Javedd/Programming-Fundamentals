import java.util.Scanner;
	public class Activity1{
		public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Computer choice");
		int ComputerChoice = (int) (Math.random()* 3);
		System.out.println("Computer Choice:" + ComputerChoice);
		System.out.println("Enter your choice (0 for Scissor, 1 for Rock, 2 for Paper):");
		int userChoice= input.nextInt();
		System.out.println("You chose:" + userChoice);
		
		if (userChoice== ComputerChoice){
			System.out.println("It's a draw! ");
		}
		else if ((userChoice == 0 && ComputerChoice==2) || (userChoice == 1 && ComputerChoice ==0) || (userChoice==2 && ComputerChoice ==1)) {
			System.out.println("You win");}
		else {
			System.out.println("Computer wins!");
			}
		input.close();
	}
}
		
