import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Prompt and read a string
        System.out.println("Give a string:");
        String str = scan.nextLine();

        // Prompt and read an integer
        System.out.println("Give an integer:");
        int integer = Integer.parseInt(scan.nextLine());

        // Prompt and read a double
        System.out.println("Give a double:");
        double dbl = Double.parseDouble(scan.nextLine());

        // Prompt and read a boolean
        System.out.println("Give a boolean:");
        boolean bool = Boolean.valueOf(scan.nextLine());

        // Print the results
        System.out.println("You gave the string " + str);
        System.out.println("You gave the integer " + integer);
        System.out.println("You gave the double " + dbl);
        System.out.println("You gave the boolean " + bool);
    }
}
