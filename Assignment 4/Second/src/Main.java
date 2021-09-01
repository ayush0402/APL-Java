import Car.CarClass;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String manufacturer, model;
        int seats;

        System.out.println("Enter the name of the Manufacturer : ");
        manufacturer = sc.next();
        System.out.println("Enter the model name : ");
        model = sc.next();
        System.out.println("Input the number of seats : ");
        seats = sc.nextInt();

        CarClass newCar = new CarClass(manufacturer, model, seats);

        System.out.println("=============================================");

        newCar.display();
        newCar.refuel();
        newCar.drive();
        newCar.brakes();
    }
}
