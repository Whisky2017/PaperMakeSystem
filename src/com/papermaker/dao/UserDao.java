package com.papermaker.dao;

import com.papermaker.pojo.User;

import java.util.List;

/**
 * Created by 世康 on 2016/11/24.
 */
public interface UserDao {
    public User getUserByName(String username,int type);
    public User getUserById(int id);
    public List<User> getUser(int currentPage,int pageSize);
    public int getUserCount();
    public List<User> getUserAll();
}
