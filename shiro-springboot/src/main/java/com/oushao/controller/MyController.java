package com.oushao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
    @RequestMapping({"/","/index"})
    public String toIndex(Model model) {
        model.addAttribute("msg","hello shiro");
        return "index";
    }
    @RequestMapping("/user/add")
    public String toAdd() {
        return "user/add";
    }
    @RequestMapping("/user/update")
    public String toUpdate() {
        return "user/update";
    }

    @RequestMapping("/toLogin")
    public String toLogin() {
        return "login";
    }
}
