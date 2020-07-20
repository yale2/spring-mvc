package com.yale.spring.demo.controller;


import com.yale.spring.demo.entity.Resume;
import com.yale.spring.demo.entity.User;
import com.yale.spring.demo.service.ResumeService;
import com.yale.spring.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/demo")
public class LoginController {

    @Autowired
    private ResumeService resumeService;

    @Autowired
    private UserService userService;


    @RequestMapping("/login")
    public ModelAndView login(HttpServletRequest request,String name, String password){
        User user = userService.findByNameAndPassword(name,password);
        ModelAndView modelAndView=new ModelAndView();
        if(null != user){
            List<Resume> all = resumeService.findAll();
            modelAndView.addObject("resumes",all);
            modelAndView.setViewName("list");
            request.getSession().setAttribute("user",user);
            return modelAndView;
        }
        modelAndView.addObject("errMsg","用户名或密码错误");
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @RequestMapping("/list")
    public ModelAndView list(){
        ModelAndView modelAndView=new ModelAndView();
        List<Resume> all = resumeService.findAll();
        modelAndView.addObject("resumes",all);
        modelAndView.setViewName("list");
        return modelAndView;
    }

    @RequestMapping(value = "/edit",method = RequestMethod.GET)
    public ModelAndView edit( Long id)
    {
        ModelAndView modelAndView=new ModelAndView();
        Resume resume = resumeService.findById(id);
        modelAndView.addObject("resume",resume);
        modelAndView.setViewName("edit");
        return modelAndView;
    }

    @RequestMapping("/save")
    public String save(Resume resume)
    {
        resumeService.saveOrUpdate(resume);
        return "redirect:list";
    }

    @RequestMapping("/add")
    public String add()
    {
        return "add";
    }


    @RequestMapping("delete")
    public String delete(Long id){
        resumeService.deleteById(id);
        return "redirect:list";
    }

}
