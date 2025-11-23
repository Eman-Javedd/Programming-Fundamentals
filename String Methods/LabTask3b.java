import java.util.Scanner;

public class LabTask3b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter a hex digit: ");
        String hex = input.next().toUpperCase(); 

        
        if (hex.length() == 1 && (
                (hex.charAt(0) >= '0' && hex.charAt(0) <= '9') ||
                (hex.charAt(0) >= 'A' && hex.charAt(0) <= 'F'))) {

            int decimalValue = Integer.parseInt(hex, 16);

            String binaryValue = Integer.toBinaryString(decimalValue);

            System.out.println("The binary value is " + binaryValue);
        } else {
            System.out.println(hex + " is an invalid input");
        }
    }
}
