package com.chen.action;

import com.chen.entity.TopicEntity;
import com.chen.entity.UsersEntity;
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
    private List<TopicEntity> topicEntityList;
    private TopicEntity topicEntity;
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
