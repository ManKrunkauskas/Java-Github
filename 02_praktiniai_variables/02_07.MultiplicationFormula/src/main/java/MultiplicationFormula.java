import java.util.Scanner;

public class MultiplicationFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt and read the first number
        System.out.println("Give the first number:");
        int firstNumber = Integer.valueOf(scanner.nextLine());

        // Prompt and read the second number
        System.out.println("Give the second number:");
        int secondNumber = Integer.valueOf(scanner.nextLine());

        // Calculate the product of the two numbers
        int product = firstNumber * secondNumber;

        // Print the multiplication formula and result
        System.out.println(firstNumber + " * " + secondNumber + " = " + product);
    }
}
