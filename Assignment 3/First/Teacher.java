import java.util.Scanner;

public class Teacher extends Student {
    String area_of_teaching;
    String name_teacher;

    Science sci = new Science();
    Arts art = new Arts();
    Commerce com = new Commerce();

    public void getTeacherName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name of the Teacher : ");
        this.name_teacher = sc.next();
    }

    public void getTeacher() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Area of Teaching of the Teacher : ");
        this.area_of_teaching = sc.next();
        sci.getScience();
        art.getArts();
        com.getCommerce();
    }

    public void displayTeacher() {
        System.out.println("Name of the Teacher : " + name_teacher);
        System.out.println("Roll number of the Teacher : " + roll_number);
        System.out.println("Phone Number of the Teacher : " + phone_number);
        System.out.println("Area of Teaching of the Teacher : " + area_of_teaching);
        sci.displayScience();
        art.displayArts();
        com.displayCommerce();
    }

    class Science {
        int number_of_students;

        public void getScience() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number of students under Science Stream : ");
            this.number_of_students = sc.nextInt();
        }

        public void displayScience() {
            System.out.println("Number of Students under Science stream is : " + number_of_students);
        }
    }

    static class Arts {
        int number_of_students;

        public void getArts() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number of student under Arts stream : ");
            this.number_of_students = sc.nextInt();
        }

        public void displayArts() {
            System.out.println("Number of Students under Arts stream is : " + number_of_students);
        }
    }

    static class Commerce {
        int number_of_students;

        public void getCommerce() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number of student under Commerce stream : ");
            this.number_of_students = sc.nextInt();
        }

        public void displayCommerce() {
            System.out.println("Number of Students under Commerce stream is : " + number_of_students);
        }
    }
}
