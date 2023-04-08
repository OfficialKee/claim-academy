public class Car {

    // properties or instance variables
    public String make;
    public String model;
    public String color;
    public int year;
    public double speed;
    public boolean isRunning;

    // constructor
    public Car(String make, String model, String color, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.isRunning = false;
    }
    // Methods..Functions...behaviors

    // method to increase the classes speed

    public void start() {
        if (isRunning) {
            isRunning = true;
            System.out.println("The " + color + " " + make + " " + model + " has started");
        } else {
            isRunning = false;
            System.out.println("The " + color + " " + make + " " + model + " is already stopped");
        }
    }

    public void stop() {
        if (isRunning) {
            isRunning = false;
            System.out.println("The " + color + " " + make + " " + model + " has stopped");
        } else {
            System.out.println("The " + color + " " + make + " " + model + " is already stopped");
        }
    }

    public void accelerate(double incAmt) {
        this.speed += incAmt;

    }

    public void brake(double decAmt) {
        this.speed -= decAmt;

    }

    public static void main(String[] args) {

    }

}
