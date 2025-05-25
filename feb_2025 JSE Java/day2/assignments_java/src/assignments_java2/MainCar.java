package assignments_java2;

public class MainCar {

    public static void main(String[] args) {
        // Initialize Engine1 object
        Engine1 e = new Engine1(500, 5000);
        // Initialize Car object with Engine1
        Car c = new Car(2000, "Mustang", e);
      
        c.showDetails();
        c.start();
        c.showDetails();
        c.stop();
        c.showDetails();
    }
}
