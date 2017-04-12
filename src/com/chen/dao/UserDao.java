package com.chen.dao;

import com.chen.entity.UsersEntity;

import java.util.List;

/**
 * 用户操作类接口定义
 * Created by chen on 2017/4/12.
 */
public interface UserDao extends BaseDao<UsersEntity>{
    /**
     * 根据用户id和密码查询
     * @param id 要查询的用户di
     * @param pwd 用查询的用户密码
     * @return 查询出来的用户，如果没有查到则返回空
     */
    public List<UsersEntity> findUserByIdAndPwd(String id, String pwd);
}
