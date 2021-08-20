import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));

        boolean looped = true;
        while (looped) {

            System.out.println("=================================================");
            System.out.println("Calculator Initiated");
            System.out.println("Choose the type of operation to be performed between 'Arithmetic' and 'Logical' by typing the preferred choice below");
            System.out.println("or Enter 'exit' to terminate the program");
            System.out.println("=================================================");

            String choice1;
            choice1 = sc.next();

            if (choice1.equalsIgnoreCase("exit")) {
                System.out.println("Exiting from the Calculator");
                break;
            }
            if (choice1.equalsIgnoreCase("Arithmetic")) {
                System.out.println("Choose the Arithmetic operation among Addition, Subtraction, Multiplication, Division and Modulo by typing your response below");
                String choice2;
                choice2 = sc.next();
                double operand1, operand2;
                System.out.println("Input the first operand: ");
                operand1 = sc.nextDouble();

                System.out.println("Input the second operand: ");
                operand2 = sc.nextDouble();

                if (choice2.equalsIgnoreCase("Addition")) {
                    System.out.println(operand1 + operand2);
                } 
                else if (choice2.equalsIgnoreCase("Subtraction")) {
                    System.out.println(operand1 - operand2);
                } 
                else if (choice2.equalsIgnoreCase("Division")) {
                    
                    if (operand2 == 0) {
                    	// can't divide a number by zero
                        System.out.println("Woah!, you can't divide a number by Zero(0).");
                    } 
                    else System.out.println((double) operand1 / operand2);

                } 
                else if (choice2.equalsIgnoreCase("Multiplication")) {
                    System.out.println(operand1 * operand2);
                } 
                else if (choice2.equalsIgnoreCase("Modulo")) {
                    System.out.println(((int) operand1) % ((int) operand2));
                } 
                else {
                    //invalid
                    System.out.println("Invalid Input: Wrong operation name - Terminating Program");
                }

            } 
            else if (choice1.equalsIgnoreCase("Logical")) {
                System.out.println("Enter the type of Logical operation you want to use from AND, OR and NOT");

                String choice3;
                choice3 = sc.next();

                if (choice3.equalsIgnoreCase("AND")) {
                    boolean operand1, operand2;
                    System.out.println("Input first operand from true/false");
                    operand1 = sc.nextBoolean();
                    System.out.println("Input second operand from true/false");
                    operand2 = sc.nextBoolean();
                    
                    System.out.println(operand1 && operand2);
                } 
                else if (choice3.equalsIgnoreCase("OR")) {
                    boolean operand1, operand2;
                    System.out.println("Input first operand from true/false");
                    operand1 = sc.nextBoolean();
                    System.out.println("Input second operand from true/false");
                    operand2 = sc.nextBoolean();
                    
                    System.out.println(operand1 || operand2);
                }
                else if (choice3.equalsIgnoreCase("NOT")) {
                    System.out.println("Input the operand from true/false");
                    boolean operand1;
                    operand1 = sc.nextBoolean();
                    
                    System.out.println(!operand1);

                } 
                else {
                    System.out.println("Invalid Input - Terminating Program");
                }

            } 
            else {
                //invalid
                System.out.println("Invalid Input - Terminating Program");

            }
        }
        sc.close();
    }


}
