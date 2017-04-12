package com.chen.dao.impl;

import com.chen.dao.BaseDao;
import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * 基础dao完成基本CRUD实现
 * Created by chen on 2017/4/12.
 */
public class BaseDaoImpl<T> extends HibernateDaoSupport implements BaseDao<T> {
    Class<T> clazz;

    public BaseDaoImpl() {
        ParameterizedType pt = (ParameterizedType) this.clazz.getGenericSuperclass();
        clazz = (Class<T>) pt.getActualTypeArguments()[0];
    }

    @Override
    public void save(T entity) {
        getHibernateTemplate().save(entity);
    }

    @Override
    public void update(T entity) {
        getHibernateTemplate().update(entity);
    }

    @Override
    public void delete(Serializable id) {
        getHibernateTemplate().delete(findObjectById(id));
    }

    @Override
    public T findObjectById(Serializable id) {
        return getHibernateTemplate().get(clazz, id);
    }

    @Override
    public List<T> findObjects() {
        Query query = getSession().createQuery("from " + clazz.getSimpleName());
        return query.list();
    }

    @Override
    public List findObjects(String hql, List<Object> parameters) {
        Query query = getSession().createQuery(hql);
        if (parameters != null) {
            for (int i = 0; i < parameters.size(); i++) {
                query.setParameter(i, parameters.get(i));
            }
        }
        return query.list();
    }
}
