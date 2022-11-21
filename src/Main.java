import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        boolean isContinue = true;
        while (isContinue) {
            System.out.println("""
                    <---------------MENU------------->
                    1. Add Student
                    2. Display All Student
                    3. Search Student
                    4. Delete Student
                    5. Exit
                    Select your option:\n""");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the details:");
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Admission Number: ");
                    String admissionNumber = scanner.nextLine();
                    System.out.print("Roll Number: ");
                    int rollNumber = scanner.nextInt();
                    System.out.print("College: ");
                    String college = scanner.nextLine();
                    Student student = new Student(name, admissionNumber, rollNumber, college);
                    studentList.add(student);
                    break;
            }

        }

    }

}