import java.util.Stack;
import java.util.Scanner;

public class DecimalToHexa {
    public static void main(String[] args) {
        Stack<Character> stack = DecimalToHexaChange();
        StringBuilder hex = new StringBuilder();
        while (!stack.isEmpty()) {
            hex.append(stack.pop());
        }
        System.out.println(hex);
    }

    private static Stack<Character> DecimalToHexaChange() {
        Stack<Character> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal number: ");
        int decimal = sc.nextInt();
        sc.close();
        char[] hexChars = "0123456789ABCDEF".toCharArray();
        while (decimal > 0) {
            stack.push(hexChars[decimal % 16]);
            decimal = decimal / 16;
        }
        return stack;
    }
}
