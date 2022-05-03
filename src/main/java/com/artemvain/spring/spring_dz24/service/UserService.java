package com.artemvain.spring.spring_dz24.service;

import com.artemvain.spring.spring_dz24.entity.Book;
import com.artemvain.spring.spring_dz24.entity.Shopper;
import com.artemvain.spring.spring_dz24.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


public interface UserService {



    public List<User> getAllUsers();

    public void saveUser(User user);

    public User getUser(int id);

    public void deleteUser(int id);


    public void updateUser(int id, User user);
}
