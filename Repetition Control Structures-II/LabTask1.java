import java.util.Scanner;

public class LabTask1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maxValue = Integer.MIN_VALUE; 
        int maxIndex = 0;                 
        int currentIndex = 1;             

        System.out.println("Enter numbers (0 to stop):");

        while (true) {
            int num = sc.nextInt();

            if (num == 0) {
                break;
            }

            if (num > maxValue) { 
                maxValue = num;
                maxIndex = currentIndex; 
            }

            currentIndex++; 
        }

        System.out.println("Index of the largest number: " + maxIndex);
        sc.close();
    }
}