import java.util.Scanner;

public class ColumnArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first size of the array: ");
        int n = sc.nextInt();
        System.out.println("Enter the second size of the array: ");
        int m = sc.nextInt();
        double[][] arr = new double[n][m];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextDouble();
            }
        }
        System.out.println("Enter the position of the column you want to sum: ");
        int col1 = sc.nextInt();
        int col = col1 - 1;
        double sum = 0.0d;
        for (int i = 0; i < arr[col].length; i++) {
            sum += arr[col][i];
        }
        System.out.println("The sum of the elements of the column number" + (col + 1) + " of the array is: " + sum);
    }
}
