package pl.carshop.app;

import pl.carshop.model.Car;

public class Shop {
    public static void main(String[] args) {
        final String appName = "Car dealer v0.5";

        Car car1 = new Car("Mazda","626",2004,1600,5,"yellow");
        Car car2 = new Car("Kia","Rio",2016,1300,5,"gray");


        System.out.println(appName);
        System.out.println("Available Cars:");
        System.out.println(car1);
        System.out.println(car2);

    }
}
