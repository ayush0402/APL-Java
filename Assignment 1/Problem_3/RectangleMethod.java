import java.util.Scanner;

public class RectangleMethod {

    static int areaRectangle(int l, int b){
        return l * b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length and breadth of the rectangle");

        int l = sc.nextInt();;
        int b = sc.nextInt();

        System.out.println(areaRectangle(l,b));
    }
}
