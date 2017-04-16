package com.chen.action;

import com.chen.entity.CommentEntity;
import com.chen.entity.TopicEntity;
import com.chen.entity.UsersEntity;
import com.chen.service.CommentService;
import com.chen.service.TopicService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by chen on 2017/4/16.
 */
public class TopicAction extends ActionSupport{
    @Resource
    private TopicService topicService;
    @Resource
    private CommentService commentService;

    private List<CommentEntity> commentEntityList;
    private List<TopicEntity> topicEntityList;
    private TopicEntity topicEntity;
    private CommentEntity commentEntity;

    public String listAll(){
        setTopicEntityList(topicService.findObjects());
        return "listAll";
    }

    public String addTopic(){
        UsersEntity loginUser = (UsersEntity) ActionContext.getContext().getSession().get("loginUser");
        topicEntity.setUserName(loginUser.getUserName());
        topicService.save(topicEntity);
        return listAll();
    }

    public String showTopic() {
        setTopicEntity(topicService.findObjectById(topicEntity.getTopicId()));
        setCommentEntityList(commentService.findByTopicId(topicEntity.getTopicId()));
        return "showTopic";
    }
    public String addComment(){
        topicEntity = new TopicEntity();
        UsersEntity loginUser = (UsersEntity) ActionContext.getContext().getSession().get("loginUser");
        commentEntity.setUserName(loginUser.getUserName());
        topicEntity.setTopicId(commentEntity.getTopicId());
        commentService.save(commentEntity);
        return showTopic();
    }







    public List<CommentEntity> getCommentEntityList() {
        return commentEntityList;
    }

    public void setCommentEntityList(List<CommentEntity> commentEntityList) {
        this.commentEntityList = commentEntityList;
    }

    public CommentEntity getCommentEntity() {
        return commentEntity;
    }

    public void setCommentEntity(CommentEntity commentEntity) {
        this.commentEntity = commentEntity;
    }

    public CommentService getCommentService() {
        return commentService;
    }

    public void setCommentService(CommentService commentService) {
        this.commentService = commentService;
    }

    public TopicEntity getTopicEntity() {
        return topicEntity;
    }

    public void setTopicEntity(TopicEntity topicEntity) {
        this.topicEntity = topicEntity;
    }

    public TopicService getTopicService() {
        return topicService;
    }

    public void setTopicService(TopicService topicService) {
        this.topicService = topicService;
    }
    public List<TopicEntity> getTopicEntityList() {
        return topicEntityList;
    }

    public void setTopicEntityList(List<TopicEntity> topicEntityList) {
        this.topicEntityList = topicEntityList;
    }
}
