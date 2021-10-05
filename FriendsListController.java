package com.learn.myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
@RequestMapping("/api")
public class FriendsListController {
    @Autowired
    private FriendsListServices friendsListServices;
    @PostMapping("/postRequest")
    public FriendsList postFriendsList(@RequestBody FriendsList x){
        FriendsList ans1 = friendsListServices.postFriendsList(x);
        return ans1;
    }
    @GetMapping("/getRequest")
    public List<FriendsList> getFriendsList(FriendsList x){
        List<FriendsList> ans1 = friendsListServices.getFriendsList();
        return ans1;
    }
    @DeleteMapping("/deleteRequest/{id}")
    public String deleteFriendsList(@PathVariable("id") int x){
        friendsListServices.deleteFriendsList(x);
        return "Successfully Deleted!";
    }
    @PutMapping("/putRequest/{id}")
    public FriendsList putFriendsList(@PathVariable("id") int x, @RequestBody FriendsList y){
        return friendsListServices.putFriendsList(x,y); 
    }
    @GetMapping("/getByName/{name}")
    public FriendsList getByName(@PathVariable("name") String name){
        return friendsListServices.getByName(name);
    }
}
