package com.lessons.level1.lesson2.lesson4;

public class SwitchExample {
    public static void main(String[] args) {
        int value = 1;
        char charValue = switch (value) {
            case 1 -> '1';
            case 2, 3, 4 -> '2';
            default -> '0';
        };





        switch (value) {
            case 1 -> System.out.println("value 1");
            case 2 -> System.out.println("value 2");
            case 10 -> System.out.println("value 10");
            default -> System.out.println("no this value");
        }
    }
}
