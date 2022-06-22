package com.lessons.dvd.lesson11;

public class Laptop extends Computer {

    private int weight;

    public Laptop(Ssd sdd, Ram ram, int weight) {
        super(sdd, ram);
        this.weight = weight;

    }

    @Override
    public void load(){
        open();
        System.out.println("loaded");
    }
    @Override
    public void print(){
        super.print();
        System.out.println("weight" + weight);

    }
    public void open(){
        System.out.println("opened cover");
    }

    public int getWeight() {
        return weight;
    }
}
