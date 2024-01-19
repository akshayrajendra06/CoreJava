package com.JavaTutorial19_01_24.empty;
import java.util.Optional;
import java.util.Scanner;

import com.JavaTutorial19_01_24.Friend;

public class IsEmptyApp {

    public static void main(String[] args) {

    	
        FindFriendServiceEmpty findFriendServiceEmpty = new FindFriendServiceEmpty();
        Scanner userInput = new Scanner(System.in);

        Optional<Friend> friend = findFriendServiceEmpty.findFriend(userInput.nextLine());
        if (friend.isEmpty()) {
            System.out.println("Not found.");
        } else {
            System.out.println(friend.get());
        }

    }
}