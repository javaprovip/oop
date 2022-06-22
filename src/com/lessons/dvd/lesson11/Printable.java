package com.lessons.dvd.lesson11;

import java.util.Random;

public interface Printable {
    String SOME_VALUE = "Example";
    Random RANDOM = new Random();

    default void printWithRandom(){
        //Random random = new Random();
        System.out.println(generateRandom());
        print();
    }

    void print();

    private int generateRandom(){
        return RANDOM.nextInt();
    }
}
