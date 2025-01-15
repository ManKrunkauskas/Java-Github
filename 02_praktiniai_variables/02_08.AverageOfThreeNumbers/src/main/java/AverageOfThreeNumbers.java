import java.util.Scanner;

public class AverageOfThreeNumbers {

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

        // Calculate the average
        double average = (firstNumber + secondNumber + thirdNumber) / 3.0;

        // Print the result
        System.out.println("The average is " + average);
    }
}
