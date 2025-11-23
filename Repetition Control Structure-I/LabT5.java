import java.util.Scanner;
	public class LabT5{
		public static void main(String [] args){
		Scanner input = new Scanner (System.in);
		int num;
		int max = Integer.MIN_VALUE;
		
		System.out.println("Enter numbers (end with 0):");
		
		while(true){
		num = input.nextInt();
		if (num==0){
		break;
		}

		if(num>max){	
		max = num;
			}
		}

		if(max==Integer.MIN_VALUE){
			System.out.println("No numbers were entered.");
		} else {
			System.out.println("Largest number in the sequence = " + max);
			}
		}
	}