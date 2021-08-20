import java.util.Scanner;

public class CircleMethod {

    static double areaCircle(int r){
        return ((Math.PI) * r * r);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of the circle");
        int radius = sc.nextInt();

        System.out.println(areaCircle(radius));
    }

}
