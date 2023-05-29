package web.dao;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import web.model.User;

import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {

    private SessionFactory sessionFactory;

    public UserDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void add(User user) {
        sessionFactory.openSession().save(user);
    }

    @Override
    public List<User> listUsers() {
        return sessionFactory.openSession().createQuery("from User", User.class).getResultList();
    }

    @Override
    public void save(User user) {
        sessionFactory.openSession().save(user);
    }
}
