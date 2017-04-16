package com.chen.dao.impl;

import com.chen.dao.UserDao;
import com.chen.entity.UsersEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * 用户数据库操作实现类
 * Created by chen on 2017/4/12.
 */
public class UserDaoImpl extends BaseDaoImpl<UsersEntity> implements UserDao {

    /**
     *
     * @param id 要查询的用户di
     * @param pwd 用查询的用户密码
     * @return 找到的对象
     */
    @Override
    public List<UsersEntity> findUserByIdAndPwd(String id, String pwd) {
        List params = new ArrayList<String>();
        params.add(id);
        params.add(pwd);
        return findObjects("from UsersEntity where user_email = ? and user_pwd = ?", params);
    }
}
