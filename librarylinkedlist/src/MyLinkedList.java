//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class MyLinkedList<E> {
    private Node head;
    private int numNodes = 0;
    private Node tail;

    public MyLinkedList() {
    }

    public void addFirst(E e) {
        Node newNode = new Node(e);
        if (this.head != null) {
            newNode.next = this.head;
        }

        this.head = newNode;
        ++this.numNodes;
    }

    public void addLast(E e) {
        Node newNode = new Node(e);
        if (this.tail != null) {
            this.tail.next = newNode;
        }

        this.tail = newNode;
        ++this.numNodes;
    }

    public void add(int index, E e) {
        if (index >= 0 && index <= this.numNodes) {
            if (index == 0) {
                this.addFirst(e);
            }

            if (index == this.numNodes - 1) {
                this.addLast(e);
            } else {
                Node newNode = new Node(e);

                Node current;
                for(current = this.head; current.next != null; current = current.next) {
                }

                current.next = newNode;
                ++this.numNodes;
            }

        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public E removeFirst() {
        if (this.head == null) {
            return null;
        } else {
            Node current = this.head;
            this.head = this.head.next;
            --this.numNodes;
            return (E)current.data;
        }
    }

    public E remove(int index) {
        if (index >= 0 && index <= this.numNodes) {
            if (index == 0) {
                this.head = this.head.next;
            }

            if (index == this.numNodes - 1) {
                this.tail = this.tail.next;
            }

            Node current = this.head;

            while(current.next != null) {
                if (current.next == this.head) {
                    current.next = current.next.next;
                    --this.numNodes;
                }
            }

            return (E)current.data;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public int size() {
        return this.numNodes;
    }

    public boolean contains(E e) {
        for(Node current = this.head; current != null; current = current.next) {
            if (current.data == e) {
                return true;
            }
        }

        return false;
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity > this.numNodes) {
            this.numNodes = minCapacity * 2;
        }

    }

    public E getFirst() {
        return (E)(this.head == null ? null : this.head.data);
    }

    public E getLast() {
        return (E)(this.tail == null ? null : this.tail.data);
    }

    public E get(int index) {
        if (index >= 0 && index <= this.numNodes) {
            Node current = this.head;

            for(int i = 0; i < index; ++i) {
                current = current.next;
            }

            return (E)current.data;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public MyLinkedList<E> clone() {
        MyLinkedList<E> list = new MyLinkedList<E>();

        for(Node current = this.head; current != null; current = current.next) {
            list.addFirst((E) current.data);
        }

        return list;
    }

    public int IndexOf(E e) {
        Node current = this.head;

        for(int i = 0; i < this.numNodes; ++i) {
            if (current.data == e) {
                return i;
            }

            current = current.next;
        }

        return -1;
    }

    public void clear() {
        this.head = null;
        this.numNodes = 0;
    }

    public void display() {
        for(Node current = this.head; current != null; current = current.next) {
            System.out.print(current.data + " ");
        }

        System.out.println();
    }
}
