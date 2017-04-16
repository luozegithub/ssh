package com.chen.dao;

import com.chen.entity.CommentEntity;

import java.util.List;

/**
 * Created by chen on 2017/4/16.
 */
public interface CommentDao extends BaseDao<CommentEntity> {
    public List<CommentEntity> findByTopicId(int id);
}
