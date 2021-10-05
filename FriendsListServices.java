package com.learn.myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Objects;

@Service
public class FriendsListServices {
    @Autowired
    private FriendsListRepository friendsListRepository;
    public FriendsList postFriendsList(FriendsList x){
        return friendsListRepository.save(x);
    }
    public List<FriendsList> getFriendsList(){
        return (List<FriendsList>) friendsListRepository.findAll();
    }
    public void deleteFriendsList(int x){
        friendsListRepository.deleteById(x);
    }
    public FriendsList putFriendsList(int x,FriendsList y){
        FriendsList fun1 = friendsListRepository.findById(x).get();
        if(Objects.nonNull(y.getName())&& !"".equalsIgnoreCase(y.getName())){
            fun1.setName(y.getName());
        }
        if(Objects.nonNull(y.getSurname())&& !"".equalsIgnoreCase(y.getSurname())){
            fun1.setSurname(y.getSurname());
        }
        if(Objects.nonNull(y.getDob())&& !"".equalsIgnoreCase(y.getDob())){
            fun1.setDob(y.getDob());
        }
        return friendsListRepository.save(fun1);
    }
    public FriendsList getByName(String name){
        return friendsListRepository.getByNameIgnoreCase(name);
    }
}
