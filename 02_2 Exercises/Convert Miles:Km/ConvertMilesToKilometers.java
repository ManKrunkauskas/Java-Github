import java.util.Scanner;

public class ConvertMilesToKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the miles: ");
        double miles = Double.valueOf(scanner.nextLine());

        double kilometers = miles * 1.6;

        System.out.println("The miles is " + kilometers + " kilometers.");
    }
}