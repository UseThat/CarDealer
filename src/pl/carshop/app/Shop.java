package pl.carshop.app;

import pl.carshop.io.DataReader;
import pl.carshop.model.Car;

public class Shop {
    public static void main(String[] args) {
        final String appName = "Car dealer v0.7";

        Car [] car = new Car[100];
        DataReader dataReader = new DataReader();

        car[0] = dataReader.readAndCreateCar();
        car[1] = dataReader.readAndCreateCar();

        dataReader.close();


        System.out.println(appName);
        System.out.println("Available Cars:");
        System.out.println(car[0]);
        System.out.println(car[1]);

    }
}
