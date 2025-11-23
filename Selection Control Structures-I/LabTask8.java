import java.util.Scanner;

	public class LabTask8 {
   		 public static void main(String[] args) {
       		 Scanner scanner = new Scanner(System.in);

       		 // Prompt user for month, day, and year
       		 System.out.print("Enter month (in numeric form): ");
      		  int month = scanner.nextInt();
       		 System.out.print("Enter day: ");
       		  int day = scanner.nextInt();
        	 System.out.print("Enter two-digit year: ");
        	  int year = scanner.nextInt();

        	// Check if month times day equals year
      		  if (month * day == year) {
          	  System.out.println("The date is magic.");
       		 } else {
         	   System.out.println("The date is not magic.");
       		 }

       		 scanner.close();
   	 }
}