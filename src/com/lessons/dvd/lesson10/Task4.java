package com.lessons.dvd.lesson10;

public class Task4 {
    public static void main(String[] args) {
        String value = "sdffgfgsfg.,!fggrgr,.....?sfgf!fgfgf";
        System.out.println(countSymbols(value));

    }
    public static int countSymbols(String value){
        String result = value.replace(".", "")
                .replace(",", "")
                .replace("!", "");
        return value.length() - result.length();


    }
}
