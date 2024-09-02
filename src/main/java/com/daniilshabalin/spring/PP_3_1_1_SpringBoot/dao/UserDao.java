package com.daniilshabalin.spring.PP_3_1_1_SpringBoot.dao;



import com.daniilshabalin.spring.PP_3_1_1_SpringBoot.entity.User;

import java.util.List;

public interface UserDao {

    public List<User> getUsers();
    public void addUser(User user);
    public User getUser(int id);
    public void updateUser(User user);
    public void deleteUser(int id);
}
