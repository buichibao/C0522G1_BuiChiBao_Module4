package com.example.dao;

import com.example.model.Login;
import com.example.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<User> userList = new ArrayList<>();

    static {
        User user1 = new User();
        user1.setAge(10);
        user1.setName("Bao");
        user1.setAccount("bao123");
        user1.setPassword("123");
        user1.setEmail("bao@123");
        userList.add(user1);

        User user2 = new User();
        user2.setAge(20);
        user2.setName("Quyet");
        user2.setAccount("quyet123");
        user2.setPassword("123");
        user2.setEmail("quyet@123");
        userList.add(user2);

        User user3 = new User();
        user3.setAge(30);
        user3.setName("nam");
        user3.setAccount("nam123");
        user3.setPassword("123");
        user3.setEmail("nam@123");
        userList.add(user3);
    }

    public static  User checkLogin(Login login){
        for (User user: userList){
            if(user.getAccount().equals(login.getAccount())
              &&user.getPassword().equals(login.getPassword())){
                return user;
            }
        }
        return null;
    }
}
