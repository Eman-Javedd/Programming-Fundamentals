import java.util.Scanner;
	public class LabTask4 {
		static Scanner console=new Scanner(System.in);
		public static void main (String [] args ) {
			
			int a, b, x, m, n, o ;
			
			System.out.println("Enter the first integer: ");
			a=console.nextInt();
			
			System.out.println("Enter the second integer: ");
			b=console.nextInt();
			
			if (a<b)
				{ System.out.println("The smaller value is: " + a);
				}
			else 
				{ System.out.println("The smaller value is: " + b);
				}
			if (a>b) 
				{ System.out.println("The bigger value is: " + a);
				}
			else
				{ System.out.println("The bigger value is: " + b);
				}

			System.out.println("Enter the value of x: ");
			x=console.nextInt();

			if (x>0)
				{System.out.println("1");
				}
			
			else if (x<0)
				{System.out.println("-1");
				}
			else 
				{System.out.println("0");
				}
			System.out.println("Enter 1st number:");
			m=console.nextInt();

			System.out.println("Enter 2nd number:");
			n=console.nextInt();

			System.out.println("Enter 3rd number:");
			o=console.nextInt();

			if ( (m<n) && (m<o) )
				{System.out.println( m + " is the smallest number. ");
				}
			
			else if ( (n<o) && (n<m) )
				{System.out.println(n + " is the smallest number>");
				}
			
			else 
				{System.out.println(o + " is the smallest number. ");
				}
			
			console.close();
	 }
}