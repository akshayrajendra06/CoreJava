package com.JavaTutorial19_01_24.orelsethrow;

import java.util.ArrayList;

import com.JavaTutorial19_01_24.ifpresent.User;
import com.JavaTutorial19_01_24.ifpresent.UserRepository;

public class OrElseThrowApp {

    public static void main(String[] args) {
        ArrayList<User> users = UserRepository.getUsers();
        users.forEach(EmailServiceOrElseThrow::sendPromotion);
    }
}