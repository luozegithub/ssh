package com.luo.dao;

import com.luo.entity.CommentEntity;

import java.util.List;

/**
 * Created by luo on 2017/4/16.
 */
public interface CommentDao extends BaseDao<CommentEntity> {
    public List<CommentEntity> findByTopicId(int id);
}
