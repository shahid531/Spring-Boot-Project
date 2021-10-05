package com.learn.myapp;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FriendsListRepository extends CrudRepository<FriendsList,Integer> {

    public FriendsList getByName(String name);
    public FriendsList getByNameIgnoreCase(String name);
    
}
