import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt and read the first number
        System.out.println("Give the first number:");
        int firstNumber = Integer.valueOf(scanner.nextLine());

        // Prompt and read the second number
        System.out.println("Give the second number:");
        int secondNumber = Integer.valueOf(scanner.nextLine());

        // Perform calculations
        int sum = firstNumber + secondNumber;
        int difference = firstNumber - secondNumber;
        int product = firstNumber * secondNumber;
        double quotient = (double) firstNumber / secondNumber;

        // Print the results
        System.out.println(firstNumber + " + " + secondNumber + " = " + sum);
        System.out.println(firstNumber + " - " + secondNumber + " = " + difference);
        System.out.println(firstNumber + " * " + secondNumber + " = " + product);
        System.out.println(firstNumber + " / " + secondNumber + " = " + quotient);
    }
}
