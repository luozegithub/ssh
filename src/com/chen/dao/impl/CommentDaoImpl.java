package com.chen.dao.impl;

import com.chen.dao.CommentDao;
import com.chen.entity.CommentEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chen on 2017/4/16.
 */
public class CommentDaoImpl extends BaseDaoImpl<CommentEntity> implements CommentDao {
    @Override
    public List<CommentEntity> findByTopicId(int id) {
        String hql = "from CommentEntity where topic_id=?";
        List params = new ArrayList();
        params.add(id);
        return findObjects(hql,params);
    }
}
