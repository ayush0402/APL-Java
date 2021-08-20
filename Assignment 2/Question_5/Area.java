import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        System.out.println("Welcome to Area Calculator");
        System.out.println("1 -> Circle\n2 -> Pentagon\n3 -> Triangle\n4 -> Square\n5 -> Rectangle\n-1 -> Terminate Program");
        boolean looped = true;
        while (looped) {
            System.out.println("Enter the number corresponding to the shape you want to find area of OR -1 to terminate");

            Scanner sc = new Scanner(System.in);
            int shape = sc.nextInt();
            double area = 0;
            if (shape != -1) {
                switch (shape) {
                    case 1: {
                        System.out.println("Input radius of the circle");
                        int r = sc.nextInt();

                        area = (Math.PI) * r * r;
                        break;
                    }
                    case 2: {
                        System.out.println("Enter the length of side of Pentagon");
                        int side = sc.nextInt();

                        area = (0.25) * side * side * Math.sqrt(25 + 10 * Math.sqrt(5));
                        break;
                    }
                    case 3: {
                        System.out.println("Enter base and height of the triangle");
                        int b = sc.nextInt();
                        int h = sc.nextInt();

                        area = (0.5) * b * h;
                        break;
                    }
                    case 4: {
                        System.out.println("Enter the length of side of the Square");
                        int a = sc.nextInt();

                        area = a * a;
                        break;
                    }
                    case 5: {
                        System.out.println("Enter the length and breadth of the Rectangle");
                        int l, b;
                        l = sc.nextInt();
                        b = sc.nextInt();

                        area = l * b;
                        break;
                    }
                }

                System.out.println("The area of the shape is : " + area);
                System.out.println("=====================================");
            } else {
                System.out.println("Terminating Program");
                looped = false;
            }
        }
    }
}
