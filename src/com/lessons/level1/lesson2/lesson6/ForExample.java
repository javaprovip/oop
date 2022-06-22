package com.lessons.level1.lesson2.lesson6;

public class ForExample {
    public static void main(String[] args) {
        for (int value = 10; value > 0; value--) {


            if(value == 5){
                continue;
//               break;
            }
            System.out.println(value);
        }
    }
}
