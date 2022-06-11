package com.lessons.dvd.lesson21;

import java.util.Optional;
import java.util.stream.Stream;

public class MapReduceExample {
    public static void main(String[] args) {
        Optional<Student> maybeStudent = Stream.of(
                new Student(18,"Ivan"),
                new Student(12,"petr"),
                new Student(22,"zoyev"),
                new Student(46,"Samok"),
                new Student(34,"Bomek")
        )
                .sequential()
//                .map(Student::getAge)
                .reduce((student, student2) -> student.getAge() > student2.getAge() ? student:student2);
        maybeStudent.ifPresent(System.out::println);



    }
}
