import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean looped = true;

        while (looped) {
            System.out.println("Input the Operation to be performed from Addition, Subtraction, Multiplication, Division or Exit : ");

            Methods calculator = new Methods();

            String option;
            option = sc.next();
            if (option.equalsIgnoreCase("exit")) {
                looped = false;
                break;
            }
            int x, y;

            System.out.print("Enter first operand : ");
            x = sc.nextInt();

            System.out.print("Enter second operand : ");
            y = sc.nextInt();

            if (option.equalsIgnoreCase("addition")) {
                calculator.Add(x, y);
            } else if (option.equalsIgnoreCase("subtraction")) {
                calculator.Subtract(x, y);
            } else if (option.equalsIgnoreCase("multiplication")) {
                calculator.Multiply(x, y);
            } else if (option.equalsIgnoreCase("division")) {
                calculator.Divide(x, y);
            } else {
                System.out.println("Invalid Input");
            }
        }
    }
}
