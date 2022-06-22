package com.lessons.level1.lesson2.lesson7.tasks;

public class Task3 {
    public static void main(String[] args) {
        int[][] values = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 9, 10},
        };
        int[][] values1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 9},
        };
        boolean result = equals(values,values1);
        System.out.println(result);
    }

    public static boolean equals(int[][] values, int[][] values1) {
        if (values.length != values1.length) {
            return false;
        }
        for (int i = 0; i < values.length; i++) {
            int[] row1 = values[i];
            int[] row2 = values1[i];
            if (row1.length != row2.length) {
                return false;
            }
            for (int j = 0; j < row1.length; j++) {
                if (row1[j] != row2[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
