package com.JavaTutorial19_01_24.filter;

import com.JavaTutorial19_01_24.ifpresent.User;

public class EmailServiceFilter {
    public static void sendPromotion(User user) {
        user.getEmail()
                .filter(email -> email.length() > 3 && email.contains("@") && email.contains("."))
                .ifPresentOrElse(
                    email -> System.out.println("Promotion email is sent to: " + email),
                    () -> System.out.println("Promotion SMS is sent to:" + user.getPhoneNumber())
        );
    }

}