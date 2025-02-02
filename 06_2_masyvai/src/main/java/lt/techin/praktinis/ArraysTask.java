package lt.techin.praktinis;

public class ArraysTask {

    public static void main(String[] args) {
        // Įgyvendikite visus metodus (turi pažaliuoti unit testai)
        // Pateiktas masyvas ir pavyzdys programos patikrinimui. Masyvo elementų reikšmes galite keisti.

        int[] arr = {3, 2, 1, 4, 6, 5};

        int minMark = getMin(arr);
        System.out.printf("Min mark: %d\n", minMark);
    }

    // Metodas turi grąžinti pirmą masyvo elementą
    public static int getFirstElement(int[] arr) {
        return arr[0];
    }

    // Metodas turi grąžinti paskutinį masyvo elementą
    public static int getLastElement(int[] arr) {
        return arr[arr.length - 1];
    }

    // Raskite mažiausią masyvo elementą
    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // Raskite didžiausią masyvo elementą
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Suskaičiuokite masyvo elementų sumą
    public static int getSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    // Raskite masyvo elementų vidurkį
    public static double getAverage(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        double sum = getSum(arr);
        return sum / arr.length;
    }


    // Suskaičiuokite kiek masyve yra skaičių, didesnių nei duotas skaičius n
    public static int countElements(int[] arr, int n) {
        int count = 0;
        for (int num : arr) {
            if (num > n) {
                count++;
            }
        }
        return count;
    }

    // Metodas turi grąžinti true, jei masyve yra elementas kurio reikšmė lygi n
    public static boolean contains(int[] arr, int n) {
        for (int num : arr) {
            if (num == n) {
                return true;
            }
        }
        return false;
    }

    // Raskite elemento kurio reikšmė lygi n paskutinį indeksą
    public static int lastIndexOf(int[] arr, int n) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == n) {
                return i;
            }
        }
        return -1; // jei elemento nėra
    }
}
