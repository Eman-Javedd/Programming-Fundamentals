import java.util.Scanner;
	public class LabTask2{
		public static void main(String[] args){
			Scanner console=new Scanner(System.in);
			
			int length;
			System.out.print("Enter the length: ");
			length=console.nextInt();
			System.out.println();

			int width;
			System.out.print("Enter the width: ");
			width=console.nextInt();
			System.out.println();
			
			int area;
			area=length*width;
			System.out.println("Area= " +area);

			int perimeter;
			perimeter=2*(length+width);
			System.out.println("perimeter= "+perimeter);
		}
	}