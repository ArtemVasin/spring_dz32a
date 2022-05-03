package com.artemvain.spring.spring_dz24.service;

import com.artemvain.spring.spring_dz24.entity.Book;
import com.artemvain.spring.spring_dz24.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements  UserService{

    private static int USERS_COUNT;
    private  List<User> users;
    {
        users = new ArrayList<>();

        users.add(new User(++USERS_COUNT, "Artem Petrov","123@mail.ru"));
        users.add(new User(++USERS_COUNT, "Anna Sidorova","anna@gmail.ru"));
        users.add(new User(++USERS_COUNT, "Petr Ivanov","ivanov@list.ru"));
    }

    @Override
    public List<User> getAllUsers() {
        return users;
    }

    @Override
    public void saveUser(User user) {
        user.setId(++USERS_COUNT);
        users.add(user);
    }

    @Override
    public User getUser(int id) {
        return users.stream().filter(user -> user.getId() == id).findAny().orElse(null);
    }

    @Override
    public void deleteUser(int id) {
        users.removeIf(p -> p.getId() == id);
    }

    @Override
    public void updateUser(int id, User updatedUser) {
        User userToBeUpdated = getUser(id);

        userToBeUpdated.setName(updatedUser.getName());
        userToBeUpdated.setEmail(updatedUser.getEmail());
    }
}
