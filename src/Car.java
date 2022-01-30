public class Car {
    String brand;
    String model;
    int productionYear;
    int engine;
    int doorsCount;
    String color;

    Car(String brand, String model, int productionYear, int engine, int doorsCount, String color){
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.engine = engine;
        this.doorsCount = doorsCount;
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
