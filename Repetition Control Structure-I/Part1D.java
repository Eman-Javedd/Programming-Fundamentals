import java.util.Scanner;

public class Part1D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter N: ");
        int N = input.nextInt();
        int sum = 0;

        for (int i = 1; i <= N; i++) {
            sum += i * i * i;  // cube of i
        }

        System.out.println("Sum of cubes = " + sum);
    }
}
