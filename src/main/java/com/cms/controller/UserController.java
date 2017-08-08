package com.cms.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class UserController {

    @RequestMapping(value = "/toLogin")
    public String toLogin(Model model) {
        return "login";
    }

    @RequestMapping(value = "/index")
    public String index(Model model) {
        return "index";
    }

    @RequestMapping(value = "/user/list")
    public String list(Model model) {
        return "user/user-list";
    }

    //    @RequiresRoles("")
    @ResponseBody
    @RequestMapping("/test")
    public String test() {
        System.out.println(123);
        return "success";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(String userName, String password) {
        UsernamePasswordToken token = new UsernamePasswordToken(userName, password);
        token.setRememberMe(true);
        Subject subject = SecurityUtils.getSubject();
        subject.login(token);
        if (subject.isAuthenticated()) {
            System.out.println("登陆成功");
            return "index";
        }
        return "login";
    }
}
