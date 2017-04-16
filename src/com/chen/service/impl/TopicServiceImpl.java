package com.chen.service.impl;

import com.chen.dao.TopicDao;
import com.chen.entity.TopicEntity;
import com.chen.service.TopicService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by chen on 2017/4/16.
 */
@Service
public class TopicServiceImpl extends BaseServiceImpl<TopicEntity> implements TopicService {
    private TopicDao topicDao;

    @Resource
    public void setTopicDao(TopicDao topicDao) {
        super.setBaseDao(topicDao);
        this.topicDao = topicDao;
    }
}
