package com.chen.service;

import com.chen.entity.UsersEntity;

import java.util.List;

/**
 * 用户service接口定义
 * Created by chen on 2017/4/12.
 */
public interface UserService extends BaseService<UsersEntity>{

    /**
     * 根据用户名密码查询用户
     *
     * @return 找到的用户，如果没有找到则返回空
     */
    public List<UsersEntity> findUserByIdAndPwd(String id, String pwd);


}
