package Management.Student;

import java.time.LocalDate;

public class Student extends Class{
    private int studentId;
    private String studentName;
    private String studentBirthDate;
    private String studentSex;
    private String studentTelephoneNumber;


    public Student(int studentId, String studentName, String studentBirthDate, String studentSex, String studentTelephoneNumber, String classId) {
        super(classId);
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentBirthDate = studentBirthDate;
        this.studentSex = studentSex;
        this.studentTelephoneNumber = studentTelephoneNumber;
    }
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }


    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentBirthDate() {
        return studentBirthDate;
    }

    public void setStudentBirthDate(String studentBirthDate) {
        this.studentBirthDate = studentBirthDate;
    }

    public String getStudentSex() {
        return studentSex;
    }

    public void setStudentSex(String studentSex) {
        this.studentSex = studentSex;
    }

    public String getStudentTelephoneNumber() {
        return studentTelephoneNumber;
    }

    public void setStudentTelephoneNumber(String studentTelephoneNumber) {
        this.studentTelephoneNumber = studentTelephoneNumber;
    }

    @Override
    public String toString() {
        return  studentId + "," + studentName + "," + studentBirthDate + "," + studentSex + "," + studentTelephoneNumber + "," + getClassId();
    }
}
