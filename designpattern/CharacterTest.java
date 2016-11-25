
package designpattern;

/**
 *
 * @author Mary Jean Cugal
 */
public class CharacterTest {
    public static void main(String[] args){
        WeaponBehavior weapon;
        weapon = new AxeBehavior();
        Character ch;
        /*Character Queen*/
        ch = new Queen();
        ch.setWeapon(weapon);
        ch.fight();//should print thwacckkk thud
        weapon = new KnifeBehavior();
        ch.setWeapon(weapon);
        ch.fight();
        weapon = new BowAndArrowBehavior();
        ch.setWeapon(weapon);
        ch.fight();
        weapon = new AxeBehavior();
        ch.setWeapon(weapon);
        ch.fight();
        /*Character King*/
        ch = new King();
        weapon = new SwordBehavior();
        ch.setWeapon(weapon);
        ch.fight();//should print thwacckkk thud
        weapon = new KnifeBehavior();
        ch.setWeapon(weapon);
        ch.fight();
        weapon = new BowAndArrowBehavior();
        ch.setWeapon(weapon);
        ch.fight();
        weapon = new AxeBehavior();
        ch.setWeapon(weapon);
        ch.fight();
        /*Character Knight*/
        ch = new Knight();
        weapon = new SwordBehavior();
        ch.setWeapon(weapon);
        ch.fight();//should print thwacckkk thud
        weapon = new KnifeBehavior();
        ch.setWeapon(weapon);
        ch.fight();
        weapon = new BowAndArrowBehavior();
        ch.setWeapon(weapon);
        ch.fight();
        weapon = new AxeBehavior();
        ch.setWeapon(weapon);
        ch.fight();
        /*Character Troll*/
        ch = new Troll(); 
        weapon = new SwordBehavior();
        ch.setWeapon(weapon);
        ch.fight();//should print thwacckkk thud
        weapon = new KnifeBehavior();
        ch.setWeapon(weapon);
        ch.fight();
        weapon = new BowAndArrowBehavior();
        ch.setWeapon(weapon);
        ch.fight();
        weapon = new AxeBehavior();
        ch.setWeapon(weapon);
        ch.fight();
       
    }
    
}
