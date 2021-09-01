import pkg.*;

public class Main implements InterABC {
    @Override
    public void interfaceFunction() {
        System.out.println("============================================================");
        System.out.println("This method is being overridden from InterABC Interface.");
        System.out.println("Fields stored in the Interface : ");
        System.out.println("Name : " + name);
        System.out.println("Number : " + num1);
        System.out.println("============================================================");
    }

    public static void main(String[] args) {
        System.out.println("============================================================");
        PubABC.fun1();
        PubABC.fun2();
        PubABC.fun3();
        System.out.println("============================================================");

        System.out.println("============================================================");
        PubXYZ.fun4();
        PubXYZ.fun5();
        PubXYZ.fun8();
        System.out.println("============================================================");

        System.out.println("============================================================");
        PubIJK.fun6();
        PubIJK.fun7();
        System.out.println("============================================================");

        Main obj = new Main();
        obj.interfaceFunction();

    }
}
