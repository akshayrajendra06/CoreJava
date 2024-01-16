package com.JavaTutorial16_01_2024.hashmap.lambda.listpractice;

import java.util.List;

public class StreamsIntroductionApp {

    public static void main(String[] args) {
        List<Integer> temperatures = List.of(16, 16, 16, 17, 19, 19, 16);

        System.out.println(temperatures.stream()
                .filter(temperature -> temperature > 16)
                .filter(temperature -> temperature < 19)
                .count());
    }
}
