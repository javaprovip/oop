package com.lessons.level1.lesson2.lesson4.tasks;

public class Task4 {
    public static void main(String[] args) {
        int value = 1992;
        isLeapYear(value);
    }
    public static boolean isLeapYear(int year){
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
//        if (result) {
//            return true;
//        } else
//            return false;
    }
}
