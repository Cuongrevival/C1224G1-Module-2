import java.util.Stack;
import java.util.Scanner;
public class ParenthesesCheck {
    public static boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();
        for (char sym : str.toCharArray()) {
            if (sym == '(' || sym == '{' || sym == '[') {
                stack.push(sym);
            } else if (sym == ')' || sym == '}' || sym == ']') {
                if (stack.isEmpty()) return false;

                char left = stack.pop();
                if (!isMatching(left, sym)) return false;
            }
        }

        return stack.isEmpty();
    }

    private static boolean isMatching(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        System.out.println(isValid(str));
    }
}
