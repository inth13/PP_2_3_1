package web.service;


import web.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void save(User user);

    void remove(long id);

    User find(long id);
}
