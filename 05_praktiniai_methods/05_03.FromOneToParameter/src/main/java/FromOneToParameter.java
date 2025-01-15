public class FromOneToParameter {

    public static void main(String[] args) {
        // Example calls to the method
        printUntilNumber(5);
        printUntilNumber(2);
    }

    public static void printUntilNumber(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.println(i);
        }
    }
}
