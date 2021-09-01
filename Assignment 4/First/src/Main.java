import MCA.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name;
        int roll_number;
        int sub1, sub2, sub3;

        System.out.print("Input name of the Student : ");
        name = sc.next();
        System.out.print("Input (integer) roll number of the Student : ");
        roll_number = sc.nextInt();
        System.out.print("Input marks of first subject : ");
        sub1 = sc.nextInt();
        System.out.print("Input marks of second subject : ");
        sub2 = sc.nextInt();
        System.out.print("Input marks of third subject : ");
        sub3 = sc.nextInt();

        Student stu = new Student(name, roll_number, sub1, sub2, sub3);

        System.out.println("================================================");

        stu.display();


    }
}
