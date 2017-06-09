<%@ page import="com.sun.java.swing.plaf.windows.resources.windows" %>
<%@ taglib prefix="s" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>主页</title>
    <script src="js/bootstrap-3.3.0-dist/dist/css/bootstrap.min.css"></script>
    <script src="js/bootstrap-3.3.0-dist/dist/js/jquery.min.js"></script>
    <script src="js/bootstrap-3.3.0-dist/dist/js/bootstrap.min.js"></script>
    <link rel="stylesheet" type="text/css" href="js/bootstrap-3.3.0-dist/dist/css/bootstrap.min.css">

</head>
<body align="center">
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="row clearfix">
                <div class="col-md-12 column">
                    <h3>
                        All Topic
                    </h3>
                </div>
            </div>
            <div class="row clearfix">
                <div class="col-md-6 column">
                    <a href="addTopic.jsp">
                        <button type="button" class="btn btn-link btn-block btn-lg">Add My Topic</button>
                    </a>
                </div>
                <div class="col-md-6 column">
                        <small>当前用户:&nbsp;${loginUser.userName}</small>
                           <div>
                               <a href="home_doLogout.action">Logout</a>
                           </div>
                </div>
            </div>
            <div class="row clearfix">
                <div class="col-md-12 column">
                    <table class="table">
                        <thead>
                        <tr>
                            <th>Topic</th>
                            <th>Creator</th>
                        </tr>
                        </thead>
                        <tbody>

                        <tr class="info">
                            <c:forEach items="${topicEntityList}" var="item">
                        <tr class="info">
                            <td>>
                                <a href="topic_showTopic.action?topicEntity.topicId=${item.topicId}">
                                        ${item.topicTitile}
                                </a>
                            </td>
                            <td>${item.userName}</td>
                        </tr>
                        </c:forEach>
                        </tr>

                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
