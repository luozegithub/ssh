<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <script src="js/bootstrap-3.3.0-dist/dist/css/bootstrap.min.css"></script>
    <script src="js/bootstrap-3.3.0-dist/dist/js/jquery.min.js"></script>
    <script src="js/bootstrap-3.3.0-dist/dist/js/bootstrap.min.js"></script>
    <link rel="stylesheet" type="text/css" href="js/bootstrap-3.3.0-dist/dist/css/bootstrap.min.css">

</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    Test Struts2 MVC<small>loginUI</small>
                </h1>
            </div>
            <div class="row clearfix">
                <div class="col-md-4 column">
                </div>
                <div class="col-md-4 column">
                    <form role="form" action="home_doLogin.action" method="post">
                        <div class="form-group">
                            <label for="exampleInputEmail1">Email</label>
                            <input type="email" class="form-control" id="exampleInputEmail1" name="user.userEmail" value="${user.userEmail}"/>
                        </div>
                        <div class="form-group">
                            <label for="exampleInputPassword1">Password</label>
                            <input type="password" class="form-control" id="exampleInputPassword1" name="user.userPwd" value="${user.userPwd}"/>
                        </div>
                        <div><font color="red">${msg}</font></div>
                        <button type="submit" class="btn btn-default" name="submit">Submit</button>
                        <a href="regist.jsp"> <button type="button" class="btn btn-default" >Register</button></a>
                    </form>
                </div>
                <div class="col-md-4 column">
                </div>
            </div>
        </div>
    </div>
</div>


</body>
</html>
