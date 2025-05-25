package assignments_java2;

public class Engine1 {
    int capacity;
    int horsepower;

    // Constructor
    public Engine1(int capacity, int horsepower) {
        super();
        this.capacity = capacity;
        this.horsepower = horsepower;
    }

    public void showDetails() {
        System.out.println("Capacity: " + capacity + "\tHorsepower: " + horsepower);
    }
}
