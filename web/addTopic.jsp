<%--
  Created by IntelliJ IDEA.
  User: chen
  Date: 2017/4/16
  Time: 11:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加一个新的话题</title>
</head>
<body>
<div align="center">
<form method="post" action="topic_addTopic.action">
    话题标题:<input name="topicEntity.topicTitile" type="text"/><br/>
    话题描述:<input name="topicEntity.topicDescribe" type="text" /><br/>
    <input type="submit" value="提交"/>
</form>
</div>
</body>
</html>
