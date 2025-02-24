
public class GenericStackClient {
    public static void main(String[] args) {
        System.out.println("1. Stack of String");
        stackOfString();
        System.out.println("\n2. Stack of Integer");
        stackOfInteger();
    }

    private static void stackOfInteger() {
        MyGenericStack<Integer> stack = new MyGenericStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("1.1: Size of stack after pushing: " + stack.size());
        System.out.printf("1.2: Pops element from stack: ");
        while (!stack.isEmpty()) {
            System.out.printf("%d ", stack.pop());
        }
        System.out.println("\n2.1: Size of stack after popping: " + stack.size());
    }

    private static void stackOfString() {
        MyGenericStack<String> stack = new MyGenericStack();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println("1.1: Size of stack after pushing: " + stack.size());
        System.out.printf("1.2: Pops element from stack: ");
        while (!stack.isEmpty()) {
            System.out.printf("%s ", stack.pop());
        }
        System.out.println("\n2.1: Size of stack after popping: " + stack.size());
    }
}
