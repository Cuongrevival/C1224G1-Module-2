import java.util.Stack;
import java.util.Scanner;

public class DecimalToHexa {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal number: ");
        char[] hexChars = "0123456789ABCDEF".toCharArray();
        int decimal = sc.nextInt();
        while (decimal > 0) {
            stack.push(decimal % 16);
            decimal = decimal / 16;
        }
        System.out.println(stack);

        StringBuilder hex = new StringBuilder();
        while (!stack.isEmpty()) {
            hex.append(hexChars[stack.pop()]);
        }
        System.out.println(hex.toString());
    }
}
