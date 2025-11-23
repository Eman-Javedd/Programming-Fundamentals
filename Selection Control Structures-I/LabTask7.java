import java.util.Scanner;

	public class LabTask7 {
   	 	public static void main(String[] args) {
        	Scanner scanner = new Scanner(System.in);

       		 System.out.println("Enter dimensions of Rectangle 1:");
       		 System.out.print("Length: ");
       		 double length1 = scanner.nextDouble();
      	 	 System.out.print("Width: ");
        	 double width1 = scanner.nextDouble();

       		 System.out.println("\nEnter dimensions of Rectangle 2:");
       		 System.out.print("Length: ");
       		 double length2 = scanner.nextDouble();
       		 System.out.print("Width: ");
       		 double width2 = scanner.nextDouble();

       		 // Calculate areas
       		 double area1 = length1 * width1;
       		 double area2 = length2 * width2;

       		 if (area1 > area2) {
       		     System.out.println("\nRectangle 1 has the greater area.");
       		 } else if (area2 > area1) {
        	     System.out.println("\nRectangle 2 has the greater area.");
       		 } else {
        	     System.out.println("\nThe areas of the rectangles are the same.");
        	 }

        	 scanner.close();
   	 }
}