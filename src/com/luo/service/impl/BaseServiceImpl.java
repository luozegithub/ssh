package com.luo.service.impl;

import com.luo.dao.BaseDao;

import java.io.Serializable;
import java.util.List;

/**
 * 基本service实现类
 * Created by luo on 2017/4/13.
 */
public class BaseServiceImpl<T> implements BaseDao<T> {

    BaseDao<T> baseDao;

    public BaseDao<T> getBaseDao() {
        return baseDao;
    }

    public void setBaseDao(BaseDao<T> baseDao) {
        this.baseDao = baseDao;
    }

    @Override
    public void save(T entity) {
        this.baseDao.save(entity);

    }

    @Override
    public void update(T entity) {
        baseDao.save(entity);
    }

    @Override
    public void delete(Serializable id) {
        baseDao.delete(id);
    }

    @Override
    public T findObjectById(Serializable id) {
        return baseDao.findObjectById(id);
    }

    @Override
    public List<T> findObjects() {
        return baseDao.findObjects();
    }

    @Override
    public List findObjects(String hql, List<Object> parameters) {
        return baseDao.findObjects();
    }
}
