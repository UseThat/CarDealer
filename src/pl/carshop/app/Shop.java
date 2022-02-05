package pl.carshop.app;

import pl.carshop.model.Car;

public class Shop {
    public static void main(String[] args) {
        final String appName = "Car dealer v0.7";

        Car [] car = new Car[100];

        car[0] = new Car("Mazda","626",2004,1600,5,"yellow");
        car[1] = new Car("Kia","Rio",2016,1300,5,"gray");


        System.out.println(appName);
        System.out.println("Available Cars:");
        System.out.println(car[0]);
        System.out.println(car[1]);

    }
}
