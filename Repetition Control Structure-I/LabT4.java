import java.util.Scanner;
	public class LabT4{
		public static void main(String [] args ){
		Scanner input = new Scanner(System.in);
		int count = 0;
		int num;

		System.out.println("Enter non-negative integers (end with 0):");
		
		while (true){
		num = input.nextInt();
		if (num == 0){
		break;
		}
		count++;
		}

		System.out.println("Length of the sequence =" + count);
		}
	}