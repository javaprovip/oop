package com.lessons.dvd.lesson10;

public class Task6 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        StringBuilder value = new StringBuilder();
        for (int i = 0; i < 100_000; i++) {
            value.append(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time: " + (endTime - startTime));
    }
}
