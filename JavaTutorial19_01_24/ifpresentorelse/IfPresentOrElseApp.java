package com.JavaTutorial19_01_24.ifpresentorelse;

import java.util.ArrayList;

import com.JavaTutorial19_01_24.ifpresent.User;
import com.JavaTutorial19_01_24.ifpresent.UserRepository;

public class IfPresentOrElseApp {

    public static void main(String[] args) {
        ArrayList<User> users = UserRepository.getUsers();
        users.forEach(EmailService::sendPromotion);
    }

}