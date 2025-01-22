import java.util.Scanner;

public class AgeOfTheOldest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldestAge = 0; // Laikome vyriausio asmens amžių

        while (true) {
            // Skaitome eilutę iš vartotojo
            String input = scanner.nextLine();

            // Jei įvestis tuščia, baigiame programą
            if (input.isEmpty()) {
                break;
            }

            // Patikriname, ar įvestyje yra kablelis
            if (!input.contains(",")) {
                System.out.println("Invalid input format. Skipping: " + input);
                continue;
            }

            // Skirstome įvestį pagal kablelį
            String[] parts = input.split(",");

            // Užtikriname, kad masyve yra bent du elementai
            if (parts.length != 2) {
                System.out.println("Invalid input format. Skipping: " + input);
                continue;
            }

            // Gauname vardą ir amžių
            String name = parts[0].trim();
            int age;
            try {
                age = Integer.parseInt(parts[1].trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid age format. Skipping: " + input);
                continue;
            }

            // Tikriname, ar šis amžius yra didesnis už dabartinį vyriausią
            if (age > oldestAge) {
                oldestAge = age;
            }
        }

        // Spausdiname rezultatą
        System.out.println("Age of the oldest: " + oldestAge);

        scanner.close();
    }
}
