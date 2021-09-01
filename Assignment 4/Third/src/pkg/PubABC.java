package pkg;

public class PubABC {
    private class PrivateABC {
        private static void privatefun1() {
            System.out.println("This method is being called from Private function in Private class privateABC.");
        }
    }

    public static void fun1() {
        System.out.println("This method is being called from Public class PubABC in pkg Package.\n");
    }

    public static void fun2() {
        System.out.println("This method is also being called from Public class PubABC in pkg.");
        System.out.println("Sum of 34 and 23 is : " + (34 + 23) + "\n");
    }

    public static void fun3() {
        PrivateABC.privatefun1();
    }
}
