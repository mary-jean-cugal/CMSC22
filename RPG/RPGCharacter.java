/*
 * Created by Desabille, Cugal and Arsolon
 */
public abstract class RPGCharacter {

    private String name;
    private int hp;
    private int mp;

    public RPGCharacter(String name, int hp) {
        this.name = name;
        this.hp = hp;
        this.mp = 20;
    }

    // implement in subclass
    public abstract int attack();

    // checks to see if character is still alive
    public boolean isAlive() {
        return hp >= 0 ? true : false;
    }

    // may be overriden in subclass, damage is dependent on hero type
    public int takeDamage(int damage) {
        hp -= damage;
        if(hp<0)
            hp = 0;
        return hp;
    }

    // getters setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }
    public int getMp() {
        return mp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }


    @Override
    public String toString() {
        return "RPGCharacter{" +
                "name='" + name + '\'' +
                ", hp=" + hp + '\'' + ", manna=" + mp +
                '}';
    }
}