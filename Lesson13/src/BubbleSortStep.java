import java.util.Arrays;

public class BubbleSortStep {
    public static void main(String[] args) {
        int[] arr = {65, 54, 30, 82, 14};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = false;
            System.out.println("Lần lặp thứ " + (i + 1));
            for (int j = 0; j < arr.length - i - 1; j++) {
                System.out.println(arr[j] + " tại vị trí " + (j + 1));
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                    System.out.println("Đã thay đổi " + arr[j + 1] + " " + arr[j] + " tại " + (j + 1) + " " + (j + 2));
                }
            }
            if (!flag) {
                break;
            }
        }
        System.out.println("Mảng đã được sắp xếp: " + Arrays.toString(arr));
    }
}
