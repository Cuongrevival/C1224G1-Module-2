package CSVFile;

import Management.NotFoundStudentException;
import Management.Student.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentCSV {
    private final String studentFile = "data/students.csv";
    private final String batchFile = "data/batchs.csv";

    public int getId() {
        int id = 0;
        File file = new File(studentFile);
        if (file.exists()) {
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                br.readLine();
                String line;
                while ((line = br.readLine()) != null) {
                    String[] data = line.split(",");
                    id = Integer.parseInt(data[0]);
                }

            } catch (IOException e) {
                System.err.println("ERROR!");
            }
        }
        return id + 1;

    }

    public List<String> getExistingPhones() {
        List<String> phones = new ArrayList<>();
        File file = new File(studentFile);
        if (file.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                reader.readLine();
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split(",");
                    phones.add(parts[4]);
                }
            } catch (IOException e) {
                System.err.println("ERROR!");
            }
        }
        return phones;
    }

    public boolean batchExists(String classId) {
        try (BufferedReader br = new BufferedReader(new FileReader(batchFile))) {
            br.readLine();
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts[0].equals(classId)) {
                    return true;
                }
            }
        } catch (IOException e) {
            System.err.println("ERROR!");
        }
        return false;
    }

    public void addStudent(Student student) {
        File file = new File(studentFile);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(studentFile, true))) {
            if (!file.exists()) {
                bw.write("id,name,date of birth, gender, phone number, class id");
                bw.newLine();
            }
            bw.write(student.toString());
            bw.newLine();
        } catch (IOException e) {
            System.err.println("ERROR!");
        }
    }

    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        File file = new File(studentFile);
        if (file.exists()) {
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                br.readLine();
                String line;
                while ((line = br.readLine()) != null) {
                    String[] parts = line.split(",");
                    students.add(new Student(Integer.parseInt(parts[0]), parts[1], parts[2], parts[3], parts[4], parts[5]));
                }
            } catch (IOException e) {
                System.err.println("ERROR!");
            }
        }
        return students;
    }

    public void deleteStudentById(int id) {
        List<Student> students = getStudents();
        File file = new File(studentFile);
        boolean found = false;
        for (Student student : students) {
            if (student.getStudentId() == id) {
                students.remove(student);
                found = true;
                break;
            }
        }
        if (!found) {
            throw new NotFoundStudentException("Sinh viên không tồn tại");
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            bw.write("id,name,date of birth, gender, phone number, class id");
            bw.newLine();
            for (Student student : students) {
                bw.write(student.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            System.err.println("ERROR!");
        }
    }

    public Map<String, String> getBatchMap(){
        Map<String, String> batchMap = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(batchFile))) {
            reader.readLine();
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                batchMap.put(parts[0], parts[1]);
            }
        } catch (IOException e) {
            System.err.println("ERROR!");
        }
        return batchMap;
    }
    public void searchStudentByName(String name) {
        boolean found = false;
        File file = new File(studentFile);
        if (file.exists()) {
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                br.readLine();
                String line;
                System.out.println("Sinh viên tìm thấy: ");
                while ((line = br.readLine()) != null) {
                    String[] parts = line.split(",");
                    if (parts[1].toLowerCase().contains(name.toLowerCase())) {
                        System.out.println("Mã sinh viên: " + parts[0]);
                        System.out.println("Tên sinh viên: " + parts[1]);
                        System.out.println("Ngày sinh: " + parts[2]);
                        System.out.println("Giới tính: " + parts[3]);
                        System.out.println("Số điện thoại: " + parts[4]);
                        System.out.println("Mã lớp học: " + parts[5]);
                        found = true;
                    }
                }
                if (!found) {
                    System.out.println("Không tìm thấy sinh viên: " + name);
                }
            } catch (IOException e) {
                System.err.println("ERROR!");
            }
        }
    }
}


