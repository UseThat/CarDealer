package pl.carshop.model;

public class Car {
    private String brand;
    private String model;
    private int productionYear;
    private int engine;
    private int doorsCount;
    private String color;

    public Car(String brand, String model, int productionYear, int engine, int doorsCount, String color){
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.engine = engine;
        this.doorsCount = doorsCount;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public int getDoorsCount() {
        return doorsCount;
    }

    public void setDoorsCount(int doorsCount) {
        this.doorsCount = doorsCount;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", productionYear=" + productionYear +
                ", engine=" + engine +
                ", doorsCount=" + doorsCount +
                ", color='" + color ;
    }
}
