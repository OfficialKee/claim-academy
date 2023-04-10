
import javax.swing.text.html.FormSubmitEvent;



public class Main {
    public static void main(String[] args) {
            Car mustang = new Car("ford", "mustang", "blue", 2023 ,180);


            System.out.println(mustang.make);

            mustang.start();

            mustang.accelerate(20);

            System.out.println("The mustang is going "+mustang.speed+" mph");

            mustang.brake(5);

            System.out.println("The mustang is now going "+mustang.speed+" mph");

            mustang.stop();

            Pokemon pikachu = new Pokemon("pikachu", "electric", "yellow", 100);

            pikachu.iChooseYou();
            pikachu.healthPotion();

            System.out.println(pikachu.attack);


            Car notMyCar = new Car("toyota", "corolla", "red", 1996, 100);

            System.out.println("Model of car "+notMyCar.model);
            System.out.println("Make of car "+notMyCar.make);
            System.out.println("Year of car " +notMyCar.year);
            System.out.println("Maxspeed of car "+notMyCar.maxSpeed);


            for (int i = 0; i < 20; i++) {
                notMyCar.speedUp();
                
            }
            for (int i = 0; i < 5; i++) {
                notMyCar.slowDown();
                
            }

    
    }
}
