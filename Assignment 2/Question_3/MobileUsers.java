class Mobile {
    private int cost;
    private int camera;

    public String username;

    public Mobile(int a, int b, String c) {
        cost = a;
        camera = b;
        username = c;
    }

    public void getDetails() {
        System.out.println("Cost : "+cost);
        System.out.println("Camera : "+camera);
        System.out.println("Username : "+username);

    }
}

public class MobileUsers {
    public static void main(String[] args) {

        Mobile m1 = new Mobile(25000,20,"Ayush");
        Mobile m2 = new Mobile(15000,12,"Rahul");
        Mobile m3 = new Mobile(20000,18,"Aryan");

        System.out.println("=============================");
        System.out.println("Details of first Mobile : ");
        m1.getDetails();
        System.out.println("=============================");
        System.out.println("Details of second Mobile : ");
        m2.getDetails();
        System.out.println("=============================");
        System.out.println("Details of third Mobile : ");
        m3.getDetails();

    }
}
