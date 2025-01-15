import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Prompt the user to enter the first string
        System.out.println("Enter the first string:");
        String firstString = scan.nextLine();

        // Prompt the user to enter the second string
        System.out.println("Enter the second string:");
        String secondString = scan.nextLine();

        // Compare the strings and print the result
        if (firstString.equals(secondString)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }
}
