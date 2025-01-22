
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                break;
            }
            String[] words = input.trim().split("\\s+");

            if (words.length > 0) {
                System.out.println(words[words.length - 1]);
            }
        }
        scanner.close();
    }
}
