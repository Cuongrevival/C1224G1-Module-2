import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class DemergingAlgorithm {
    public static void demerge(Person[] people, String outputFile) {
        Queue<Person> NU = new LinkedList<>();
        Queue<Person> NAM = new LinkedList<>();

        // Phân loại vào hai hàng đợi
        for (Person p : people) {
            if (p.gender.equalsIgnoreCase("Female")) {
                NU.add(p);
            } else {
                NAM.add(p);
            }
        }

        // Ghi vào file output
        try (FileWriter writer = new FileWriter(outputFile)) {
            while (!NU.isEmpty()) {
                writer.write(NU.poll() + "\n");
            }
            while (!NAM.isEmpty()) {
                writer.write(NAM.poll() + "\n");
            }
            System.out.println("Đã ghi kết quả vào file: " + outputFile);
        } catch (IOException e) {
            System.err.println("Lỗi ghi file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Person[] people = {
                new Person("Nguyen Thi A", "Female"),
                new Person("Tran Van B", "Male"),
                new Person("Le Thi C", "Female"),
                new Person("Pham Van D", "Male"),
                new Person("Hoang Thi E", "Female")
        };

        demerge(people, "output.txt");
    }
}
