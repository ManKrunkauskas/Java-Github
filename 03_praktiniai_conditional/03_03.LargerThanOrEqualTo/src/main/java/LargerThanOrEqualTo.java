import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.println("Give the first number:");
        int firstNumber = Integer.valueOf(scan.nextLine());

        // Prompt the user to enter the second number
        System.out.println("Give the second number:");
        int secondNumber = Integer.valueOf(scan.nextLine());

        // Compare the two numbers and print the result
        if (firstNumber > secondNumber) {
            System.out.println("Greater number is: " + firstNumber);
        } else if (secondNumber > firstNumber) {
            System.out.println("Greater number is: " + secondNumber);
        } else {
            System.out.println("The numbers are equal!");
        }
    }
}
