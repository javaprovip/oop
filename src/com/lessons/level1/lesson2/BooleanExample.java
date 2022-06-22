package com.lessons.level1.lesson2;

public class BooleanExample {
    public static void main(String[] args) {
        int value1 = -10;
        int value2 = 0;

        boolean test = (value1 < 0);
        boolean test2 = (value2 != 0);
        System.out.println(test && test2);
    }
}
