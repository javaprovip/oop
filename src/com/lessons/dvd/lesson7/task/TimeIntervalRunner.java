package com.lessons.dvd.lesson7.task;

public class TimeIntervalRunner {
    public static void main(String[] args) {
        TimeInterval timeInterval = new TimeInterval(30, 2, 1);
        System.out.println(timeInterval.totalSeconds());

        TimeInterval timeInterval1 = new TimeInterval(timeInterval.totalSeconds());
        System.out.println(timeInterval1.totalSeconds());
        timeInterval1.print();

        TimeInterval sum = timeInterval.sum(timeInterval1);
        sum.print();

    }
}
