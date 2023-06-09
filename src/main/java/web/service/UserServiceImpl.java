package web.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDAO;
import web.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDAO userDAOImpl;

    public UserServiceImpl(UserDAO userDAOImpl) {
        this.userDAOImpl = userDAOImpl;
    }

    @Transactional(readOnly = true)
    @Override
    public List<User> getAllUsers() {
        return userDAOImpl.listUsers();
    }

    @Override
    @Transactional
    public void save(User user) {
        userDAOImpl.add(user);
    }

    @Override
    @Transactional
    public void remove(long id) {
        userDAOImpl.remove(id);
    }

    @Override
    public User find(long id) {
        return userDAOImpl.find(id);
    }
}
