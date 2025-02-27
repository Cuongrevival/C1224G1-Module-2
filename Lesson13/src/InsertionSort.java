import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {55, 100, 41, 12, 450, 114};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && temp < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }
}
