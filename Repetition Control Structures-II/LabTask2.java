import java.util.Scanner;

	public class LabTask2 {
    		public static void main(String[] args) {
        	Scanner scanner = new Scanner(System.in);
        	int count = 0;
	 	System.out.println("Enter numbers in the sequence (0 to stop):");

        	while (true) {
           	 int num = scanner.nextInt();

            	if (num == 0) {
                break;
           	 }

           	 if (num % 2 == 0) {
                count++;
            	}
        }

        	System.out.println("Number of even elements: " + count);

       		 scanner.close();
    	}
}