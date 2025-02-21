import java.util.Arrays;
import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers do you want to add?");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("The array at first: " + Arrays.toString(arr));
        int[] newArr = new int[n + 1];
        System.out.println("Enter the element you want to add");
        int x = sc.nextInt();
        System.out.println("Enter the position you want to add");
        int y = sc.nextInt();
        if (y < 0 || y > n) {
            System.out.println("Invalid position");
        } else {
            for (int i = 0; i < y; i++) {
                newArr[i] = arr[i];
            }
            newArr[y] = newArr[y - 1];
            newArr[y - 1] = x;
            for (int index = y; index < n; index++) {
                newArr[index + 1] = arr[index];
            }
            System.out.println("The new array is: " + Arrays.toString(newArr));

        }
    }
}

