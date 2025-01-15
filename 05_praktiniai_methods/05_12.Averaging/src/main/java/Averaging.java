public class Averaging {

    // Implement the sum method again
    public static int sum(int number1, int number2, int number3, int number4) {
        // Calculate and return the sum of the numbers
        return number1 + number2 + number3 + number4;
    }

    public static double average(int number1, int number2, int number3, int number4) {
        // Calculate the average using the sum method
        int totalSum = sum(number1, number2, number3, number4);
        return totalSum / 4.0; // Divide by 4.0 to get a double result
    }

    public static void main(String[] args) {
        double result = average(4, 3, 6, 1);
        System.out.println("Average: " + result);
    }
}
