public class Pokemon {
    public String name;
    public String color;
    public String type;
    public int health;
    public double attack;
    public double defense;

    public Pokemon(String name,String type, String color, int health){
        this.name =name;
        this.type = type;
        this.color = color;
        this.health = health;
        this.attack = (Math.random()*50);
        this.defense = (Math.random()*100);

    }

    public void iChooseYou(){
        System.out.println("Pokemon "+ name + " has entered the arena!");
    }

    public void healthPotion(){
        this.health += 15;
        System.out.println("Your health is now "+ health);
    }


}
