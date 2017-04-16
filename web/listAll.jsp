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
    <h1>所有话题</h1>
    <div align="center">当前用户:${loginUser.userName}</div>
    <div align="center"><a href="addTopic.jsp">创建话题</a></div>
    <table border="1 solid" align="center">
        <tr>
            <th>话题</th> <th>创建者</th>
        </tr>
            <c:forEach items="${topicEntityList}" var="item">
                 <tr>
                     <td>><a href="topic_showTopic.action?topicEntity.topicId=${item.topicId}"> ${item.topicTitile}</a></td>
                     <td>${item.userName}</td>
                 </tr>
            </c:forEach>
    </table>
</body>
</html>
