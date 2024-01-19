package com.JavaTutorial19_01_24.ifpresent;

public class EmailService {

    public static void sendPromotion(User user) {
        user.getEmail().ifPresent(
                email -> System.out.println("Promotion email is sent to: " + email)
        );
    }

}