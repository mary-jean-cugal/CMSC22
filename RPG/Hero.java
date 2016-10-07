/*
 * Created by Desabille, Cugal and Arsolon
 */
public abstract class Hero extends RPGCharacter {
    private int energy;
    public boolean hasPet;

    public Hero(String name, int hp, int energy) {
        super(name, hp);
        this.energy = energy;
        hasPet = false ;
    }


    // getters and setters
    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

}