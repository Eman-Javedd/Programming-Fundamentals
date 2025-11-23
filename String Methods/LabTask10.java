import java.util.Scanner;
	public class LabTask10{
    		public static void main(String[] args) {
        	Scanner input = new Scanner(System.in);
        	System.out.println("Input:");
        	String str = input.nextLine();

        	System.out.println(str.charAt(2));

        	System.out.println(str.charAt(str.length() - 2));

       		 System.out.println(str.substring(0, 5));

	        System.out.println(str.substring(0, str.length() - 2));
	
	        String evenChars = "";
	        for (int i = 0; i < str.length(); i += 2) {
 	           evenChars = evenChars + str.charAt(i);
 	        }
		System.out.println(evenChars);

	        String oddChars = "";
	        for (int i = 1; i < str.length(); i += 2) {
	            oddChars = oddChars + str.charAt(i);
	        }
	        System.out.println(oddChars);
	
	        String reverse = "";
	        for (int i = str.length() - 1; i >= 0; i--) {
	            reverse = reverse + str.charAt(i);
	        }
	        System.out.println(reverse);

	        String reverseEverySecond = "";
	        for (int i = str.length() - 1; i >= 0; i -= 2) {
	            reverseEverySecond = reverseEverySecond + str.charAt(i);
	        }
	        System.out.println(reverseEverySecond);
	
	        System.out.println(str.length());
	    }
	}
