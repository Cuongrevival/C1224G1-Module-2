import java.util.Arrays;

public class ThuatToanSapXep {
    public void NoiBot(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public void Chon(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (temp > arr[j]) {
                    temp = arr[j];
                    minIndex = j;
                }
            }
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    public void Chen(int[] arr) {
        for (int index = 1; index < arr.length; index++) {
            int temp = arr[index];
            int minIndex = index - 1;
            while (minIndex >= 0 && temp < arr[minIndex]) {
                arr[minIndex + 1] = arr[minIndex];
                minIndex--;
            }
            arr[minIndex + 1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] orders = {45, 20, 47, 55, 32, 88, 74, 92, 145, 22};
        ThuatToanSapXep sapXep = new ThuatToanSapXep();
        sapXep.NoiBot(orders);
        sapXep.Chon(orders);
        sapXep.Chen(orders);
    }
}