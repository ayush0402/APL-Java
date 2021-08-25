import java.util.Scanner;

public class Student {
    String name_student;
    String roll_number;
    long phone_number;

    public void getStudentName() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name of Student : ");
        this.name_student = sc.next();
    }

    public void getStudent() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Roll Number : ");
        this.roll_number = sc.next();
        System.out.println("Enter Phone Number : ");
        this.phone_number = sc.nextLong();
    }

    public void displayStudent() {
        System.out.println("Name of the Student : " + name_student);
        System.out.println("Roll Number of the Student : " + roll_number);
        System.out.println("Phone Number of the Student : " + phone_number);
    }

}
