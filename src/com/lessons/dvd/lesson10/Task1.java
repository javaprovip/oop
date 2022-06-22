package com.lessons.dvd.lesson10;

public class Task1 {
    public static void main(String[] args) {
        String value = "ffgfsgsf :( dsfsdsf :(dgdgdgd :) fdfdf :(fdfdf :( ffdfdf";
        String replace = replace(value);
        System.out.println(replace);
    }
    public static String replace(String value){
        return value.replace(":(", ":)");



    }
}
