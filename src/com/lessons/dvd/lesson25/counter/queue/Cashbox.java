package com.lessons.dvd.lesson25.counter.queue;

public class Cashbox {
    private static int generator = 1;
    private int id;

    public Cashbox() {
        this.id = generator++;
    }

    @Override
    public String toString() {
        return "Cashbox{" +
                "id=" + id +
                '}';
    }
}
