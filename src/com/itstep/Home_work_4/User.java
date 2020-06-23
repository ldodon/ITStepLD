package com.itstep.Home_work_4;

import java.util.Map;
import java.util.Random;

/**
 * Created by utilizator on 5/15/20.
 */
public class User {
    long id;
    String username;
    Random random = new Random();
    public Map<String, Address> addresses;
    public User(String username, Map<String, Address> addresses){
        this.addresses=addresses;
        this.id= random.nextInt();
        this.username=username;
    }

    @Override
    public String toString() {
        return "User{" +
                ", id=" + id +
                ", adminname='" + username + '\'' +
                '}';
    }
}
