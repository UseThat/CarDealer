package pl.carshop.app;

public class ShopApp {
    public final static String APP_NAME = "Car dealer v0.9";
    public static void main(String[] args) {

        System.out.println(APP_NAME);

        ShopLoop shopLoop = new ShopLoop();
        shopLoop.controlLoop();
    }
}
