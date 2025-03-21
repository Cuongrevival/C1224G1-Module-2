import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentFile {
    public static void writeDataToFile(String fileName, List<Student> students) {
        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Student> readDataFromFile(String fileName) {
        List<Student> students = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();
            ois.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "Vũ Kiều Anh", "Hà Nội"));
        students.add(new Student(2, "Nguyễn Minh Quân", "Hà Nội"));
        students.add(new Student(3, "Đặng Huy Hoà", "Đà Nẵng"));
        students.add(new Student(4, "Nguyễn Khánh Tùng", "Hà Nội"));
        students.add(new Student(5, "Nguyễn Khắc Nhật", "Hà Nội"));
        writeDataToFile("students.txt", students);
        List<Student> students2 = readDataFromFile("students.txt");
        for (Student student : students2) {
            System.out.println(student);
        }
    }
}
