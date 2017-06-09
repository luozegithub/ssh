package com.luo.service.impl;

import com.luo.dao.TopicDao;
import com.luo.entity.TopicEntity;
import com.luo.service.TopicService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by luo on 2017/4/16.
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
