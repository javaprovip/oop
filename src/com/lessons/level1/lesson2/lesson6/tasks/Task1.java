package com.lessons.level1.lesson2.lesson6.tasks;

public class Task1 {
    public static void main(String[] args) {
        int value = 6;
        int result = factorial(value);
        System.out.println(result);

        int result2 = factorialWhile(value);
        System.out.println(result2);

    }

    public static int factorialWhile(int value){
        int result = 1;
        int i =1;
        while (i <= value){
            result *=i;
            i++;
        }

        return result;
    }
    public static int factorial(int value){

        int result = 1;
        for (int i = 1; i <=value ; i++) {
            result *=i;

        }
        return result;
    }
}
