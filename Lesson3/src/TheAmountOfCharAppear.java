import java.util.Scanner;

public class TheAmountOfCharAppear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter here a line of text: ");
        String line = sc.nextLine();
        int[] count = new int[256];
        line = line.toLowerCase();
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) != ' ') {
                count[line.charAt(i)]++;
            }
        }
        System.out.println("The amount of characters appear in this line: ");
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                System.out.println((char) i + " : " + count[i]);
            }
        }
        System.out.println();
    }
}
