import java.util.Scanner;

class RectangleArea{

    int res;

    public RectangleArea(int l, int b){
        res = l * b;
    }

    public void displayRes(){
        System.out.println(res);
    }
}
public class RectangleConstructor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length and breadth of the rectangle");

        int l = sc.nextInt();;
        int b = sc.nextInt();

        RectangleArea rectangle = new RectangleArea(l,b);

        rectangle.displayRes();

    }
}
