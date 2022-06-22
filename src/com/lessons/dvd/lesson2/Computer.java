package com.lessons.dvd.lesson2;

public class Computer {
    int ssd = 500;
    int ram = 1024;

    Computer(){
        System.out.println("created");
    }

    Computer(int newSsd){
        ssd = newSsd;
        ram = 9000;

    }

    Computer(int newSsd, int newRam){
        ssd = newSsd;
        ram = newRam;

    }

    void load(){
        System.out.println("it loads");
    }
    void printState(){
        System.out.println("SSD" + ssd);
        System.out.println("Ram" + ram);
    }

}
