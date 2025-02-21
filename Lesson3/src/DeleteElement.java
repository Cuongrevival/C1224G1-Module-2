
import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be deleted: ");
        int ele = sc.nextInt();
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ele) {
                System.out.println("The element to be deleted: " + ele + " was found at position " + (i + 1));
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Element not found");
        } else {
            for (int j = index; j < arr.length - 1; j++) {
            arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = 0;
        }

        System.out.println("The array after deletion: " + Arrays.toString(arr));
    }
}


