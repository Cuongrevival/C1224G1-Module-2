public class encodeString {
    public static String encodeString(String str) {
        String result = "";
        java.util.Stack<Character> stack = new java.util.Stack<Character>();
        str = str + "";
        for (int i = 0; i < str.length(); i++) {
            if (stack.empty() || stack.peek() == str.charAt(i)) {
                stack.push(str.charAt(i));
            } else {
                int count = 0;
                result = result + stack.peek();
                while (!stack.empty()) {
                    count++;
                    stack.pop();
                }

                result = result + count;
                stack.push(str.charAt(i));
            }
        }
        return result;
    }
}