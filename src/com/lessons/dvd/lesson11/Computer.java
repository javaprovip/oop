package com.lessons.dvd.lesson11;



public abstract class Computer implements Printable {
    private Ssd sdd;
    private Ram ram;

    public Computer(Ssd sdd, Ram ram) {
        this.sdd = sdd;
        this.ram = ram;
    }
    public abstract void load();

    @Override
    public void print(){
        System.out.println("Ssd " + sdd.getValue() + "ram " + ram.getValue());
    }

    public Ssd getSdd() {
        return sdd;
    }

    public void setSdd(Ssd sdd) {
        this.sdd = sdd;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }
}
