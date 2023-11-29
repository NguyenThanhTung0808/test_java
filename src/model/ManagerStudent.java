package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ManagerStudent {
    public static List<Student> studentList = new ArrayList<>();

    public ManagerStudent() {
    }

    public Student inputStudent(List<Student> studentList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student Information:");
        Student student = new Student();
        boolean checkID;
        do {
            checkID = true;
            student.setStudentID(Validator.getString(scanner, "Student ID: "));

            for (Student st : studentList) {
                if (st.getStudentID().equalsIgnoreCase(student.getStudentID())) {
                    System.out.println("The ID is available");
                    checkID = false;
                    break;
                }
            }
        } while (!checkID);

        student.setStudentName(Validator.getString(scanner, "Name: "));
        student.setNumberPhone(Validator.getString(scanner, "Phone: "));
        student.setAddress(Validator.getString(scanner, "Address: "));
        student.setBatch(Validator.getString(scanner, "Batch: "));
        student.setMark1(Validator.getDouble(scanner, "Mark1: "));
        student.setMark1(Validator.getDouble(scanner, "Mark2: "));
        return student;
    }

    public void addStudent() {
        studentList.add(inputStudent(studentList));
    }

    public void showAllStudentList() {
        System.out.println("Show All Student List:");
        for (int i = 0; i < studentList.size(); i++) {
            Student st = studentList.get(i);
            System.out.println(st)
            ;
        }
    }


}



