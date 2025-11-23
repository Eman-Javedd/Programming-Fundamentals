import java.util.Scanner;

public class LabTask2a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an ASCII code: ");
        int code = input.nextInt();

        if (code >= 0 && code <= 127) {
            char character = (char) code; // Convert integer to character
            System.out.println("The character for ASCII code " + code + " is " + character);
        } else {
            System.out.println("Invalid input! ASCII code must be between 0 and 127.");
        }
    }
}
