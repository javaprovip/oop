package com.lessons.dvd.lesson18;

import com.lessons.dvd.lesson15.Archer;
import com.lessons.dvd.lesson15.Hero;
import com.lessons.dvd.lesson15.Warrior;
import com.lessons.dvd.lesson18.weapon.*;

public class WeaponRunner {
    public static void main(String[] args) {
        Archer<Bow> archer = new Archer<>("Lagolas", 15);
        archer.setWeapon(new Bow());

        Warrior<SwordWeapon> warrior = new Warrior<>("Boromir", 10);
        warrior.setWeapon(new SwordWeapon());

        printWeaponDamage(archer);
    }
    public static  void printWeaponDamage(Hero<? extends Weapon> hero){
        System.out.println(hero.getWeapon().getDamage());


    }
}
