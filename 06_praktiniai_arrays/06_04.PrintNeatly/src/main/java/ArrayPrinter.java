public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array); // Expected output: 5, 1, 3, 4, 2
    }

    public static void printNeatly(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                // Last element, no comma
                System.out.print(array[i]);
            } else {
                // Add a comma and a space
                System.out.print(array[i] + ", ");
            }
        }
    }
}
