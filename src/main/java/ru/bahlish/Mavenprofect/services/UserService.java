package ru.bahlish.Mavenprofect.services;

import ru.bahlish.Mavenprofect.model.User;

public interface UserService {
    void getUsers();
    String createUser(User user);
    String updateUser(User user);
    String deleteUser(String id);
}
