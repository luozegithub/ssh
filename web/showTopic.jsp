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
<body >
<div class="container">
    <div class="row clearfix">
        <div class="col-md-6 column">
            <h3 class="text-info text-center">
                Topic:${topicEntity.topicTitile}
            </h3>
        </div>
        <div class="col-md-6 column">
            <small>&nbsp;&nbsp;-</small>
        </div>
    </div>
    <div class="row clearfix">
        <div class="col-md-2 column">
        </div>
        <div class="col-md-6 column">
            <br/>
            <p>
                Description: ${topicEntity.topicDescribe}
            </p>

            <table class="table">
                <tbody>
                <tr class="info">
                    <c:forEach items="${commentEntityList}" var="item">
                <tr class="info">
                    <td>>
                        <small>${item.userName}:</small>&nbsp;${item.commentContent}</div>
                    </td>
                </tr>
                </c:forEach>
                </tr>
                </tbody>
            </table>
        </div>
        <div class="col-md-4 column">
        </div>
    </div>
    <div class="row clearfix">
        <div class="col-md-2 column">
        </div>
        <div class="col-md-6 column">
            <form action="topic_addComment.action" method="post">
                <div class="form-group">
                    Write Your Review:<br/>

                    <input type="hidden" name="commentEntity.topicId" value="${topicEntity.topicId}"/>

                    <textarea id="exampleInput" name="commentEntity.commentContent" cols="90" rows="10">
                    </textarea><br/>
                </div>

        <div>
            <button type="submit" class="btn btn-default">Submit</button>
        </div>
        </form>
        </div>
        <div class="col-md-4 column">
        </div>
    </div>
</div>
    <div align="center">当前用户:${loginUser.userName}</div>
</body>
</html>
