package pl.carshop.io;

import pl.carshop.model.Car;


import java.util.Scanner;

public class DataReader {
    private Scanner sc = new Scanner(System.in);

    public void close(){
        sc.close();
    }

    public int getInt(){
        int number = sc.nextInt();
        sc.nextLine();
        return number;
    }

    public Car readAndCreateCar(){
        System.out.println("Brand: ");
        String brand = sc.nextLine();
        System.out.println("Model:");
        String model = sc.nextLine();
        System.out.println("Production Year:");
        int productionYear = sc.nextInt();
        System.out.println("Engine:");
        int engine = getInt();
        System.out.println("Doors count:");
        int doorsCount = getInt();
        System.out.println("Color:");
        String color = sc.nextLine();

        return new Car(brand, model, productionYear,  engine,  doorsCount,  color);
    }

}
