import java.util.Scanner;

public class FindNumberOfYears {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter minutes
        System.out.println("Enter the number of minutes:");
        long minutes = Long.valueOf(scanner.nextLine());

        // Calculate years and days
        long minutesInYear = 365 * 24 * 60;
        long years = minutes / minutesInYear;
        long remainingMinutes = minutes % minutesInYear;
        long days = remainingMinutes / (24 * 60);

        // Display the result
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");
    }
}
