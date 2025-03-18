package Management.Student;

import java.time.LocalDate;

public class Teacher extends Class{
    private String teacherName;
    private LocalDate dateOfBirth;
    private String sex;
    private String telephoneNum;

    public Teacher(String teacherId,
                    String teacherName,
                   LocalDate dateOfBirth, String sex, String telephoneNum) {
        super(teacherId);
        this.teacherName = teacherName;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        this.telephoneNum = telephoneNum;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getTelephoneNum() {
        return telephoneNum;
    }

    public void setTelephoneNum(String telephoneNum) {
        this.telephoneNum = telephoneNum;
    }
}
