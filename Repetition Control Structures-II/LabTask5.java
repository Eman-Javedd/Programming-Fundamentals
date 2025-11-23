import java.util.Scanner;
   public class LabTask5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter year:");
        int year = sc.nextInt();
	System.out.println("Enter first day of the year (0=Sun, 1=Mon, ..., 6=Sat):");
        int startDay = sc.nextInt();
	 String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };

        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            daysInMonth[1] = 29; // February has 29 days
        }
	for (int month = 0; month < 12; month++) {
            System.out.println("\n  " + months[month] + " " + year);
            System.out.println("Sun Mon Tue Wed Thu Fri Sat");

            int dayOfWeek = startDay;

            for (int i = 0; i < dayOfWeek; i++) {
                System.out.print("    ");
            }

            for (int day = 1; day <= daysInMonth[month]; day++) {
                System.out.printf("%3d ", day);

                dayOfWeek++;
                if (dayOfWeek > 6) { // move to next week
                    System.out.println();
                    dayOfWeek = 0;
                }
            }
            System.out.println();

            startDay = dayOfWeek; // first day of next month
        }

        sc.close();
    }
}