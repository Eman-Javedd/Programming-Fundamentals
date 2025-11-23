import java.util.Scanner;

public class LabTask4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.println("Choose pattern (i, ii, iii, iv, v):");
            String pattern = sc.next();

            System.out.println("Enter number of rows:");
            int n = sc.nextInt();

            switch (pattern) {
                case "i":
                    for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= n; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case "ii":
                    for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case "iii":
                    for (int i = 1; i <= n; i++) {
                        for (int j = i; j < n; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case "iv":
                    for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case "v":
                    for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print(i);
                        }
                        System.out.println();
                    }
                    break;

                default:
                    System.out.println("Invalid pattern choice!");
            }

            System.out.println("Do you want to continue? (y/n)");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        sc.close();
    }
}