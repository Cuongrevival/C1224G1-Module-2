
import Management.classManagement;
import CSVFile.StudentCSV;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            classManagement studentManagement = new classManagement();
            StudentCSV access = new StudentCSV();
            access.addDefaultBatchList();
            System.out.println("==QUẢN LÝ LỚP HỌC==");
            System.out.println("1. Thêm mới sinh viên");
            System.out.println("2. Xóa sinh viên");
            System.out.println("3. Xem danh sách sinh viên");
            System.out.println("4. Xem giáo viên theo mã giáo viên");
            System.out.println("5. Tìm kiếm sinh viên theo từ khóa tên sinh viên");
            System.out.println("0. Thoát");
            System.out.print("Bạn muốn sử dụng tiện ích nào: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    studentManagement.addNewStudent();
                    break;
                case 2:
                    studentManagement.removeStudent();
                    break;
                case 3:
                    studentManagement.showStudentWithBatchName();
                    break;
                case 4:

                    studentManagement.findTeacherById();
                    break;
                case 5:
                    studentManagement.searchStudent();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn này.");
                    break;
            }
        }
    }
}
