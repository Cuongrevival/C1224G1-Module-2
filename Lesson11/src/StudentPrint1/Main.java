package StudentPrint1;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Nam", 20, "HN");
        Student student2 = new Student("Hà", 19, "TPHCM");
        Student student3 = new Student("Trung", 20, "ĐN");
        Map<Student, Integer> studentMap = new HashMap<>();
        studentMap.put(student1, 1);
        studentMap.put(student2, 2);
        studentMap.put(student3, 3);
        studentMap.put(student1, 4);
        for (Map.Entry<Student, Integer> entry : studentMap.entrySet()) {
            System.out.println(entry.getKey());
        }
        Set<Student> setOfStudents = new HashSet<>();
        setOfStudents.add(student1);
        setOfStudents.add(student2);
        setOfStudents.add(student3);
        for (Student student : setOfStudents) {
            System.out.println(student);
        }
    }
}
