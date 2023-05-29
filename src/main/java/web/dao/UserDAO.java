package web.dao;

import web.model.User;

import java.util.List;

public interface UserDAO {

    void add(User user);

    void remove(long id);

    List<User> listUsers();


    User find(long id);
}

