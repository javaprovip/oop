package com.lessons.level1.lesson2.lesson5;

public class Task1 {
    public static void main(String[] args) {
        int value1 = 5;
        int value2 = 10;
        int result = getMax(value1, value2);
        System.out.println(result);
    }


    public static int getMax(int firstValue, int secondValue){
        if(firstValue>secondValue){
            return firstValue;
        }else{
            return secondValue;
        }
    }
}
