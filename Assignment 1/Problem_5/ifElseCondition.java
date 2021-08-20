import java.util.Scanner;

public class ifElseCondition {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 4 numbers to compare : ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int max; int min;

        if(a > b && a > c && a > d){
            max = a;
        }
        else if(b > a && b > c && b > d){
            max = b;
        }
        else if(c > a && c > b && c > d){
            max = c;
        }
        else{
            max = d;
        }

        if(a < b && a < c && a < d){
            min = a;
        }
        else if(b < a && b < c && b < d){
            min = b;
        }
        else if(c < a && c < b && c < d){
            min = c;
        }
        else{
            min = d;
        }

        System.out.println("Maximum number is : " + max);
        System.out.println("Minimum number is : " +  min);

    }
}
