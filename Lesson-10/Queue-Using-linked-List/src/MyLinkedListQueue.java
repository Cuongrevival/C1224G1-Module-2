public class MyLinkedListQueue {
    private Node head;
    private Node tail;

    public MyLinkedListQueue() {
        head = null;
        tail = null;
    }
    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public Node dequeue() {
        if (head == null) {
            return null;
        }
        Node temp = head;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return temp;
    }
}
