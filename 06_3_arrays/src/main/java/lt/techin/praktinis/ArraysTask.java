package lt.techin.praktinis;

import java.util.Arrays;
import java.util.Random;

public class ArraysTask {

    public static void main(String[] args) {
        try {
            // Generuojamas atsitiktinis masyvas
            int[] randomArray = generateRandomArray(5, 1, 10);
            System.out.println("Generated random array: " + Arrays.toString(randomArray));

            // Testinis masyvas
            int[] arr = {3, 2, 1, 4, 6, 5};

            // Elemento pašalinimas
            int[] arrWithRemovedElement = removeElementAndReturnNewArray(arr, 2);
            System.out.println("Array after removing element: " + Arrays.toString(arrWithRemovedElement));

            // Elemento įterpimas
            int[] arrWithInsertedElement = insertElementAndReturnNewArray(arr, 2, 99);
            System.out.println("Array after inserting element: " + Arrays.toString(arrWithInsertedElement));

            // Masyvo apvertimas
            int[] reverseArray = reverseArray(arr);
            System.out.println("Reversed array: " + Arrays.toString(reverseArray));

            // Masyvo apvertimas vietoje
            reverseInPlace(arr);
            System.out.println("Array reversed in place: " + Arrays.toString(arr));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Generuoja atsitiktinį masyvą
    public static int[] generateRandomArray(int size, int min, int max) {
        if (size <= 0 || min > max) {
            throw new IllegalArgumentException("Invalid size or range: size must be > 0 and min <= max.");
        }
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
        return array;
    }


    // Pašalina elementą iš masyvo pagal indeksą
    public static int[] removeElementAndReturnNewArray(int[] arr, int k) {
        if (arr == null) {
            throw new IllegalArgumentException("Array cannot be null.");
        }
        if (k < 0 || k >= arr.length) {
            throw new IllegalArgumentException("Index out of bounds: " + k);
        }
        int[] newArray = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != k) {
                newArray[j++] = arr[i];
            }
        }
        return newArray;
    }

    // Įterpia elementą į masyvą pagal indeksą
    public static int[] insertElementAndReturnNewArray(int[] arr, int k, int x) {
        if (arr == null) {
            throw new IllegalArgumentException("Array cannot be null.");
        }
        if (k < 0 || k > arr.length) {
            throw new IllegalArgumentException("Index out of bounds: " + k);
        }
        int[] newArray = new int[arr.length + 1];
        for (int i = 0, j = 0; i < newArray.length; i++) {
            if (i == k) {
                newArray[i] = x;
            } else {
                newArray[i] = arr[j++];
            }
        }
        return newArray;
    }

    // Apverčia masyvą ir grąžina naują masyvą
    public static int[] reverseArray(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Array is null");
        }
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    // Apverčia masyvą vietoje
    public static void reverseInPlace(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Array is null");
        }
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
}
