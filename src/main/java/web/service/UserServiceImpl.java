package web.service;

import org.springframework.stereotype.Component;
import web.dao.UserDao;
import web.dao.UserDaoImp;
import web.model.User;

import java.util.List;

@Component
public class UserServiceImpl implements UserService {

    UserDao dao = new UserDaoImp();

    public UserServiceImpl(UserDao dao) {
        this.dao = dao;
    }

    @Override
    public void add(User user) {
        dao.add(user);
    }

    @Override
    public User getUser(long id) {
        return dao.getUser(id);
    }

    @Override
    public User updateUser(User user) {
        return dao.updateUser(user);
    }

    @Override
    public void deleteUserById(long id) {
        dao.deleteUserById(id);
    }

    @Override
    public List<User> listUsers() {
        return dao.listUsers();
    }


}


