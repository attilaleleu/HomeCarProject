package car.main.menu;

public class CarSpecs {

    private String model;
    private double engine;
    private String type;
    private int doors;
    private int speed;

    public CarSpecs(String model, int doors, String type, double engine, int speed) {
        this.model = model;
        this.doors = doors;
        this.type = type;
        this.engine = engine;
        this.speed = speed;
    }

    void printCar() {
        System.out.println("The " + model + " is a " + doors + " door " + type + " with a " + engine +
                " litre engine and a max speed of " + speed + " km/h.");
    }
}
