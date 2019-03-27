package cn.qi.controller;

import cn.qi.domain.User;
import cn.qi.service.UserSercice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserSercice userSercice;


    @RequestMapping("findAll")
    public ModelAndView show(){
        List<User> all = userSercice.findAll();
        ModelAndView mv=new ModelAndView();
        mv.addObject("list",all);
        mv.setViewName("success");
        return mv;
    }
}
