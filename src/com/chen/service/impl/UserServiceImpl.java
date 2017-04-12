package com.chen.service.impl;

import com.chen.dao.UserDao;
import com.chen.entity.UsersEntity;
import com.chen.service.UserService;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户service实现
 * Created by chen on 2017/4/12.
 */
public class UserServiceImpl extends BaseServiceImpl<UsersEntity> implements UserService {
    @Resource
    private UserDao userDao;
    public void setUserDao(UserDao userDao) {
        super.setBaseDao(userDao);
        this.userDao = userDao;
    }

    /**
     * 根据用户id密码查询用户
     *
     * @param id  用户id
     * @param pwd 密码
     * @return 找到的用户，如果没有找到则返回空
     */
    @Override
    public List<UsersEntity> findUserByIdAndPwd(String id, String pwd) {
        return userDao.findUserByIdAndPwd(id, pwd);
    }
}
