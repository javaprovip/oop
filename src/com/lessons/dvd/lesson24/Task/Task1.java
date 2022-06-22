package com.lessons.dvd.lesson24.Task;

import java.time.LocalDateTime;

public class Task1 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2022, 6, 13, 14, 26);
        LocalDateTime localDateTime1 = localDateTime.plusMonths(3L);

        System.out.println(localDateTime1.toLocalDate());
        System.out.println(localDateTime1.toLocalTime());



    }
}
