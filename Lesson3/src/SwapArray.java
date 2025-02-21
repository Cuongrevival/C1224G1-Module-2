import java.util.Arrays;
import java.util.Scanner;

public class SwapArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int[] sizes;
        do {
            System.out.println("Enter the size of the array: ");
            n = sc.nextInt();
            if (n > 20) {
                System.out.println("The array is too large.");
            }
        } while (n > 20);
        sizes = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element: " + i + " : ");
            sizes[i] = sc.nextInt();
        }
        System.out.println("The array: " + Arrays.toString(sizes));

        for (int j = sizes.length - 1; j >= (sizes.length - 1) / 2; j--) {
            int temp = sizes[j];
            sizes[j] = sizes[sizes.length - j - 1];
            sizes[sizes.length - j - 1] = temp;
        }
        System.out.println("The array: " + Arrays.toString(sizes));
    }
}