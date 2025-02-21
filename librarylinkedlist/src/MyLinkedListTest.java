
public class MyLinkedListTest {


    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.addFirst(3);
        list.addFirst(100);
        list.addFirst(6);
        list.addFirst(1);
        list.addFirst(7);
        list.display();
    }
}
