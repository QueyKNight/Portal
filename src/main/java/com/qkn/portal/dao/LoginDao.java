package com.qkn.portal.dao;

import com.qkn.portal.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface LoginDao {

    User selectByCondition(@Param("userName") String userName, @Param("password")String password);
}
