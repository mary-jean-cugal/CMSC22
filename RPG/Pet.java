import java.util.Random;
public class Pet extends Hero {

    private int speed;

    public Pet(String name ,int energy , int speed) {
        super(name, 50 , 100);
        this.speed = speed;
    }

    public int attack() {
        Random rand = new Random();
        return rand.nextInt(speed);
    }

    public boolean caughtMonster(){
        return attack()==speed ? true:false;
       // return true;
    }
}