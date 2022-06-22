package com.lessons.dvd.lesson18;

public class ListRunner {
    public static void main(String[] args) {
        List<String> list = new List(10);
        list.add("String1");
        list.add("String2");
        list.add("String3");

        Object element = list.get(2);
        System.out.println(element);
    }
}
