package com.lessons.dvd.lesson15;

import static com.lessons.dvd.lesson15.Archer.*;

public class TrainingGround {

    public static void main(String[] args) {
        Hero warrior = new Warrior("Boromir", 15);
        Hero mage = new Mage("Gendolf", 20);
        Hero archer = new Archer("Legolas", 10);

        //Archer.Wolf wolf = new Archer.Wolf("Second Wolf", 11);

        Enemy enemy = new Enemy("Zombi", 100);



        attackEnemy(enemy, warrior, mage, archer);
    }
    public static void attackEnemy(Enemy enemy, Hero...heroes){
        while (enemy.isAlive()){
            for (Hero hero : heroes) {
                if(enemy.isAlive()){
                    hero.attackEnemy(enemy);
                }
            }
        }
    }
}
