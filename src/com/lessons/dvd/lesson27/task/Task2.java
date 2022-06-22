package com.lessons.dvd.lesson27.task;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        String regex = "0[Xx][0-9a-fA-F]+";
        String input = "dfgfgfs 0Xff fmgkgmrkgmk 0x12 ffgfsg 0XAB fgsg OTaC";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()){
            System.out.println(matcher.group());
        }


    }
}
