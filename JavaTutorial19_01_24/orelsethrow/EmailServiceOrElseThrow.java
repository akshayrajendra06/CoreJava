package com.JavaTutorial19_01_24.orelsethrow;

import java.util.NoSuchElementException;

import com.JavaTutorial19_01_24.ifpresent.User;

public class EmailServiceOrElseThrow {

    public static void sendPromotion(User user) {
        try {
            String email = user.getEmail().orElseThrow(NoSuchElementException::new);
            System.out.println("Promotion email is sent to: " + email);
        } catch (NoSuchElementException exception) {
            System.out.println("Something is wrong with the email address.");
        }
    }

}