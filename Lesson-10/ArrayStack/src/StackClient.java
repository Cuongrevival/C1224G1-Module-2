
public class StackClient {
    public static void main(String[] args) {
        MyStack stack = new MyStack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println(stack.size());
        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        System.out.println(stack.size());
    }
}
