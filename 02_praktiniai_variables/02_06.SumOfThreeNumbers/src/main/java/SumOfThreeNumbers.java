import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt and read the first number
        System.out.println("Give the first number:");
        int firstNumber = Integer.valueOf(scanner.nextLine());

        // Prompt and read the second number
        System.out.println("Give the second number:");
        int secondNumber = Integer.valueOf(scanner.nextLine());

        // Prompt and read the third number
        System.out.println("Give the third number:");
        int thirdNumber = Integer.valueOf(scanner.nextLine());

        // Calculate the sum of the three numbers
        int sum = firstNumber + secondNumber + thirdNumber;

        // Print the result
        System.out.println("The sum of the numbers is " + sum);
    }
}
