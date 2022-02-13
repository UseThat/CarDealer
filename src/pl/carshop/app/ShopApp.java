package pl.carshop.app;

public class ShopApp {
    public static void main(String[] args) {
        final String appName = "Car dealer v0.9";
        System.out.println(appName);

        ShopLoop shopLoop = new ShopLoop();
        shopLoop.controlLoop();
    }
}
