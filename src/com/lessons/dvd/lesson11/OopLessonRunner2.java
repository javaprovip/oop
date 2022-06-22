package com.lessons.dvd.lesson11;

public class OopLessonRunner2 {
    public static void main(String[] args) {
        Printable laptop = new Laptop(new Ssd(250), new Ram(1024), 2);
        Printable mobile = new Mobile(new Ssd(123), new Ram(500));

        printWithRandom(laptop,mobile);

    }
//    public static void print(Printable...objects){
//        for (Printable object : objects) {
//            object.print();
//        }
        public static void printWithRandom(Printable...objects){
            for (Printable object : objects) {
                object.printWithRandom();
            }

    }
}
