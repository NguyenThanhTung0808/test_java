import model.*;


import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println("main");
        Scanner scanner = new Scanner(System.in);
        ManagerStudent studentManager = new ManagerStudent();
        ManagerTeacher managerTeacher = new ManagerTeacher();
        int i;
        do {
            MenuUtils.printMenu();

            do {
                i = Validator.getInt(scanner, "Choice: ");
                if ((i < 1) || (i > 6))
                    System.out.println("Enter a number from 1 to 5");
            } while ((i < 1) || (i > 6));

            switch (i) {
                case 1 -> {
                    studentManager.addStudent();
                    System.out.println();
                }
                case 2 -> {
                    managerTeacher.addTeacher();
                    System.out.println();
                }
                case 3 -> {
                    studentManager.showAllStudentList();
                    System.out.println();
                }
                case 4 -> {
                    managerTeacher.showAllTeacherList();
                    System.out.println();

                }
                
                case 5 -> System.out.println("Program is finished");
            }
        } while (i != 5);
    }
}