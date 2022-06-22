package com.lessons.dvd.lesson24.Task;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task3 {
    public static void main(String[] args) {
        String formattedDate = "26-03-1968T09:24";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy'T'HH:mm");
        LocalDateTime localDateTime = LocalDateTime.parse(formattedDate, formatter);
        System.out.println(localDateTime);


    }
}
