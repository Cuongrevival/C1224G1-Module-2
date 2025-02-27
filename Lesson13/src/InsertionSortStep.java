import java.util.Arrays;
import java.util.Scanner;

public class InsertionSortStep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int k = 1; k < size; k++) {
            int temp = arr[k];
            int j = k - 1;
            System.out.println("Element at index " + k + " is " + temp);
            while (j >= 0 && arr[j] > temp) {
                System.out.println("Element at index " + j + " is " + arr[j]);
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;
            System.out.println("Placed " + temp + " at index " + (j + 1));
            System.out.println("Current array state: " + Arrays.toString(arr));
        }
        System.out.print("Sorted array: " + Arrays.toString(arr));
    }
}
