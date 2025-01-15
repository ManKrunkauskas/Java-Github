import java.util.Scanner;

public class Positivity {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Prompt the user to give a number
        System.out.println("Give a number:");
        int number = Integer.valueOf(scan.nextLine());

        // Check if the number is positive
        if (number > 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is not positive.");
        }
    }
}
