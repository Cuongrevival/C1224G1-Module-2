import java.util.Arrays;

public class QueueClient {
    public static void main(String[] args) {
        myQueue queue = new myQueue(8);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println(Arrays.toString(queue.queueArray));
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
        queue.dequeue();
        System.out.println(Arrays.toString(queue.queueArray));

    }
}
