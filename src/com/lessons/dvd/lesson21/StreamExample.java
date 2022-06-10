package com.lessons.dvd.lesson21;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Stream;

import static java.util.List.of;

public class StreamExample {


    public static void main(String[] args) {
        List<String> strings = of("88", "11", "25", "33", "44", "55","66");
        IntSummaryStatistics intSummaryStatistics = strings.stream()
                .map(string -> string + string)
                .map(Integer::valueOf)
                .filter(value -> value % 2 ==0)
                .sorted()
//                .skip(1)
                .limit(2)
                .mapToInt(Integer::intValue)
                .summaryStatistics();
        System.out.println(intSummaryStatistics);


//        for(String string : strings){
//            String value = string + string;
//            Integer intValue = Integer.valueOf(value);
//            if(intValue % 2==0) {
//                System.out.println(intValue);
//            }
//        }

    }
}
