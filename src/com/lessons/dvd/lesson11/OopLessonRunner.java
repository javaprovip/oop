package com.lessons.dvd.lesson11;

public class OopLessonRunner {
    public static void main(String[] args) {
        Computer laptop = new Laptop(new Ssd(250), new Ram(1024), 2);
        //laptop.load();
        System.out.println();
        Computer mobile = new Mobile(new Ssd(123), new Ram(500));
        Laptop laptop1 = new Laptop(new Ssd(600), new Ram(120), 3);
        //mobile.load();

        //loadComputers(laptop, mobile);
        printInformation(new Computer[]{laptop, mobile, laptop1});


//        Ssd ssd = new Ssd(500);
//        Ram ram = new Ram(1024);
//        Computer computer = new Computer(ssd, ram);
//        computer.load();
//
//        Laptop laptop = new Laptop(new Ssd(250), new Ram(512), 2);
//        laptop.open();
//        laptop.load();

    }
    public static void printInformation(Computer[] computers){
        for (Computer computer : computers) {
            if(computer instanceof Laptop){
                ((Laptop) computer).open();
            }
            computer.print();
            
        }
    }
    public static void loadComputers(Computer...computers){
        for (Computer computer : computers) {
            computer.load();
            System.out.println();

        }
    }
}
