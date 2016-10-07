import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class RPG {

    private Random rand;

    // constructor
    public RPG() {
        this.rand = new Random();
    }


    // inclusive random integer
    public int randInt(int min, int max) {
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }

    public Swordsman generateHero(){
        System.out.println("ENTER CHARACTER NAME: ");
        Scanner sn = new Scanner(System.in);
        String name = sn.nextLine();
        //randomize swordman type and weapon
        int[] weaponDamage = {10,15,20,30,45};
        int[] energy = {5,10,20,30,45};
        Swordsman hero = new Swordsman(name,weaponDamage[randInt(0,4)],energy[randInt(0,4)]);
        return hero;
    }

    public RPGCharacter generateMonster(){
        RPGCharacter[] monsters = new RPGCharacter[5];
        monsters[0] = new Monster("lamok" , 50 , 5);
        monsters[1] = new Monster("flying ok-ok" , 75 , 10);
        monsters[2] = new Monster("olah hipan" , 80 , 30);
        monsters[3] = new Monster("meany mouse!" , 50 , 50);
        monsters[4] = new Monster("sawa" , 100 , 60);
        List<RPGCharacter> mons = Arrays.asList(monsters);
        //randomize monster
        return mons.get(randInt(0,4));
    }

    public Pet generatePet(Swordsman hero){
        Pet pet;
        Scanner sc = new Scanner(System.in);
        System.out.println("1::CAT costs 200 \n2::DOG costs 100");
        if(sc.nextInt()==1&&hero.getMoney()>=200){
                pet = new Pet("CAT", 100,5);
                hero.setMoney(hero.getMoney()-200);
                hero.hasPet = true;
        }else{
                pet = new Pet("DOG",75,10);
                hero.setMoney(hero.getMoney()-100);
                hero.hasPet = true;
        }
        return pet;
    }

    public void heal(RPGCharacter character){
        character.setMp(character.getMp()-20);
        character.setHp(character.getHp()+20);

        if(character.getHp()>100)
            character.setHp(100);
        System.out.println(character.getName() + " is healing...");
    }

    // dodge 1/4 probability
    public boolean dodge() {
        return randInt(0, 3) == 3 ? true : false;
    }


    // pause the game for awhile for dramatic effect!
    public void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    // duel two characters, one as attacker, one as defender
    // returns true if someone is killed
    public boolean duel(RPGCharacter attacker, RPGCharacter defender) {
        int damage = attacker.attack();
        System.out.println("\n--> " + attacker.getName() + " ATK " + defender.getName() + "  with damage = " +damage + "\n");
        sleep(2000);
        if (!dodge()) {
            int remHp = defender.takeDamage(damage);
            if (remHp <= 0) {
                System.out.printf("--> %s KILLED %s!\n\n", attacker.getName(), defender.getName());
                return true;
            }
        } else {
            System.out.println("--> MISSED!");
        }
        return false;
    }


    // game...
    public static void main(String[] args) {

        RPG rpg = new RPG();
        System.out.println("\nIt's SUMMER!!! You are living in an isolated area in the middle of the forest where a lot of exotic animals can be seen. You just got out of bed when your mother told you that she won't be home for a while. Now, you are in charge of keeping the house safe from the evil forces of nature! It's your chance to save the WORLLDDD!!! ay di diay,, your HOUUSEEE!!!!\n\n");

        Swordsman hero = rpg.generateHero();
        RPGCharacter monster = rpg.generateMonster();

        System.out.println("\n============= GAME START =============\n");
        System.out.printf("%s\n%s\n", hero, monster);

        // fight! hero will always attack first.
        int count = 0;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("== round " + ++count);

            // hero's turn
            if(hero.getMp()==20){
                System.out.println("1-attack / 2-heal? ");
                
                if(sc.nextInt()==1){
                    boolean monsterIsDead = rpg.duel(hero, monster);
                    if (monsterIsDead) break;
                    if(hero.getMp()<20)
                        hero.setMp(hero.getMp()+5);
                }else{
                    rpg.heal(hero);
                }
            }else{
                boolean monsterIsDead = rpg.duel(hero, monster);
                if (monsterIsDead) break;
                if(hero.getMp()<20)
                        hero.setMp(hero.getMp()+5);
            }

            //choice to generate pet when hero has money
            if(hero.getMoney()>=100){
                System.out.println("YOU HAVE MONEY!! BUY A PET? 1- yes , 0- no");
                if(sc.nextInt() == 1){
                    Pet pet = rpg.generatePet(hero);
                    if(hero.hasPet){
                        if(pet.getEnergy()>0){
                            int speed = pet.attack();
                            if(pet.caughtMonster()){
                                System.out.println(pet.getName() + " caught Monster!!!");
                                rpg.duel(hero,monster);
                            }
                            pet.setEnergy(pet.getEnergy()-50);
                        }
                    }
               
                }
            }
            if(hero.findMoney()){
                hero.setMoney(hero.getMoney()+50);
            }
            
            
            // monster's turn
            if(monster.getMp()==20&&count!=1){
                //1\4 probability to heal
                if(rpg.randInt(0,3) == 3 ? true:false)
                    rpg.heal(monster);
            }else{
                monster.setMp(monster.getMp()+5);
            }
            boolean heroIsDead = rpg.duel(monster, hero);
            if (heroIsDead) break;

            System.out.printf("%s\n%s\n", hero, monster);
        }

        System.out.printf("%s\n%s\n", hero, monster);
    }
}