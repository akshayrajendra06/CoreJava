package com.JavaTutorial19_01_24.ifpresentorelse;

import com.JavaTutorial19_01_24.ifpresent.User;

public class EmailService {

    public static void sendPromotion(User user) {
        user.getEmail().ifPresentOrElse(
                email -> System.out.println("Promotion email is sent to: " + email),
                () -> System.out.println("Promotion SMS is sent to:" + user.getPhoneNumber())
        );
    }

}