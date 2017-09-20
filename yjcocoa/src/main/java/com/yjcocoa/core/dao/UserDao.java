package com.yjcocoa.core.dao;

import com.yjcocoa.core.po.User;
import org.apache.ibatis.annotations.Param;

/**
 * 用户DAO层接口
 */
public interface UserDao {

    /**
     * 通过账号和密码查询用户
     */
    public User findUser(@Param("usercode") String usercode, @Param("password") String password);

}