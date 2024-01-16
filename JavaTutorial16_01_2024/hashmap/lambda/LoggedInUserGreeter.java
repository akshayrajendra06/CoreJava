package com.JavaTutorial16_01_2024.hashmap.lambda;

public class LoggedInUserGreeter implements Greeter{
    @Override
    public void perform() {
        System.out.println("Welcome back.");
    }
}
