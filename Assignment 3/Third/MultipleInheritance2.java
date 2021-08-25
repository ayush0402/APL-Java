/*
Scenario : Creating two interfaces:
            1. Interface for a Driver of a Vehicle
            2. Interface for the Vehicle

      Consisting of properties and Method declarations of Driver and Vehicle respectively.

      Here, Second interface extends First interface.
      Followed by Second interface implemented to the MultipleInheritance2 Class.

 */
interface Driver2 {
    int age = 24;
    String gender = "Male";

    void sitInVehicle();

    void fastenSeatBelts();

}

interface Vehicle2 extends Driver2 {
    String color = "Red";
    int fuelCapacity = 100;

    void driveVehicle();

    void stopVehicle();
}

public class MultipleInheritance2 implements Vehicle2 {

    public static void main(String[] args) {
        System.out.print("Age of the Driver : ");
        System.out.println(age);

        System.out.print("Age of the gender : ");
        System.out.println(gender);

        System.out.print("Color of the Car : ");
        System.out.println(color);

        System.out.print("Fuel Capacity of the Vehicle : ");
        System.out.println(fuelCapacity);

        MultipleInheritance2 obj = new MultipleInheritance2();

        obj.sitInVehicle();
        obj.fastenSeatBelts();
        obj.driveVehicle();
        obj.stopVehicle();
    }

    @Override
    public void sitInVehicle() {
        System.out.println("Driver sits inside the Vehicle");
    }

    @Override
    public void fastenSeatBelts() {
        System.out.println("Driver fastens his seatbelts");
    }

    @Override
    public void driveVehicle() {
        System.out.println("Vehicle starts moving");
    }

    @Override
    public void stopVehicle() {
        System.out.println("Vehicle Stops");
    }
}
