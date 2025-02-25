package StudentPrint2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Kien", 30, "HT");
        Student student2 = new Student("Trung", 19, "HN");
        Student student3 = new Student("Cuong", 24, "THPCM");
        Student student4 = new Student("Van", 27, "NA");
        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        for (Student student : students) {
            System.out.println(student);
        }
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(students, ageComparator);
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
