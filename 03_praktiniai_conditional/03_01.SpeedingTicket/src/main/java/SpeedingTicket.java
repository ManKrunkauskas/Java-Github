import java.util.Scanner;

public class SpeedingTicket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the speed
        System.out.println("Give speed:");
        int speed = Integer.valueOf(scanner.nextLine());

        // Check if the speed exceeds the limit and print the appropriate message
        if (speed > 120) {
            System.out.println("Speeding ticket!");
        }
    }
}
