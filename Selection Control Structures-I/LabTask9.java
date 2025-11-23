import java.util.Scanner;

public class LabTask9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of coins to make exactly $1:");

        System.out.print("Pennies: ");
        int pennies = input.nextInt();

        System.out.print("Nickels: ");
        int nickels = input.nextInt();

        System.out.print("Dimes: ");
        int dimes = input.nextInt();

        System.out.print("Quarters: ");
        int quarters = input.nextInt();

        int totalCents = pennies * 1 + nickels * 5 + dimes * 10 + quarters * 25;

        if (totalCents == 100) {
            System.out.println("Congratulations! You win the game 🎉 You made exactly $1!");
        } else if (totalCents > 100) {
            System.out.println("Sorry, the amount you entered is more than $1.");
        } else {
            System.out.println("Sorry, the amount you entered is less than $1.");
        }

        input.close();
    }
}