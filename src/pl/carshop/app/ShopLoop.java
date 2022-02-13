package pl.carshop.app;

import pl.carshop.io.DataReader;
import pl.carshop.model.Car;
import pl.carshop.model.Shop;

public class ShopLoop {
    private final static int EXIT_PROGRAM = 0;
    private final static int ADD_CAR = 1;
    private final static int PRINT_CAR = 2;
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
                case EXIT_PROGRAM:
                    exit();
                    break;
                case ADD_CAR:
                    addCar();
                    break;
                case PRINT_CAR:
                    printShop();
                    break;
                default:
                    System.out.println("No option choose");
            }



        }while (number != EXIT_PROGRAM );
    }

    private void printOptions(){
        System.out.println("Choos option: ");
        System.out.println(EXIT_PROGRAM + " - exit program");
        System.out.println(ADD_CAR + " - add car");
        System.out.println(PRINT_CAR + " - print cars");
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
