package web.dao;


import org.springframework.stereotype.Component;
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
        //entityManager.getCurrentSession().save(user);
 //       EntityTransaction transaction = entityManager.getTransaction();
   //     transaction.begin();
// Сохраняем новую сущность в контексте персистенции
        entityManager.persist(user);
        entityManager.flush();
// Коммитим транзакцию
     //   transaction.commit();

    }

    @Override
    public User getUser(long Id) {
        return null;
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
        return entityManager.createQuery("select User from User", User.class).getResultList();
    }

    @Override
    @Transactional
    public void updateUser() {

    }
}