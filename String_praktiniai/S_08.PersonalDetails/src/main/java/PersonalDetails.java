import java.util.Scanner;

public class PersonalDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String longestName = "";
        int totalYears = 0;
        int count = 0;

        while (true) {
            // Skaitome eilutę iš vartotojo
            String input = scanner.nextLine();

            // Jei įvestis tuščia, baigiame programą
            if (input.isEmpty()) {
                break;
            }

            // Skirstome įvestį pagal kablelį
            String[] parts = input.split(",");

            // Užtikriname, kad masyve yra bent du elementai
            if (parts.length != 2) {
                System.out.println("Invalid input format. Skipping: " + input);
                continue;
            }

            // Gauname vardą ir gimimo metus
            String name = parts[0].trim();
            int birthYear;
            try {
                birthYear = Integer.parseInt(parts[1].trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid year format. Skipping: " + input);
                continue;
            }

            // Tikriname, ar šis vardas yra ilgiausias
            if (name.length() > longestName.length()) {
                longestName = name;
            }

            // Kaupiame gimimo metus ir didiname skaičių
            totalYears += birthYear;
            count++;
        }

        // Apskaičiuojame gimimo metų vidurkį
        double averageYear = count > 0 ? (double) totalYears / count : 0;

        // Spausdiname rezultatus
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + averageYear);

        scanner.close();
    }
}
