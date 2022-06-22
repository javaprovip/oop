package com.lessons.level1.lesson2.lesson7;

public class ArrayExample2 {
    public static void main(String[] args) {
        int[][] values = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int i = 0; i < values.length; i++) {
            int[] ints = values[i];
            for (int j = 0; j < ints.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}
