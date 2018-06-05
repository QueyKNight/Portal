package com.qkn.portal.service;

import com.qkn.portal.pojo.User;

public interface LoginService {
    /**
     * 查询User,若存在该用户，则返回用户信息
     * @param userName
     * @return
     */
    User getUser(String userName, String password);
}
