package com.yale.spring.demo.service;


import com.yale.spring.demo.dao.ResumeDao;
import com.yale.spring.demo.dao.UserDao;
import com.yale.spring.demo.entity.Resume;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResumeService {

    @Autowired
    private ResumeDao resumeDao;

    public List<Resume> findAll(){
        return resumeDao.findAll();
    }

    public void saveOrUpdate(Resume user){
        resumeDao.save(user);
    }

    public void deleteById(Long id) {
        resumeDao.deleteById(id);
    }

    public Resume findById(Long id) {
        return resumeDao.findById(id).get();
    }
}
