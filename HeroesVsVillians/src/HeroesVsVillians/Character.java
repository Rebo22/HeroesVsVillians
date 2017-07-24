/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HeroesVsVillians;

/**
 *
 * @author rebo
 */
public abstract class Character {
    WeaponBehavior weaponBehavior;
    
    public Character(){}
    
    public abstract void display();
    
    public void fight(){
        weaponBehavior.useWeapon();
    }
    
    public void setWeapon(WeaponBehavior w){
        this.weaponBehavior = w;
    }
    
}
