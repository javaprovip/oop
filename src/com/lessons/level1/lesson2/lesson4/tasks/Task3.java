package com.lessons.level1.lesson2.lesson4.tasks;

public class Task3 {
    public static void main(String[] args) {
        int ruble = 112;
        if((ruble % 10 == 1) && (ruble % 100 != 11)){
            System.out.println(ruble + " rubl");
        } else if ((ruble % 10 == 2 || ruble % 10 == 3 || ruble % 10 == 4)
        && !(ruble % 100 == 12 || ruble % 100 == 13 || ruble % 100 == 14)) {
            System.out.println(ruble + " rublya");
        }else {
            System.out.println(ruble + " rublay");
        }
    }
}
