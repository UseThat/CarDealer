package pl.carshop.app;

import pl.carshop.io.DataReader;
import pl.carshop.model.Car;
import pl.carshop.model.Shop;

public class ShopLoop {
    private final int exitProgram = 0;
    private final int addCar = 1;
    private final int printCar = 2;
    // turn on data reader class;
    private DataReader dataReader = new DataReader();
    //create main object
    private Shop shop = new Shop();

    public void controlLoop(){
        int number;

        do{
            printOptions();
            number = dataReader.getInt();
            switch (number){
                case exitProgram:
                    exit();
                    break;
                case addCar:
                    addCar();
                    break;
                case printCar:
                    printShop();
                    break;
                default:
                    System.out.println("No option choose");
            }



        }while (number != exitProgram );
    }

    private void printOptions(){
        System.out.println("Choos option: ");
        System.out.println(exitProgram + " - exit program");
        System.out.println(addCar + " - add car");
        System.out.println(printCar + " - print cars");
    }

    private void addCar(){
        Car car = dataReader.readAndCreateCar();
        shop.addCar(car);
    }

    private void printShop(){
        shop.printCar();
    }

    private void exit(){
        System.out.println("End of program!");
        dataReader.close();
    }

}
