package com.qkn.portal.service.Impl;

import com.qkn.portal.dao.LoginDao;
import com.qkn.portal.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements com.qkn.portal.service.LoginService {

    @Autowired
    private LoginDao loginDao;
    @Override
    public User getUser(String userName, String password) {
        User user = loginDao.selectByCondition(userName,password);
        return user;
    }
}
