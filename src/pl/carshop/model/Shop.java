package pl.carshop.model;

import pl.carshop.io.DataReader;

public class Shop {
    private final int maxCar = 100;
    private Car[] cars = new Car[maxCar];
    private int carCounter;

    public void addCar(Car car) {
        if (carCounter < maxCar) {
            cars[carCounter] = car;
            carCounter++;
        }else{
            System.out.println("Maximum car on parking. ");
        }
    }

    public void printCar(){
        if(carCounter == 0){
            System.out.println("No car on parking!");
        }else{
            for (Car car : cars) {
                System.out.println(car);
            }
        }
    }

}
