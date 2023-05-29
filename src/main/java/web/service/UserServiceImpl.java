package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.UserDAO;
import web.model.User;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDAO userDaoImpl;

    @Override
    public List<User> getAllUsers() {
//        todo убрать заглушку
//        List<User> users = new ArrayList<>();
//        users.add(new User(1L,"Igor", "Mikhailov"));
//        users.add(new User(2L,"Maria", "Fomina"));
//        users.add(new User(3L,"Makar", "Mikhailov"));

        return userDaoImpl.listUsers();
    }

    @Override
    public void save(User user) {
        userDaoImpl.save(user);
    }
}
