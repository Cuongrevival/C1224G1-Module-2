import java.util.Scanner;

public class FindElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter number of students: ");
        n = sc.nextInt();
        String[] students = new String[n];
        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter student name: ");
            String name = sc.next();
            students[i] = name;
        }
        System.out.println("Enter student you want to find: ");
        String student = sc.next();
        boolean found = false;
        for (int j = 0; j < students.length; j++) {
            if (student.equals(students[j])) {
                System.out.println("Student " + student + " is found at position " + j);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student " + student + " is not found");
        }
    }
}

