package com.JavaTutorial19_01_24.empty;

import java.util.List;
import java.util.Optional;

import com.JavaTutorial19_01_24.Friend;

public class FindFriendServiceEmpty {

    public Optional<Friend> findFriend(String friendName) {
  
    	List<Friend> friends = List.of(
                new Friend(123123L, "Adrian", 31, 1245),
                new Friend(123124L, "Lala", 29, 345),
                new Friend(123125L, "Diego", 43, 432),
                new Friend(123126L, "Sasha", 22, 564));
        Optional<Friend> friendFound = Optional.empty();
        for (Friend friend : friends) {
            if (friendName.equals(friend.getName())) {
                friendFound = Optional.ofNullable(friend);
            }
        }
        return friendFound;
    }

}