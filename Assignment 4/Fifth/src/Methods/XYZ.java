package Methods;

public class XYZ {
    private class privateClass{
        private static void privateFun(){
            System.out.println("This function is being called from the privateClass.\n");
        }
    }
    public static void fun2(){
        System.out.println("This function is being called from Public class XYZ.\n");
    }
    public static void fun3(){
        privateClass.privateFun();
    }
}
