package com.lessons.dvd.lesson22;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReaderRunner {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("resources", "test.txt");
        try (Stream<String> stringStream = Files.lines(path)) {
            stringStream.forEach(System.out::println);
        }

//        try (BufferedReader fileReader = new BufferedReader(new FileReader(file)))  {
//            String collect = fileReader.lines()
//                    .collect(Collectors.joining("\n"));
//            System.out.println(collect);
//        }
    }
}
