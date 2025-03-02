import java.util.*;
import java.util.Arrays;
import java.util.Random;

public class ArrayIndex {
    public static int[] createRandomArray(int n) {
        Random rand = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(n);
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = createRandomArray(100);
        System.out.println(Arrays.toString(a));
        System.out.println("Nhập vào đây chỉ số của mảng");
        int x = sc.nextInt();
        try {
            System.out.println("Tìm thấy " + a[x] + " tại " + x);
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("Chỉ số vượt quá giới hạn");
        }
    }
}
