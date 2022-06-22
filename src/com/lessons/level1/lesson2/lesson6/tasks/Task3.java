package com.lessons.level1.lesson2.lesson6.tasks;

public class Task3 {
    public static void main(String[] args) {
        double sum =24;
        double result = sum(sum);
    }
    public static double sum(double sourceSum){
        double result = sourceSum;
        for (int year = 1626 + 1;  year<=2020 ; year++) {
            double percent = result * 0.05;
            result +=percent;
            System.out.println(year + " : " + result);
            
        }
        return result;
    }
}
