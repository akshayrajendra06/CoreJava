package com.JavaTutorial19_01_24.orelse;

import java.util.ArrayList;

import com.JavaTutorial19_01_24.ifpresent.User;
import com.JavaTutorial19_01_24.ifpresent.UserRepository;

public class OrElseApp {

    public static void main(String[] args) {
        ArrayList<User> users = UserRepository.getUsers();
        users.forEach(EmailServiceOrElse::sendPromotion);
    }
}