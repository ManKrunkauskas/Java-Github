public class AdvancedAstrology {

    public static void printStars(int number) {
        // Part 1: Printing stars in a single line
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println(); // Move to the next line
    }

    public static void printSpaces(int number) {
        // Part 1: Printing spaces
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // Part 2: Printing a right-leaning triangle
        for (int i = 1; i <= size; i++) {
            printSpaces(size - i); // Print spaces first
            printStars(i);         // Then print stars
        }
    }

    public static void christmasTree(int height) {
        // Part 3: Printing a Christmas tree
        for (int i = 1; i <= height; i++) {
            printSpaces(height - i); // Print spaces
            printStars(2 * i - 1);   // Print stars (odd number in each row)
        }

        // Printing the base of the tree (2 rows of 3 stars each)
        for (int i = 0; i < 2; i++) {
            printSpaces(height - 2); // Align base to the middle of the tree
            printStars(3);           // Base is always 3 stars wide
        }
    }

    public static void main(String[] args) {
        // Testing the methods
        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
