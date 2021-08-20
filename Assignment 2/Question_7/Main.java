public class Main {
    public static void main(String[] args) {
        System.out.println("Using MethodOverloading Class");

        System.out.println("2 + 3 = " + MethodOverloading.add(2,3));
        System.out.println("2 + 3 + 4 = " + MethodOverloading.add(2,3,4));
        System.out.println("2.2 + 3.4 = " + MethodOverloading.add(2.2,3.4));
        System.out.println("2.2 + 3.4 + 4.5 = " + MethodOverloading.add(2.2,3.4,4.5));

        System.out.println("======================================================");

        System.out.println("Using ConstructorOverloading Class");

        ConstructorOverloading obj1 = new ConstructorOverloading(2,3);
        ConstructorOverloading obj2 = new ConstructorOverloading(2,3,4);
        ConstructorOverloading obj3 = new ConstructorOverloading(2.2,3.4);
        ConstructorOverloading obj4 = new ConstructorOverloading(2.2,3.4,4.5);

        System.out.print("2 + 3 = ");
        obj1.display1();
        System.out.print("2 + 3 + 4 = ");
        obj2.display1();
        System.out.print("2.2 + 3.4 = ");
        obj3.display();
        System.out.print("2.2 + 3.4 + 4.5 = ");
        obj4.display();

    }
}
