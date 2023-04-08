
import javax.swing.text.html.FormSubmitEvent;



public class Main {
    public static void main(String[] args) {
            Car mustang = new Car("ford", "mustang", "blue", 2023);


            System.out.println(mustang.make);

            mustang.start();

            mustang.accelerate(20);

            System.out.println("The mustang is going "+mustang.speed+" mph");

            mustang.brake(5);

            System.out.println("The mustang is now going "+mustang.speed+" mph");

    
    }
}
