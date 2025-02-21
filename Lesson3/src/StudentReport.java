import java.util.Scanner;

public class StudentReport {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter number of students: ");
            n = sc.nextInt();
            if (n > 30) {
                System.out.println("You have entered more than 30 students!");
            }
        } while (n > 30);
        int[] arr = new int[n];
        String s;
        String[] students = new String[n];
        int grade;
        int count = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter student " + (i + 1) + " name: ");
            s = sc.next();
            students[i] = s;
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Enter student " + (i + 1) + " grade: ");
            grade = sc.nextInt();
            arr[i] = grade;
        }
        for (int i = 0; i < n; i++) {
            if(arr[i] >= 5) {
                System.out.println("Students " + students[i] + " has passed!");
                count++;
            }
        }
        System.out.println("There are " + count + " students pass the test.");
    }
}
