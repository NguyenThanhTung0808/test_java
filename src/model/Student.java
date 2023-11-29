package model;

public class Student {
    public String studentID;
    private String studentName;
    private String numberPhone;
    private String address;
    private String Batch;
    private double Mark1;
    private double Mark2;

    public Student() {

    }

    public String getStudentID() {
        return studentID;
    }

    public Student(String studentID, String studentName, String numberPhone, String address, String batch, double mark1, double mark2) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.numberPhone = numberPhone;
        this.address = address;
        Batch = batch;
        Mark1 = mark1;
        Mark2 = mark2;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
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

    public String getBatch() {
        return Batch;
    }

    public void setBatch(String batch) {
        Batch = batch;
    }

    public double getMark1() {
        return Mark1;
    }

    public void setMark1(double mark1) {
        Mark1 = mark1;
    }

    public double getMark2() {
        return Mark2;
    }

    public void setMark2(double mark2) {
        Mark2 = mark2;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", studentName='" + studentName + '\'' +
                ", numberPhone='" + numberPhone + '\'' +
                ", address='" + address + '\'' +
                ", Batch='" + Batch + '\'' +
                ", Mark1=" + Mark1 +
                ", Mark2=" + Mark2 +
                '}';
    }
    public double tinhDiem() {
        double AvgMark;
        AvgMark = (Mark1 + Mark2)/2;

        return tinhDiem();
    }
}
