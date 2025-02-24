public class MyStack {
    int[] array;
    int size;
    int index;

    public MyStack(int size) {
        array = new int[size];
        this.size = size;
        index = 0;
    }

    public void push(int element) {
        if (isFull()) {
            throw new RuntimeException("Stack is full");
        }
        array[index] = element;
        index++;
    }
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return array[--index];
    }

    public boolean isEmpty() {
        return index == 0;
    }

    public boolean isFull() {
        return index == size;
    }

}
