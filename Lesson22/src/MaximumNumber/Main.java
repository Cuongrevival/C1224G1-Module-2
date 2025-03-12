package MaximumNumber;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            set.add(number);
        }
        CollectionOperations collectionOperations = new CollectionUtilAdapter();
        Client client = new Client(collectionOperations);
        client.printMaxValue(set);
    }
}
