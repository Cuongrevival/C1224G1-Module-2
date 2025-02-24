import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
public class CountNumberOfWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the paragraph: ");
        String paragraph = sc.nextLine();
        sc.close();
        getNumberOfWords(paragraph);
    }

    private static void getNumberOfWords(String paragraph) {
        TreeMap<String, Integer> paragraphWords = new TreeMap<>();
        paragraph = paragraph.toLowerCase().replaceAll("[^a-zA-Z\\s]", "");
        String[] words = paragraph.split("\\s+");
        for (String word : words) {
            if (!word.isEmpty()) {
                paragraphWords.put(word, paragraphWords.getOrDefault(word, 0) + 1);
            }
        }
        System.out.println("The number of each word appears in paragraph: ");
        for (Map.Entry<String, Integer> entry : paragraphWords.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}