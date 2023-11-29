package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ManagerTeacher {
    public static List<Teacher> teachersList = new ArrayList<>();

    public ManagerTeacher() {
    }

    public Teacher inputTeacher(List<Teacher> teachersList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student Information:");
        Teacher teacher = new Teacher();
        boolean checkID;
        do {
            checkID = true;
            teacher.setTeacherId(Validator.getString(scanner, "Student ID: "));

            for (Teacher tc : teachersList) {
                if (tc.getTeacherId().equalsIgnoreCase(teacher.getTeacherId())) {
                    System.out.println("The ID is available");
                    checkID = false;
                    break;
                }
            }
        } while (!checkID);

        teacher.setTeacherName(Validator.getString(scanner, "Name: "));
        teacher.setNumberPhone(Validator.getString(scanner, "Phone: "));
        teacher.setAddress(Validator.getString(scanner, "Address: "));
        teacher.setSalary(Validator.getDouble(scanner, "Salary: "));
        teacher.setNumberWorkDay(Validator.getInt(scanner, "NumberWorkDay: "));
        return teacher;
    }

    public void addTeacher() {
        teachersList.add(inputTeacher(teachersList));
    }

    public void showAllTeacherList() {
        System.out.println("Show All List:");
        for (int i = 0; i < teachersList.size(); i++) {
            Teacher st = teachersList.get(i);
            System.out.println(st)
            ;
        }
    }


}



