package com.chen.service;

import com.chen.entity.CommentEntity;

import java.util.List;

/**
 * Created by chen on 2017/4/16.
 */
public interface CommentService extends BaseService<CommentEntity> {
    /**
     * 根据toopic查找所有评论
     * @return 评论列表
     */
    public List<CommentEntity> findByTopicId(int id);
}
