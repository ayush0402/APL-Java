import java.util.Scanner;

public class VolumeMethod {

    static int volume(int h, int w, int b){
        return h * w * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Height, Width and Breadth of the required box");

        int h = sc.nextInt();
        int w = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(volume(h,w,b));

    }

}
