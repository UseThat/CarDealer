package pl.carshop.model;

import pl.carshop.io.DataReader;

public class Shop {
    private final static int MAX_CAR = 100;
    private Car[] cars = new Car[MAX_CAR];
    private int carCounter;

    public void addCar(Car car) {
        if (carCounter < MAX_CAR) {
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
            for (int i = 0; i<carCounter;i++) {
                System.out.println(cars[i]);
            }
        }
    }

}
