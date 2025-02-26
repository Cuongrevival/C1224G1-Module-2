package BinarySearch;

public class BinarySearch1 {
    public int binarySearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                left = mid + 1;
            } else if (arr[mid] > key) {
                right = mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {15, 18, 25, 34, 87, 154, 246};
        int key = 154;
        BinarySearch1 bs = new BinarySearch1();
        System.out.println(bs.binarySearch(arr, key));
    }
}
