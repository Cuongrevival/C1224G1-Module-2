package Management;

import CSVFile.StudentCSV;
import Management.Student.Student;
import Management.Student.Teacher;
import Management.Validate.Validate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class classManagement extends Validate {
    Scanner sc = new Scanner(System.in);
    StudentCSV studentInfo = new StudentCSV();
    List<Teacher> teachers =  new ArrayList<>();
    public void addNewStudent() {

        int id = studentInfo.getId();
        String studentName;
        do {
            System.out.print("Nhập tên sinh viên: ");
            studentName = sc.nextLine();
        } while (!isValidName(studentName));
        String studentDateOfBirth;
        do {
            System.out.print("Nhập ngày tháng năm sinh của sinh viên (dd/mm/yyyy): ");
            studentDateOfBirth = sc.nextLine();
        } while (!isValidateFormatOfDate(studentDateOfBirth));
        System.out.println("Nhập vào đây giới tính sinh viên (Nam/Nữ): ");
        String studentGender = sc.nextLine();
        String studentPhoneNumber;
        do {
            System.out.print("Nhập vào đây số điện thoại sinh viên: ");
            studentPhoneNumber = sc.nextLine();
        } while (!isValidatePhone(studentPhoneNumber, studentInfo.getExistingPhones()));
        String classId;
        do {
            System.out.print("Nhập vào đây mã lớp học: ");
            classId = sc.nextLine();
        } while (studentInfo.batchExists(classId));
        Student newStudent = new Student(id, studentName, studentDateOfBirth, studentGender, studentPhoneNumber, classId);
        studentInfo.addStudent(newStudent);
    }

    public void removeStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã sinh viên: ");
        int id = sc.nextInt();
        try {
            System.out.println("Bạn có chắc chắn muốn xóa? (y/n)");
            String choice = sc.nextLine();
            if (choice.equalsIgnoreCase("y")) {
                studentInfo.deleteStudentById(id);
            } else if (choice.equalsIgnoreCase("n")) {
                System.out.println("Quay về menu chính");
            }
        } catch (NotFoundStudentException e) {
            System.out.println(e.getMessage());
        }
    }

    public void showStudentWithBatchName() {
        List<Student> students = studentInfo.getStudents();
        Map<String, String> classMap = studentInfo.getBatchMap();
        System.out.print("Mã SV | Tên sinh viên | Ngày sinh | Giới tính | Tên lớp học");

        for (Student s : students) {
            String batchName = classMap.getOrDefault(s.getClassId(), "Không xác định");
            System.out.print(s.getStudentId() + "|" + s.getStudentName() + "|" + s.getStudentBirthDate() + "|" + s.getStudentSex() + "|" + batchName);
        }
    }
    public void findTeacherById() {
        System.out.println("Nhập vào đây mã giáo viên");
        String teacherId = sc.nextLine();
        boolean found = false;
        for (Teacher teacher : teachers) {
            if (teacherId.equals(teacher.getTeacherId())) {
                found = true;
                System.out.println("Mã giáo viên: "  + teacher.getTeacherId());
                System.out.println("Tên giáo viên: "  + teacher.getTeacherName());
                System.out.println("Ngày sinh: " + teacher.getDateOfBirth());
                System.out.println("Giới tính: " + teacher.getSex());
                System.out.println("Điện thoại: " + teacher.getTelephoneNum());
                break;
            }
        }
        if (!found) {
            System.err.println("Không tìm thấy giáo viên");
        }
    }
    public void searchStudent() {
        System.out.println("Nhập vào đây một phần tên sinh viên: ");
        String studentName= sc.nextLine();
        studentInfo.searchStudentByName(studentName);
    }
}
