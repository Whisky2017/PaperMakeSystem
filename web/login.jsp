<%--
  Created by IntelliJ IDEA.
  User: 世康
  Date: 2016/11/22
  Time: 18:48
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*" %>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>登录界面</title>
    <link rel="icon" href="image/icon.gif" type="image/x-icon" />
    <link rel="shortcut icon" href="image/icon.gif" type="image/x-icon" />
    <link rel="bookmark" href="image/icon.gif" type="image/x-icon" />
    <link rel="stylesheet" type="text/css" href="sta/css/bootstrap.min.css">

    <link rel="stylesheet" href="css/login.css">

    <script type="text/javascript" src="sta/js/jquery-2.1.4.min.js"></script>
    <script type="text/javascript" src="sta/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="js/md5.js"></script>
    <script type="text/javascript">
        function check_login(form){
            var msg = document.getElementById('password').value;
            document.getElementById('password').value = hex_md5(msg);
        }
    </script>
</head>

<body>
    <div class="container">
        <div class="col-lg-6 col-md-6 left">
            <%--<img class="col-lg-offset-2 col-lg-4 logo col-xs-offset-1  col-xs-5  " src="image/logo.gif" />--%>
            <h1 class="col-lg-6 col-xs-5  title">用户登录</h1>

            <form method="post" action="u_login.action" class="form-horizontal login" onSubmit="check_login(this);">
                <input id="username" name="username" class="col-lg-offset-2 col-lg-8 col-xs-offset-1 col-xs-10 input"  type="text" value="">
                <input id="password" name="password" class="col-lg-offset-2 col-lg-8  col-xs-offset-1 col-xs-10 input" type="password" value="">
                <input name="type" type="hidden" value="0">
                <input class="col-lg-offset-7 col-lg-3 btn-login col-xs-offset-1 col-xs-10 btn btn-success"  type="submit" value="登录">
            </form>
            <div class="col-lg-offset-2 col-lg-2 col-md-offset-2 col-md-2 col-xs-offset-2 col-xs-10" style="width: 100%; ">
                <font face="宋体" style="font-size: 12pt;color:red;"><s:property value="errorsMap.login"/></font>
            </div>
        </div>
        <div class="col-lg-6 col-md-6 right">
            <h1 class="col-lg-offset-2 col-lg-4 col-xs-offset-1 col-xs-10"><span>公告</span></h1>
            <p class="col-lg-offset-2 col-lg-8 col-xs-offset-1 col-xs-10">请各位用户妥善保管好账户密码，此网站为学校内部使用，严禁外泄，谢谢合作！</p>

            <input class="col-lg-offset-2 col-lg-3 tel-wait col-xs-offset-1 col-xs-10  btn btn-warning" type="button" value="联系客服">
            <p class="col-lg-offset-7 col-lg-3 txt-right col-xs-offset-7 col-xs-4 date">2016.11.22&nbsp;&nbsp;</p>
        </div>
    </div>
    <script type="text/javascript" src="js/login.js"></script>
</body>
</html>
