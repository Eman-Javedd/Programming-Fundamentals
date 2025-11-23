import java.util.Scanner;
public class LabTask1 {
    // (a) 
    public static int sumDigits(long n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;  
            n /= 10;     
        }
        return sum;
    }

    // (b) 
    public static void reverse(int number) {
        while (number != 0) {
            int digit = number % 10;     
            System.out.print(digit);     
            number /= 10;                
        }
        System.out.println();            
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer to find sum of digits: ");
        long num1 = input.nextLong();
        System.out.println("Sum of digits: " + sumDigits(num1));

        System.out.print("Enter an integer to reverse: ");
        int num2 = input.nextInt();
        System.out.print("Reversed number: ");
        reverse(num2);

        input.close();
    }
}
