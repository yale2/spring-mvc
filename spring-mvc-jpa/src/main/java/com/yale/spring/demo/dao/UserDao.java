package com.yale.spring.demo.dao;

import com.yale.spring.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface UserDao extends JpaRepository<User,Long>, JpaSpecificationExecutor<User> {

    User findByNameAndPassword(String name, String password);
}
