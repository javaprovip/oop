package com.lessons.level1.lesson2.lesson7;

public class ArrayExample {
    public static void main(String[] args) {
        int[] values = new int[10];
        //System.out.println(values[5]);
        values[8] = 12;
        values[6] = 98;



        for (int i = 0; i < values.length; i++) {
            System.out.println(i + ":" + values[i]);
            
        }


//        int value = 5;
//        int[] values = {1,2,3,4,5};
//        System.out.println(values[3]);
//
//
//        values[3] = 19;
//        System.out.println(values[3]);
    }
}
