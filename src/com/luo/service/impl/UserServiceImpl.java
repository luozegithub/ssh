package com.luo.service.impl;

import com.luo.dao.UserDao;
import com.luo.entity.UsersEntity;
import com.luo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户service实现
 * Created by luo on 2017/4/12.
 */
@Service("userService")
public class UserServiceImpl extends BaseServiceImpl<UsersEntity> implements UserService {



    private UserDao userDao;
    @Resource
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
