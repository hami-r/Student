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
                    System.out.println("Student ADDED = " + studentList.size());
                    break;
                case 2:
                    System.out.println("Number of Students: " + studentList.size());
                    for (int i = 0; i < studentList.size(); i++) {
                        System.out.println((i+1) + ")");
                        studentList.get(i).display();
                    }
                    break;
                case 3:
                    System.out.println("Enter the admission number:");
                    admissionNumber = scanner.nextLine();
                    boolean isFound = false;
                    int found = 0;
                    for(int i = 0; i < studentList.size(); i++) {
                        if(studentList.get(i).admissionNumber == admissionNumber) {
                            isFound = true;
                            found = i;
                            break;
                        }
                    }
                    if(isFound){
                        System.out.println("Student founded!!");
                        studentList.get(found).display();
                    }
                    else {
                        System.out.println("Student not found");
                    }
                    break;
                case 4:
                    System.out.println("Enter the employee ID to be deleted");
                    admissionNumber = scanner.nextLine();
                    for(int i = 0; i < studentList.size(); i++) {
                        if(studentList.get(i).admissionNumber == admissionNumber) {
                            studentList.remove(i);
                            System.out.println("Student is deleted!\n" +
                                    "Current number of students = " + studentList.size());
                            break;
                        }
                    }
                    break;
                case 5:
                    System.out.println("Exiting");
                    isContinue = false;
                    break;
                default:
                    System.out.println("Enter a valid option!");
                    break;

            }

        }

    }

}