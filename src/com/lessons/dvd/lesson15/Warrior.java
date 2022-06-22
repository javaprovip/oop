package com.lessons.dvd.lesson15;

import com.lessons.dvd.lesson18.weapon.MeleeWeapon;

public class Warrior<T extends MeleeWeapon> extends Hero<T> {
    public Warrior(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " ups sword to " + enemy.getName());
        enemy.takeDamage(getDamage());
    }
}
