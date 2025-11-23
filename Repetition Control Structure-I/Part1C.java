import java.util.Scanner;

public class Part1C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of integers (N): ");
        int N = input.nextInt();
        int sum = 0;

        System.out.println("Enter " + N + " integers:");
        for (int i = 1; i <= N; i++) {
            int number = input.nextInt();
            sum += number;
        }

        System.out.println("Sum = " + sum);
    }
}
