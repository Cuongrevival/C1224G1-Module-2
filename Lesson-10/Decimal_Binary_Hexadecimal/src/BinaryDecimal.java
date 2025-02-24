import java.util.Scanner;
import java.util.Stack;

public class BinaryDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Binary Number");
        String binary = sc.nextLine();
        int decimal = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < binary.length(); i++) {
            char ch = binary.charAt(i);
            if (ch == '1' || ch == '0') {
                stack.push(ch);

            } else {
                throw new RuntimeException();
            }
        }
        System.out.println(stack);
        while (!stack.isEmpty()) {
            int num = Integer.parseInt(stack.pop().toString());
            decimal += num * (int) Math.pow(2, stack.size() - 1);
        }
        System.out.println(decimal);
    }
}
