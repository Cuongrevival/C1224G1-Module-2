import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Scanner;
public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Z]", "").toLowerCase();

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            queue.add(ch);
            stack.push(ch);
        }

        while (!queue.isEmpty()) {
            if (queue.poll() != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}
