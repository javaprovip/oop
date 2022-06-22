package com.lessons.dvd.lesson9;

import com.lessons.dvd.lesson7.Computer;

public class StaticRunner {
    public static void main(String[] args) {
        new Computer(null, null);
        new Computer(null, null);
        new Computer(null, null);
        new Computer(null, null);
        Computer computer = new Computer(null, null);

        System.out.println(Computer.getCounter());

        Class<? extends Computer> computerClass = computer.getClass();


    }
}
