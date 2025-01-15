import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 3;
        array[2] = 5;
        array[3] = 7;
        array[4] = 9;

        // Print the initial array
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
        System.out.println("");

        // Ask the user for two indices to swap
        System.out.print("Give two indices to swap: ");
        int index1 = scanner.nextInt();
        int index2 = scanner.nextInt();

        // Swap the values at the two indices
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;

        System.out.println("");

        // Print the modified array
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}
