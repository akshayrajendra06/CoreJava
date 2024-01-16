package com.JavaTutorial16_01_2024.hashmap.lambda;

public class GuestUserGreeter implements Greeter{
    @Override
    public void perform() {
        System.out.println("Welcome to our application. Please create an account or log in!");
    }
}
