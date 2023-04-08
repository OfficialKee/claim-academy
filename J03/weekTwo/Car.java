public class Car {

    // properties for instance variables
    private String make;
    private String model;
    private int year;
    private double speed;
   
    //constructor
    public Car(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }
 // Methods..Functions...behaviors

 //method to increase the classes speed
    public void accelerate(double incAmt){
        this.speed += incAmt;

    }

    public void brake(double decAmt){
        this.speed -= decAmt;

    }
    
    public static void main(String[] args) {
    
    
        

        

           

    }


}
