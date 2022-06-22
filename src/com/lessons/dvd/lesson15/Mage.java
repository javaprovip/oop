package com.lessons.dvd.lesson15;

import com.lessons.dvd.lesson18.weapon.MagicWeapon;

public class Mage<T extends MagicWeapon> extends Hero<T> {
    public Mage(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " makes magic to " + enemy.getName());
        enemy.takeDamage(getDamage());
    }
}
