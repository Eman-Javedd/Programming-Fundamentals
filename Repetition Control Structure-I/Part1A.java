import java.util.Scanner;

public class Part1A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A, B;

        System.out.print("Enter A: ");
        A = input.nextInt();
        System.out.print("Enter B: ");
        B = input.nextInt();

        for (int i = A; i <= B; i++) {
            System.out.print(i + " ");
        }
    }
}