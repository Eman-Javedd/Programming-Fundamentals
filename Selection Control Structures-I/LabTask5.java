import java.util.Scanner;
	public class LabTask5
	{
		static Scanner console=new Scanner(System.in);
		public static void main (String [] args)
		{
			int a, b, c ;

			System.out.println("Enter number 1: ");
			a=console.nextInt();

			System.out.println("Enter number 2: ");
			b=console.nextInt();
		
			System.out.println("Enter number 3: ");
			c=console.nextInt();

			if((a==b) && (b==c))
				{System.out.println("All of the numbers are same: #");
				}

			else if ( (a==b) || (b==c) || (a==c))
				{System.out.println("Only 2 of them are same: 2 ");
				}
			//else if ( (b==a) || (b==c) )
			// {System.out.println("Only 2 of them are same: 2");
			// 	}
			else 
				{System.out.println("None of them are same: )");
				}

			console.close();
		}
	}