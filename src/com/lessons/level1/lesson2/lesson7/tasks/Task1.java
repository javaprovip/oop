package com.lessons.level1.lesson2.lesson7.tasks;

public class Task1 {
    public static void main(String[] args) {
        int[] values = {1,2,3,5,7};
        printArray(values);
        printArrayForeach(values);
        printArrayReverse(values);
    }

    public static void printArrayReverse(int[] values){
        for (int i = values.length -1; i >= 0; i--) {
            System.out.print(values[i] + " ");
        }
        System.out.println();
    }
    public static void printArray(int[] values){
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }
        System.out.println();
    }
    public static void printArrayForeach(int[] values){
        for (int value : values) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
