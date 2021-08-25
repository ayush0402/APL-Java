import java.util.Scanner;

public class Staff extends Student {
    String work;
    String name_staff;

    public void getStaffName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name of the Staff : ");
        this.name_staff = sc.next();
    }

    public void getStaff() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Work of the Staff : ");
        this.work = sc.next();
    }

    public void displayStaff() {
        System.out.println("Name of the Staff : " + name_staff);
        System.out.println("Roll Number of Staff : " + roll_number);
        System.out.println("Phone Number of Staff : " + phone_number);
        System.out.println("Work of the Staff : " + work);
    }

}
