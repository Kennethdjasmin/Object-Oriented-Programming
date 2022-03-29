import java.util.Scanner;
import java.util.Arrays;

public class PrintArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of items: ");
        int NUM_ITEMS = sc.nextInt();

        if (NUM_ITEMS == 0) {
            System.out.println("The array should at least have '1' as length");
            System.exit(0);
        }

        if (NUM_ITEMS < 0) {
            System.out.println("The array cannot be negative");
            System.exit(0);
        }

        int[] arr1 = new int[NUM_ITEMS];

        System.out.print("Enter the value of all items (separated by space): ");
        for (int i = 0; i < NUM_ITEMS; i++)
            arr1[i] = sc.nextInt();

        System.out.println("The values are: " + Arrays.toString(arr1));
    }
}

