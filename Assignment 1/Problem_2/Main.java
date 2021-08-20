import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 4 numbers");

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();

        Addition obj1 = new Addition(a,b);
        Addition obj2 = new Addition(a,b,c);
        Addition obj3 = new Addition(a,b,c,d);

        obj1.output();
        obj2.output();
        obj3.output();

    }
}
