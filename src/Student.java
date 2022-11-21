public class Student {
    String name;
    long admissionNumber;
    int rollNumber;
    String college;

    public Student(String name, long admissionNumber, int rollNumber, String college) {
        this.name = name;
        this.admissionNumber = admissionNumber;
        this.rollNumber = rollNumber;
        this.college = college;
    }

    void display() {
        System.out.println("Name: " + name +"\n" +
                "Admission Number: " + admissionNumber + "\n" +
                "Roll Number: " + rollNumber +"\n" +
                "College: " + college + "\n");
    }

}
