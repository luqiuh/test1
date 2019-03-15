package com.hy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Auther: asus
 * @Date: 2019/3/14 16:50
 * @Description:
 */
@Controller
@RequestMapping("/student")
public class Controller1 {
    @RequestMapping("/query.action")
    public ModelAndView query() {
        ModelAndView modelAndView = new ModelAndView();
        System.out.println("你想干嘛");
        System.out.println("===========");
        modelAndView.setViewName("/list.jsp");
        return modelAndView;
    }
}
