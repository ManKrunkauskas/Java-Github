
import java.util.Scanner;

public class NameOfTheOldest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldestAge = 0;
        String oldestName = "";

        while (true) {
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                break;
            }

            if (!input.contains(",")) {
                System.out.println("Invalid input format. Skipping: " + input);
                continue;
            }

            String[] parts = input.split(",");

            if (parts.length != 2) {
                System.out.println("Invalid input format. Skipping: " + input);
                continue;
            }

            String name = parts[0].trim();
            int age;
            try {
                age = Integer.parseInt(parts[1].trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input format. Skipping: " + input);
                continue;
            }

            if (age > oldestAge) {
                oldestAge = age;
                oldestName = name;
            }
        }

        System.out.println("Name of the oldets: " + oldestName);

        scanner.close();
    }
}
