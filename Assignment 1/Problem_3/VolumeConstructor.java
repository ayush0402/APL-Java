import java.util.Scanner;

class  Volume{

    int result ;

    public Volume(int h, int w , int b){
        result = h * w * b;
    }

    public void displayResult(){
        System.out.println(result);
    }
}

public class VolumeConstructor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Height, Width and Breadth of the required box");

        int h = sc.nextInt();
        int w = sc.nextInt();
        int b = sc.nextInt();

        Volume box = new Volume(h,w,b);

        box.displayResult();

    }

}
