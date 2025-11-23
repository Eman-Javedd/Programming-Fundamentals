import java.util.Scanner;
	public class LabTask8 {
    		public static void main(String[] args) {
       		Scanner input = new Scanner(System.in);
	        System.out.println("Input:");
	        String sentence = input.nextLine();

	        int firstIndex = sentence.indexOf('h');
	        int lastIndex = sentence.lastIndexOf('h');

	        String part1 = sentence.substring(0, firstIndex);
	        String part2 = sentence.substring(lastIndex + 1);
	        String result = part1 + part2;

	        System.out.println("Correct Answer: " + result);
	    }
	}
