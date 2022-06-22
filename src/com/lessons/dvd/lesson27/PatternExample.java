package com.lessons.dvd.lesson27;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternExample {
    public static void main(String[] args) {
        String regex = ("\\+375 \\(\\d{2}\\) \\d{3}-\\d{2}-\\d{2}");
        String phoneNumber = "+375 (29) 898-23-45";
        Pattern pattern = Pattern.compile("\\+375 \\(\\d{2}\\) \\d{3}-\\d{2}-\\d{2}");
        Matcher matcher = pattern.matcher(phoneNumber);
        System.out.println(matcher.matches());
        System.out.println(phoneNumber.matches(regex));
    }
}
