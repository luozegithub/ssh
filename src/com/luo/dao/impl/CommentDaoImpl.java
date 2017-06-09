package com.luo.dao.impl;

import com.luo.dao.CommentDao;
import com.luo.entity.CommentEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by luo on 2017/4/16.
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
