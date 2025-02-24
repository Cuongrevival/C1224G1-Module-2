public class myQueue {
    int capacity;
    int[] queueArray;
    int head = 0;
    int tail = -1;
    int currentSize;

    public myQueue(int queueSize) {
        this.capacity = queueSize;
        queueArray = new int[capacity];
        this.currentSize = 0;
    }


    public boolean isQueueFull() {
        return (currentSize == capacity - 1);
    }

    public boolean isQueueEmpty() {
        return (currentSize == 0);
    }

    public void enqueue(int item) {
        if (isQueueFull()) {
            throw new IllegalStateException("Queue is full");
        }
        tail = (tail + 1) % capacity;
        queueArray[tail] = item;
        currentSize++;
    }

    public void dequeue() {
        if (isQueueEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        head = (head + 1) % capacity;
        currentSize--;
    }

}
