import java.util.Scanner;

public class DoubleInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Print the first prompt
        System.out.println("Give a number:");

        // Read a floating-point number
        double number = Double.parseDouble(scanner.nextLine());

        // Print the result
        System.out.println("You gave the number " + number);
    }
}
