package com.JavaTutorial17_01_24.collect;
import java.util.stream.IntStream;

public class RangeApp {

    public static void main(String[] args) {

        System.out.println("Temperature scale:");
        IntStream.rangeClosed(10, 30)
                .filter(number -> number % 10 == 0)
                .forEach(System.out::println);

        System.out.println("Possibility of rain:");
        IntStream.range(1, 10).asDoubleStream()
                .map(number -> number / 10 )
                .forEach(System.out::println);

    }
}
