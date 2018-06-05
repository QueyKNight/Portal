package com.qkn.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @RequestMapping("/test.do")
    @ResponseBody
    public  String getUser(){
        return "hello world--------------2";
    }
}
