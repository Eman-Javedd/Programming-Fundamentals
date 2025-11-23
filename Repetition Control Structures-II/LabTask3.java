import java.util.Scanner;

public class LabTask3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0; 
        int prev = sc.nextInt(); 
        if (prev == 0) { 
            System.out.println("0");
            return;
        }

        while (true) {
            int current = sc.nextInt();

            if (current == 0) { 
                break;
            }

            if (current > prev) { 
                count++;
            }

            prev = current; // update previous
        }

        System.out.println("Number of elements greater than the previous: " + count);
        sc.close();
    }
}