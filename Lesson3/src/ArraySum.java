import java.util.Scanner;
public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int m;
        do {
            System.out.println("Enter first array size: ");
             n = sc.nextInt();
            System.out.println("Enter second array size: ");
             m = sc.nextInt();
             if (n != m) {
                 System.out.println("Invalid input");
             }
        } while (n != m);
        int[][] a = new int[n][m];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int sum = a[0][0];
        int sum2 = a[0][n-1];
        for (int i = 1; i < n; i++) {
            sum += a[i][i];
        }
        for (int i = 1; i < n; i++) {
            sum2 += a[i][n-1-i];
        }
        System.out.println("The sum is: " + sum);
        System.out.println("The sum is: " + sum2);
    }
}
