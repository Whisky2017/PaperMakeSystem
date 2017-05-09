package com.papermaker.service.impl;

import com.papermaker.dao.UserDao;
import com.papermaker.pojo.User;
import com.papermaker.service.UserService;
import com.papermaker.util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 世康 on 2016/11/24.
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User login(String username, String password, int type) {
        User user = userDao.getUserByName(username,type);
        if (user != null){
            String pass = Util.MD5(user.getPassword());
            if (password.equals(pass)){
                return user;
            }
        }
        return null;
    }

    @Override
    public User getUserById(int id) {
        User user = userDao.getUserById(id);
        return null;
    }

    @Override
    public List<User> getUser(int currentPage, int pageSize) {
        return userDao.getUser(currentPage,pageSize);
    }

    @Override
    public int getUserCount() {
        return userDao.getUserCount();
    }

    @Override
    public int addUser() {
        return 0;
    }

    @Override
    public int editUser() {
        return 0;
    }

    @Override
    public boolean deleteUser(String id) {
        return false;
    }
}
