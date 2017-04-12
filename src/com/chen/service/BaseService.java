package com.chen.service;

import java.io.Serializable;
import java.util.List;

/**
 * 基本service接口
 * Created by chen on 2017/4/13.
 */
public interface BaseService <T>{
    //新增
    public void save(T entity);

    //更新
    public void update(T entity);

    //根据id删除
    public void delete(Serializable id);

    //根据id查找
    public T findObjectById(Serializable id);

    //查找全部
    public List<T> findObjects();

    //查询实体列表条件查询
    public List findObjects(String hql, List<Object> parameters);

}
