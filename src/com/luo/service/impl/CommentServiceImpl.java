package com.luo.service.impl;

import com.luo.dao.CommentDao;
import com.luo.entity.CommentEntity;
import com.luo.service.CommentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by luo on 2017/4/16.
 */
@Service
public class CommentServiceImpl extends BaseServiceImpl<CommentEntity> implements CommentService{

    private CommentDao commentDao;

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
