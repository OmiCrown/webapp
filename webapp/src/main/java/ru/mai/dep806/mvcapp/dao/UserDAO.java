package ru.mai.dep806.mvcapp.dao;

import ru.mai.dep806.mvcapp.model.User;

import java.util.List;

/**
 * Created by Omicrown on 05.06.2015.
 */
public interface UserDAO {
    List<User> getAllUsers();

    User findUserById(Long id);

    User saveUser(User user);
}
