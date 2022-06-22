package com.lessons.dvd.lesson27.task;

public class Task3 {
    public static void main(String[] args) {
        String regex = "(<p .+?>)(.+?</p>)";
        String input = "<p> ffgfdglll </p> <b> dsdgsl </b> fwwefwef <p id=\\p1\">vfggr</p> +" +
                "eg,ege<p> fefef";
        System.out.println(input.replaceAll(regex, "<p>$2"));
    }
}
