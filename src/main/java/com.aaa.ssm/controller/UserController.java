package com.aaa.ssm.controller;

import com.aaa.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService us;
    @ResponseBody
    @RequestMapping("/selectUser")
    public List<Map> selectUser(){
        return us.selectUser();
    }
}
