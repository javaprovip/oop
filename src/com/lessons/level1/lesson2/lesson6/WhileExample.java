package com.lessons.level1.lesson2.lesson6;

public class WhileExample {
    public static void main(String[] args) {
        int value = 0;
        do{
            System.out.println(value);
            value++;
        }while (value < 10);
        //whileExample();
    }

    private static void whileExample() {
        int value = 10;
        while (value > 0) {
            System.out.println(value);
            value--;
        }
    }
}
