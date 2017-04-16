package com.chen.entity;

/**
 * Created by chen on 2017/4/16.
 */
public class TopicEntity {
    private int topicId;
    private String topicTitile;
    private String topicDescribe;
    private String userName;

    public int getTopicId() {
        return topicId;
    }

    public void setTopicId(int topicId) {
        this.topicId = topicId;
    }

    public String getTopicTitile() {
        return topicTitile;
    }

    public void setTopicTitile(String topicTitile) {
        this.topicTitile = topicTitile;
    }

    public String getTopicDescribe() {
        return topicDescribe;
    }

    public void setTopicDescribe(String topicDescribe) {
        this.topicDescribe = topicDescribe;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TopicEntity that = (TopicEntity) o;

        if (topicId != that.topicId) return false;
        if (topicTitile != null ? !topicTitile.equals(that.topicTitile) : that.topicTitile != null) return false;
        if (topicDescribe != null ? !topicDescribe.equals(that.topicDescribe) : that.topicDescribe != null)
            return false;
        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = topicId;
        result = 31 * result + (topicTitile != null ? topicTitile.hashCode() : 0);
        result = 31 * result + (topicDescribe != null ? topicDescribe.hashCode() : 0);
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        return result;
    }
}
