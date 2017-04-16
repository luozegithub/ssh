package com.chen.service.impl;

import com.chen.dao.CommentDao;
import com.chen.entity.CommentEntity;
import com.chen.service.CommentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by chen on 2017/4/16.
 */
@Service
public class CommentServiceImpl extends BaseServiceImpl<CommentEntity> implements CommentService{

    private CommentDao commentDao;

    public CommentDao getCommentDao() {
        return commentDao;
    }

    @Resource
    public void setCommentDao(CommentDao commentDao) {
        super.setBaseDao(commentDao);
        this.commentDao = commentDao;
    }


    /**
     * 根据toopic查找所有评论
     *
     * @return 评论列表
     */
    @Override
    public List<CommentEntity> findByTopicId(int id) {
        return commentDao.findByTopicId(id);
    }
}
