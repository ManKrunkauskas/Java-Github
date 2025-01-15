import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Prompt the user to give a number
        System.out.println("Give a number:");
        int number = Integer.valueOf(scan.nextLine());

        // Check if the number is even or odd
        if (number % 2 == 0) {
            System.out.println("Number " + number + " is even.");
        } else {
            System.out.println("Number " + number + " is odd.");
        }
    }
}
