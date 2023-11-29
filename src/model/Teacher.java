package model;

public class Teacher {
    private String teacherId;
    private String teacherName;
    private String numberPhone;
    private String address;
    private double salary;
    private int numberWorkDay;
    public Teacher(){

    }

    public Teacher(String teacherId, String teacherName, String numberPhone, String address, double salary, int numberWorkDay) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.numberPhone = numberPhone;
        this.address = address;
        this.salary = salary;
        this.numberWorkDay = numberWorkDay;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
       double getSalary = numberWorkDay * 800.000;
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getNumberWorkDay() {
        return numberWorkDay;
    }

    public void setNumberWorkDay(int numberWorkDay) {
        this.numberWorkDay = numberWorkDay;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", teacherName='" + teacherName + '\'' +
                ", numberPhone='" + numberPhone + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                ", numberWorkDay=" + numberWorkDay +
                '}';
    }

}
