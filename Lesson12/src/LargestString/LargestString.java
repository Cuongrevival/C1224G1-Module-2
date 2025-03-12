package LargestString;
import java.util.*;

public class LargestString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        LinkedList<Character> list = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) { // n
            LinkedList<Character> list1 = new LinkedList<>();
            list1.add(s.charAt(i));
            for (int j = i + 1; j < s.length(); j++) {//n - 1
                if (s.charAt(j) > list1.getLast()) {
                list1.add(s.charAt(j));
                }
            }
            if (list1.size() > list.size()) {
                list.clear();// 1
                list.addAll(list1);//1
            }
            list1.clear();
        }
        for (Character c : list) {
            System.out.print(c);
        }
    }
}
// f(n * (n - 1)) + f(1 + 1)
// O(n^2) + O(n)
// O(n^2)
