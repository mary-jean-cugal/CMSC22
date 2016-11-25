/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern;

/**
 *
 * @author Mary Jean Cugal
 */
public abstract class Character {
    WeaponBehavior weapon;
    public abstract void fight();
    public void setWeapon(WeaponBehavior w){
        this.weapon = w;
    }
}
