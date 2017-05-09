package com.papermaker.service;

import com.papermaker.pojo.User;

import java.util.List;

/**
 * Created by 世康 on 2016/11/24.
 */
public interface UserService {
    public User login(String username, String password,int type);

    public User getUserById(int id);

    public List<User> getUser(int currentPage,int pageSize);

    public int getUserCount();

    public int addUser();

    public int editUser();

    public boolean deleteUser(String id);
}
