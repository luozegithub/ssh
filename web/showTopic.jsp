<%@ taglib prefix="s" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: chen
  Date: 2017/4/13
  Time: 23:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>主页</title>
</head>
<body align="center">
    <h1>话题:${topicEntity.topicTitile}</h1>
    <div align="center">${topicEntity.topicDescribe}</div>
    <div align="center">当前用户:${loginUser.userName}</div>
    <div>
            <c:forEach items="${commentEntityList}" var="item">
                    <div><span>内容:${item.commentContent}</span><span style="margin-left: 10px">评论用户${item.userName}</span></div>
            </c:forEach>
    </div>
    <div>
        <form action="topic_addComment.action" method="post">
            <input type="hidden" name="commentEntity.topicId" value="${topicEntity.topicId}"/>
            评论:<textarea name="commentEntity.commentContent" cols="30" rows="10"></textarea><br/>
            <input type="submit" value="评论"/>
        </form>
    </div>
</body>
</html>
