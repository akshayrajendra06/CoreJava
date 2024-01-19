package com.JavaTutorial19_01_24.orelseget;

import java.util.ArrayList;

import com.JavaTutorial19_01_24.ifpresent.User;
import com.JavaTutorial19_01_24.ifpresent.UserRepository;

public class OrElseGetApp {

    public static void main(String[] args) {
        ArrayList<User> users = UserRepository.getUsers();
        users.forEach(EmailServiceOrElseGet::sendPromotion);
    }
}