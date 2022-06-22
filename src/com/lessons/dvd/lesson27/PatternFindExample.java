package com.lessons.dvd.lesson27;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternFindExample {
    public static void main(String[] args) {
        String phoneNumber = "dfhgdgdloo +375 (29) 856-23-45 vbdfbfbf +375 (29) 866-43-46" +
                "dfhgdgdlooofkgkdo +375 (39) 568-56-45 vbdfbfbf +375 (29) 564-43-36";
        String regex = ("\\+375 \\(\\d{2}\\) \\d{3}-\\d{2}-\\d{2}");
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        StringBuilder stringBuilder = new StringBuilder();
        while (matcher.find()){
            matcher.appendReplacement(stringBuilder, "XXX");
        }
        System.out.println(stringBuilder.toString());
    }
}
