package com.lessons.level1.lesson2.lesson6.tasks;

public class Task4 {
    public static void main(String[] args) {
        int value = 23;
        boolean result = isSimple(value);
        System.out.println(result);
    }
    public static boolean isSimple(int value) {
        for (int i = 2; i < value; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }
}
