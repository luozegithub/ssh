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
    <title>登录</title>
</head>
<body>
    <form action="home_doLogin.action" method="post">
        邮箱:<input type="text" name="user.userEmail"/><br/>
        密码:<input type="password" name="user.userPwd"/><br/>
        <font color="red">${msg}</font><br/>
        <input type="submit" value="登录"/><a href="regist.jsp">注册</a>
    </form>
</body>
</html>
