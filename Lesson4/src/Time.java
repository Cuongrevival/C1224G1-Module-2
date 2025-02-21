import java.util.Random;

class StopWatch {
    private long startTime;
    private long stopTime;
    public StopWatch() {
        startTime = System.currentTimeMillis();
    }
    public void start() {
        startTime = System.currentTimeMillis();
    }
    public void stop() {
        stopTime = System.currentTimeMillis();
    }
    public long getElapsedTime() {
        return stopTime - startTime;
    }
}
public class Time {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        int [] arr = new int [100000];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100000);
        }
        stopWatch.start();
        SelectionSort(arr);
        stopWatch.stop();
        System.out.println("The time used for selection sort of 100000-first number: " + stopWatch.getElapsedTime());
    }
    public static void SelectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}