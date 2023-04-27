package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    void add(User user);

    User getUser(long id);

    void deleteUserById(long id);

    List<User> listUsers();

    User updateUser(User user);
}