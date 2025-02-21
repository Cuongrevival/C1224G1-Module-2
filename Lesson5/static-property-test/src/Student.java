public class Student {
    private int rollno;
    public String name;
    private static String college = "College";
    Student(int r, String n) {
        rollno = r;
        name = n;
    }
    static void change(){
        college = "CODEGYM";
    }
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}
