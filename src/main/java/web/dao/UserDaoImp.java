package web.dao;


import org.springframework.stereotype.Repository;
import web.model.User;

import javax.persistence.EntityManager;

import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class UserDaoImp implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public void add(User user) {
        entityManager.persist(user);
        entityManager.flush();
    }

    @Override
    @Transactional
    public User getUser(long id) {
        return entityManager.find(User.class, id);
    }

    @Override
    @Transactional
    public User updateUser(User user) {
        entityManager.merge(user);
        entityManager.flush();
        return user;
    }

    @Override
    @Transactional
    public void deleteUserById(long id) {
        entityManager.remove(getUser(id));
        entityManager.flush();
    }

    @Override
    @Transactional
    public List<User> listUsers() {
        return entityManager.createQuery("from User", User.class).getResultList();
    }


}