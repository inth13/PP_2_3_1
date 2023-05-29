package web.dao;

import web.model.User;

import java.util.List;

public interface UserDAO {

    void add(User user);

    List<User> listUsers();

    void save(User user);
}

