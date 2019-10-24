package com.kb.jdbctemplate.dao;

import com.kb.jdbctemplate.po.User;

import java.util.List;

/**
 * @description:
 * @Author: kb
 * @Date: 2019-10-24 20:38
 */
public interface UserDao {
    User getUserById(Integer id);

    public List<User> getUserList();

    public int add(User user);

    public int update(Integer id, User user);

    public int delete(Integer id);
}
