public class Division {

    public static void main(String[] args) {
        // Example usage of the division method
        division(3, 5); // Should print "0.6"
        division(10, 2); // Should print "5.0"
    }

    public static void division(int numerator, int denominator) {
        // Cast the numerator to double to ensure floating-point division
        double result = (double) numerator / denominator;
        System.out.println(result);
    }
}
