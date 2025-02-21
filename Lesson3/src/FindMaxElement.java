import java.util.Scanner;

public class FindMaxElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Enter number of elements in the array: ");
            n = sc.nextInt();
            if (n > 20) {
                System.out.println("The amount of elements in the array is greater than 20");
            }
        } while (n > 20);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter elements " + i + " : ");
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum element is " + max);
    }
}
