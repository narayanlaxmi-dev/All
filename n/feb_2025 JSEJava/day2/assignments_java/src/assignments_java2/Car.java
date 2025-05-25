package assignments_java2;

public class Car {
    private int price;
    private String model;
    Engine1 eobj; // The engine object should be initialized
    protected boolean isRunning = false;

    // Constructor
    public Car(int price, String model, Engine1 engine) {
        super();
        this.price = price;
        this.model = model;
        this.eobj = engine;
    }

    // Show details method
    public void showDetails() {
        System.out.println("Model: " + model + "\tPrice: " + price);
        System.out.println("Is it running: " + isRunning);
        if (eobj != null) {  // check if eobj is properly initialized
            eobj.showDetails();
        }
    }

    public void start() {
        if (isRunning) {
            System.out.println("Car is already started....");
        } else {
            System.out.println("Car is started....");
            isRunning = true;
        }
    }

    public void stop() {
        if (isRunning) {
            System.out.println("Car is stopped....");
            isRunning = false;
        } else {
            System.out.println("Car is already stopped....");
        }
    }
}
