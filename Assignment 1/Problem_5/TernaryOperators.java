import java.util.Scanner;

public class TernaryOperators {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 4 numbers to compare : ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int max =  (a > b && a > c && a > d) ? a : (b > c && b > d && b > a) ? b : (c > a && c > b && c > d) ? c : d;

        int min = (a < b && a < c && a < d) ? a : (b < c && b < d && b < a) ? b : (c < a && c < b && c < d) ? c : d;

        System.out.println("Maximum number is : " + max);
        System.out.println("Minimum number is : " +  min);

    }
}
