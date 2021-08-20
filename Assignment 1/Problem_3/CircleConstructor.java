import java.util.Scanner;

class  Area{

    double result1;

    public Area(int r){
        result1 = ((Math.PI) * r * r);
    }

    public void displayResult1(){
        System.out.println(result1);
    }
}

public class CircleConstructor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius of the circle");

        int radius1 = sc.nextInt();

        Area circle = new Area(radius1);

        circle.displayResult1();
    }


}
