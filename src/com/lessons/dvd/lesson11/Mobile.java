package com.lessons.dvd.lesson11;

public class Mobile extends Computer{


    public Mobile(Ssd sdd, Ram ram) {
        super(sdd, ram);
    }

    @Override
    public void load() {
        System.out.println("switched");


    }
}

