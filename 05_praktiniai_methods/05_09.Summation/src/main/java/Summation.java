public class Summation {

    public static int sum(int num1, int num2, int num3, int num4) {
        // Calculate and return the sum of the four numbers
        return num1 + num2 + num3 + num4;
    }

    public static void main(String[] args) {
        int result = sum(4, 3, 6, 1); // Calls the sum method with specified numbers
        System.out.println("Sum: " + result); // Outputs the result
    }
}
