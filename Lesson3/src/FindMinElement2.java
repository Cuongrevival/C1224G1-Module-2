import java.util.Scanner;

public class FindMinElement2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many elements would you like to find?");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + (n + 1) + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum element is " + min);
    }
}
