import java.util.Scanner;

public class Main {

    public static int binaryToDecimal(String binaryString) {

        int size = binaryString.length();
        if (size == 1) {
            return Integer.parseInt(binaryString);
        } else {
            return binaryToDecimal(binaryString.substring(1, size)) + Integer.parseInt(binaryString.substring(0, 1)) * (int) Math.pow(2, size - 1);
        }

    }

    public static void main(String[] args) {
        String binary;

        System.out.println("Enter the Binary Number to be converted ");
        Scanner sc = new Scanner(System.in);
        binary = sc.next();
        System.out.println("Enter number in Decimal format is : ");
        System.out.println(binaryToDecimal(binary));
    }
}
