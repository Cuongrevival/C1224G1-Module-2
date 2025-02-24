import java.util.EmptyStackException;

public class Solution {
    Queue queue = new Queue();
    public void enQueue(int data) {
        Node node = new Node(data);
        if (queue.front == null) {
            queue.front = queue.rear = node;
        }

    }
}
