/*
 * Created by Desabille, Cugal and Arsolon
 */
import java.util.Random;

public class Fighter extends Hero {

    private int attackDamage;   
    private int money;
    private Random rand;

    public Fighter(String name, int attackDamage ,int energy) {

        super(name, 100, energy);                // a swordman's hp by default is 100
        this.rand = new Random();
        this.attackDamage = attackDamage;       //base damage depends on weapon
        money = 0;
        
    }

    public int attack() {
         //damage of attack may be affected by energy
        return attackDamage + rand.nextInt(super.getEnergy());    //energy is being randomized from 0 to specified energy                                                
    }

    public int takeDamage(int damage) {
        return super.takeDamage(damage);
    }

    public int getMoney(){
        return money;
    }
    public void setMoney(int money){
        this.money = money;
    }
    //1\3 probability 
    public boolean findMoney(){
        return rand.nextInt(2) == 1 ? true:false;
    }

    public String toString() {
        return super.toString() + " money == " + money;
    }
}