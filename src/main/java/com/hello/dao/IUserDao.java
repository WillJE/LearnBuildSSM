package com.hello.dao;


import com.hello.model.User;

public interface IUserDao {
    User selectUser(long id);
}
