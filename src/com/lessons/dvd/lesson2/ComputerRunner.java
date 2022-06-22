package com.lessons.dvd.lesson2;

public class ComputerRunner {
    public static void main(String[] args) {
        Computer computer = new Computer();

        computer.printState();
        Computer computer1 = new Computer(1050);
        computer1.printState();

        Computer computer2 = new Computer(1000, 1000);
        computer2.printState();


//        computer.load();
//        System.out.println("Ram :" + computer.ram);
//        System.out.println("SSD : " + computer.ssd);
    }
}
