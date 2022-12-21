package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
//import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {

    //UserDao result = new UserDaoJDBCImpl();
    //Закрыл поле приватом
    private UserDao result = new UserDaoHibernateImpl();


    public void createUsersTable() throws SQLException {
        result.createUsersTable();
    }

    public void dropUsersTable() throws SQLException {
        result.dropUsersTable();

    }

    public void saveUser(String name, String lastName, byte age) throws SQLException {
        result.saveUser(name, lastName, age);
    }

    public void removeUserById(long id) throws SQLException {
        result.removeUserById(id);
    }

    public List<User> getAllUsers() throws SQLException {
        return result.getAllUsers();
    }

    public void cleanUsersTable() throws SQLException {
        result.cleanUsersTable();
    }
}
