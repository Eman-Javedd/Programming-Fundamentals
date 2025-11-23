public class LabTask4 {
    public static void main(String[] args) {

        int randomNum = (int)(Math.random() * 26);
        char randomLetter = (char)('A' + randomNum);

        System.out.println("The random uppercase letter is " + randomLetter);
    }
}
