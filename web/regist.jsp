<%--
  Created by IntelliJ IDEA.
  User: chen
  Date: 2017/4/13
  Time: 22:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
<div align="center">
    <form action="home_doRegist.action" method="post">
        邮箱:<input type="text" name="user.userEmail"/><br/>
        姓名:<input type="text" name="user.userName"/><br/>
        密码:<input type="password" name="user.userPwd"/><br/>
        <font color="red">${msg}</font><br/>
        <input type="submit" value="注册"/><a href="login.jsp">登录</a>
    </form>
</div>
</body>
</html>
