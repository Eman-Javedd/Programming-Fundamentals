import java.util.Scanner;
	public class LabTask6 {
    		public static void main(String[] args) {
      		 Scanner scanner = new Scanner(System.in);

       		 System.out.print("Enter a number (1-10): ");
       		 int number = scanner.nextInt();

      	 	 if (number >= 1 && number <= 10) {
          	  String romanNumeral = getRomanNumeral(number);
          	  System.out.println("The Roman numeral for " + number + " is " + romanNumeral);
       		 } else {
          	  System.out.println("Error: Number is outside the range of 1 through 10.");
       		 }
		 scanner.close();
  		  }

   		 public static String getRomanNumeral(int number) {
      		  switch (number) {
           		  case 1: return "I";
           		  case 2: return "II";
           		  case 3: return "III";
          		  case 4: return "IV";
          		  case 5: return "V";
          		  case 6: return "VI";
          		  case 7: return "VII";
         	 	  case 8: return "VIII";
          		  case 9: return "IX";
          		  case 10: return "X";
          		  default: return "";
     		   }
   	 	}
	}