
import java.util.Stack;
import java.util.Scanner;

public class DecimalBinary {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Decimal Number: ");
        int decimal = sc.nextInt();
        sc.close();
        int num = decimal;
        while (num != 0) {
            stack.push(num % 2);
            num /= 2;
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
