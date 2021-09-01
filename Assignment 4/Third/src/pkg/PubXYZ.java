package pkg;

public class PubXYZ {
    protected class ProtectedXYZ {
        protected static void protectedfun() {
            System.out.println("This method is being called from Protected function in Protected class protectedABC.");
        }
    }

    public static void fun4() {
        System.out.println("This method is being called from Public class PubXYZ in pkg Package.\n");
    }

    public static void fun5() {
        System.out.println("This method is also being called from Public class PubXYZ in pkg.");
        System.out.println("Difference of 34 and 23 is : " + (34 - 23) + "\n");
    }

    public static void fun8() {
        ProtectedXYZ.protectedfun();
    }
}
