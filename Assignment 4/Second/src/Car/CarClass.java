package Car;

import Vehicle.VehicleClass;

public class CarClass extends VehicleClass {

    String manufacturer;
    String name_model;
    int number_of_seats;

    public CarClass(String _manuf, String _model, int _seats) {
        this.manufacturer = _manuf;
        this.name_model = _model;
        this.number_of_seats = _seats;
    }

    public void display() {
        System.out.println("Manufacturer : " + manufacturer);
        System.out.println("Model Name : " + name_model);
        System.out.println("Number of Seats : " + number_of_seats);
    }

}