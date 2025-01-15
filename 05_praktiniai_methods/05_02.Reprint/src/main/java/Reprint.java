import java.util.Scanner;

public class Reprint {

    public static void main(String[] args) {
        // Create a Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of times to print the text
        System.out.println("How many times?");
        int times = Integer.valueOf(scanner.nextLine());

        // Use a while loop to call the printText-method the specified number of times
        int count = 0;
        while (count < times) {
            printText();
            count++;
        }
    }

    // This method prints the required text
    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
    }
}
