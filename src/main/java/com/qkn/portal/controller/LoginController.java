package com.qkn.portal.controller;

import com.qkn.portal.pojo.User;
import com.qkn.portal.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
@RequestMapping("login")
public class LoginController {
    @Autowired
    private LoginService loginService;
    @RequestMapping(value="/login.do", method=RequestMethod.POST)
    //@ResponseBody
    public String login(HttpServletRequest request, HttpSession session){

        System.out.println("进入login.do-----------");
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        User user2 = loginService.getUser(userName,password);
        if (user2 != null){
            session.setAttribute("user",user2);
            return "success";
        }else {

            return "login";
        }

    }
}
