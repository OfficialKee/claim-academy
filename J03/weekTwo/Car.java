public class Car {

    // properties or instance variables
    public String make;
    public String model;
    public String color;
    public int year;
    public double speed;
    public double maxSpeed;
    public boolean isRunning;

    // constructor
    public Car(String make, String model, String color, int year , double maxSpeed) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.isRunning = false;
        this.maxSpeed = maxSpeed;
    }
    // Methods..Functions...behaviors

    // method to increase the classes speed

    public void start() {
        if (!isRunning) {
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

    public void speedUp(){
        if(this.speed<this.maxSpeed){
            this.speed +=1;
            System.out.println("Your speed is "+ this.speed);
        }
        else{
            System.out.println("You have reached your max speed!");
        }
        
    }
  
    public void slowDown(){
        if(this.speed<1){
            System.out.println("Your vehicle is already at a stop.");
        }
        else if(this.speed == 1){
            System.out.println("Your vehicle has came to a stop");
            this.speed -=1;
        }
        else{
            this.speed -=1;
            System.out.println("Your speed is "+ this.speed);
        }
        
    }



}
