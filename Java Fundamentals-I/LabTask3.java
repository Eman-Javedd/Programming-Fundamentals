import java.util.Scanner;
	public class LabTask3{
		public static void main(String[] args ){
		Scanner console=new Scanner(System.in);
		int SECRET;	
		SECRET=1;

		double RATE;
		RATE=12.50;

		int num1;
		int num2;
		int newNum;
		double hoursWorked;
		double wages;
	
		System.out.println("enter number");
		num1=console.nextInt();
		System.out.println("enter number");
		num2=console.nextInt();

		System.out.println("The value of num1 = "+num1);
		System.out.println("The value of num2 = "+num2);

		newNum=(2*num1)+num2;
		System.out.println("The value of newNum = "+newNum);

		newNum=newNum+SECRET;
		System.out.println("The value of updated newNum = "+newNum);

		String Name;
		System.out.println("enter last name ");
		Name=console.next();

		System.out.println("Enter a decimal number between 0 and 70 ");
		hoursWorked = console.nextDouble();

		wages = hoursWorked*RATE;
		System.out.println("Name: "+Name);
		System.out.println("Pay rate: "+RATE+"$");
		System.out.println("hoursWorked: "+hoursWorked);
		System.out.println("Salary: "+wages);
		}
	}
		