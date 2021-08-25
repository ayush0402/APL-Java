class Functions {

    /*These three functions are example of
    Function Overloading where it depends on number
    and type of Parameters.
     */
    public void Add(int x, int y) {
        System.out.println(x + y);
    }

    public void Add(int x, int y, int z) {
        System.out.println(x + y + z);
    }

    public void Add(double a, double b) {
        System.out.println(a + b);
    }
}

class Newfunctions extends Functions {
    @Override
    public void Add(int x, int y) {
        /* Example of Overriding */
        System.out.println("This function is the overridden version of the function being called from Derived class");
        System.out.println(x + y);
    }
}

public class Main {
    public static void main(String[] args) {
        Functions obj1 = new Functions();
        Newfunctions obj2 = new Newfunctions();

        System.out.println("Called same functions thrice but Overloaded with different parameters");
        obj1.Add(5, 6);
        obj1.Add(5, 6, 7);
        obj1.Add(5.2, 3.4);

        System.out.println("Calling a function which is overridden in the derived class");
        obj2.Add(5, 6);
    }
}
