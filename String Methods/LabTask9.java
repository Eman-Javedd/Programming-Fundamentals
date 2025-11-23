import java.util.Scanner;
	public class LabTask9{
    	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input:");
        String sentence = input.nextLine();

        int firstIndex = sentence.indexOf('h');
        int lastIndex = sentence.lastIndexOf('h');

        String result = "";

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            // Replace 'h' with 'H' except for first and last occurrences
            if (ch == 'h' && i != firstIndex && i != lastIndex) {
                result = result + 'H';
            } else {
                result = result + ch;
            }
        }

        System.out.println("Correct Answer: " + result);
    }
}
