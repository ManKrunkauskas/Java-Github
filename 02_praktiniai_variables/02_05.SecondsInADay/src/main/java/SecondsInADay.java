import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user
        System.out.println("How many days would you like to convert to seconds?");

        // Read the number of days
        int days = Integer.valueOf(scanner.nextLine());

        // Calculate the number of seconds in the given days
        int seconds = days * 24 * 60 * 60;

        // Print the result
        System.out.println(seconds);
    }
}
