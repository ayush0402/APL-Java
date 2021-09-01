import pkg.ABC;
import pkg.InterABC;
/*
Scenario of using multiple classes and an Interface to print data about
residence in an apartment with methods implemented to Lock and Unlock
the door.
 */
public class Main implements InterABC {
    /*
    Main class implements an Interface InterABC.
     */
    @Override
    public void interfaceFunction() {
        System.out.println("Field and function implemented through Interface : ");
        System.out.println("Name of Owner : " + name);
        System.out.println("Flat Number : " + flatNumber);
        System.out.println("Floor Number : " + floorNumber);
        System.out.println("Number of Rooms : " + numberOfRooms);
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.interfaceFunction();

        System.out.println("UnlockDoor function imported from ABC.java class : ");
        ABC.unlockDoor();
        /*
        lockDoor function is inherited by class ABC from class XYZ.
         */
        System.out.println("LockDoor function inherited by ABC.java Class from XYZ.java class.");
        ABC.lockDoor();

    }
}
