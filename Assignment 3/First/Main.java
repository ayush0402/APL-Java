import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Class name you want to create an object for among\nTeacher\nStudent\nStaff");
        String option;
        option = sc.next();

        if (option.equalsIgnoreCase("teacher")) {
            System.out.println("Creating an Object for Class Teacher...");
            Teacher _teacher = new Teacher();
            System.out.println("Taking Input for the created Object : ");
            _teacher.getTeacherName();

            /* using inherited fields and Methods from Student class to
            input overlapping information without rewriting the code.
             */
            _teacher.getStudent();

            /* calling setter function from Teacher class*/

            _teacher.getTeacher();
            System.out.println("Input Taken!");

            System.out.println("Displaying taken Data...");
            _teacher.displayTeacher();

        } else if (option.equalsIgnoreCase("student")) {
            System.out.println("Creating an Object for Class Student...");
            Student _student = new Student();
            System.out.println("Taking Input for the created Object : ");

            /* calling setter functions from Student class*/

            _student.getStudentName();
            _student.getStudent();
            System.out.println("Input Taken!");
            System.out.println("Displaying taken Data...");
            _student.displayStudent();
        } else {
            System.out.println("Creating an Object for Class Staff...");
            Staff _staff = new Staff();
            System.out.println("Taking Input for the created Object : ");
            _staff.getStaffName();

             /* using inherited fields and Methods from Student class to
            input overlapping information without rewriting the code.
             */

            _staff.getStudent();

            /* calling setter function from Staff class*/

            _staff.getStaff();
            System.out.println("Input Taken!");

            System.out.println("Displaying taken Data...");
            _staff.displayStaff();
        }
    }
}
