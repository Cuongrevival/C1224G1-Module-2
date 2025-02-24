import java.util.Stack;
import java.util.Scanner;

public class StringSwapUsingStack {
    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        swapStack(s);

    }

    private static void swapStack(String str) {
        Stack<String> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            stack.push(String.valueOf(ch));
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}

