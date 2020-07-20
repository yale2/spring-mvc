package com.yale.spring.demo.service;

import com.yale.spring.demo.dao.UserDao;
import com.yale.spring.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User findByNameAndPassword(String name,String password){
        return userDao.findByNameAndPassword(name,password);
    }
}
