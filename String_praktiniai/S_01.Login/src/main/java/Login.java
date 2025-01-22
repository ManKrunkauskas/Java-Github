import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        // Sukuriame vartotojų ir slaptažodžių duomenų bazę
        String[][] users = {
                {"alex", "sunshine"},
                {"emma", "haskell"}
        };

        Scanner scanner = new Scanner(System.in);

        // Vartotojo įvestis
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        // Tikriname, ar vartotojas egzistuoja ir slaptažodis teisingas
        boolean isLoggedIn = false;

        for (String[] user : users) {
            if (user[0].equals(username) && user[1].equals(password)) {
                isLoggedIn = true;
                break;
            }
        }

        // Rezultato išvedimas
        if (isLoggedIn) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }

        scanner.close();
    }
}
