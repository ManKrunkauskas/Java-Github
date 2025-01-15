import java.util.Scanner;

public class DistanceBetweenPoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the coordinates
        System.out.println("Enter x1:");
        double x1 = Double.valueOf(scanner.nextLine());

        System.out.println("Enter y1:");
        double y1 = Double.valueOf(scanner.nextLine());

        System.out.println("Enter x2:");
        double x2 = Double.valueOf(scanner.nextLine());

        System.out.println("Enter y2:");
        double y2 = Double.valueOf(scanner.nextLine());

        // Calculate the distance
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        // Display the result
        System.out.println("The distance between the two points is " + distance);
    }
}
