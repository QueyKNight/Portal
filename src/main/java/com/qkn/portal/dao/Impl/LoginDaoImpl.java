package com.qkn.portal.dao.Impl;

import com.qkn.portal.dao.LoginDao;
import com.qkn.portal.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LoginDaoImpl implements LoginDao {


    @Override
    public User selectByCondition(String userName, String password) {
        return null;
    }
}
