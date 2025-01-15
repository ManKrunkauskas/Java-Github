import java.util.Scanner;

public class IntegerInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pirmiausia išvedame klausimą
        System.out.println("Give a number:");

        // Tada nuskaitome įvestą skaičių
        int number = Integer.parseInt(scanner.nextLine());

        // Galiausiai išvedame rezultatą
        System.out.println("You gave the number " + number);
    }
}
