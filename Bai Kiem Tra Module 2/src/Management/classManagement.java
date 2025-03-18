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
    Teacher teacher;
//   public classManagement{
//        teachers.add(new Teacher("GV01", "Nguyễn Văn A", LocalDate.of(1980, 5, 20), "Nam", "0901234567"));
//        teachers.add(new Teacher("GV02", "Trần Thị B", LocalDate.of(1985, 7, 15), "Nữ", "0912345678"));
//        teachers.add(new Teacher("GV03", "Lê Văn C", LocalDate.of(1979, 3, 10), "Nam", "0908765432"));
//        teachers.add(new Teacher("GV04", "Phạm Thị D", LocalDate.of(1990, 12, 5), "Nữ", "0919876543"));
//}
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
            System.out.println("Nhập vào đây số điện thoại sinh viên: ");
            studentPhoneNumber = sc.nextLine();
        } while (!isValidatePhone(studentPhoneNumber, studentInfo.getExistingPhones()));
        String classId;
        do {
            System.out.print("Nhập vào mã lớp học: ");
            classId = sc.nextLine();
        } while (!studentInfo.batchExists(classId));

        Student newStudent = new Student(id, studentName, studentDateOfBirth, studentGender, studentPhoneNumber, classId);
        studentInfo.addStudent(newStudent);
    }

    public void removeStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã sinh viên: ");
        int id = sc.nextInt();
        sc.nextLine();
        try {
            System.out.println("Bạn có chắc chắn muốn xóa? (y/n)");
            String choice = sc.nextLine();
            if (choice.equalsIgnoreCase("y")) {
                studentInfo.deleteStudentById(id);
                System.out.println("Đã xóa thành công");
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
        System.out.println("Mã SV | Tên sinh viên | Ngày sinh | Giới tính | Số điện thoại | Tên lớp học");

        for (Student s : students) {
            String batchName = classMap.getOrDefault(s.getClassId(), "Không xác định");
            System.out.println(s.getStudentId() + " | " + s.getStudentName() + " | " + s.getStudentBirthDate() + " | " + s.getStudentSex() + " | " + s.getStudentTelephoneNumber() + " | " + batchName);
        }
    }
    public void findTeacherById() {
        System.out.println("Nhập vào đây mã giáo viên");
        String teacherId = sc.nextLine();
        studentInfo.searchTeacherById(teacherId);
    }
    public void searchStudent() {
        System.out.println("Nhập vào đây một phần tên sinh viên: ");
        String studentName= sc.nextLine();
        studentInfo.searchStudentByName(studentName);
    }


}
