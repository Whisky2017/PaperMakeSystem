<%--
  Created by IntelliJ IDEA.
  User: 世康
  Date: 2016/11/23
  Time: 11:38
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*" %>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ include file="loginverify.jsp"%>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>主页</title>
    <link rel="icon" href="image/icon.gif" type="image/x-icon" />
    <link rel="shortcut icon" href="image/icon.gif" type="image/x-icon" />
    <link rel="bookmark" href="image/icon.gif" type="image/x-icon" />
    <link rel="stylesheet" type="text/css" href="sta/css/bootstrap.min.css">

    <link rel="stylesheet" href="css/home.css">

    <script type="text/javascript" src="sta/js/jquery-2.1.4.min.js"></script>
    <script type="text/javascript" src="sta/js/bootstrap.min.js"></script>
</head>
<body>
    <div class="header">
        <div class="headerb">
            <div class="logo" title="App:app41.dc.hust.edu.cn:app413" onclick="window.location.href='/papermaker/home.jsp'" style="cursor: pointer;"></div>
            <div class="headern">
                华中科技大学计算机学院制卷系统
            </div>
        </div>
        <div class="content">
            <div class="nav">
            </div>
            <div class="p1" id="p1">
                <img src="image/p1.png">
                <span>试卷素材导入</span>
            </div>
            <div class="p2" id="p2">
                <img src="image/p2.png">
                <span>试卷配置输入</span>
            </div>
            <div class="p3" id="p3">
                <img src="image/p3.png">
                <span>我的试卷</span>
            </div>
        </div>
        <div class="footer">
            地址：湖北省武汉市洪山区珞喻路1037号　邮政编码：430074　电话：027-88888888　
            <span style="margin-right: 8px">&copy 2016　华中科技大学计算机学院</span>
        </div>
    </div>
    <script type="text/javascript">
        window.onload = function(){
            var obj1 = document.getElementById("p1");
            var obj2 = document.getElementById("p2");
            var obj3 = document.getElementById("p3");
            obj1.onclick = function(){
                window.location.href = "paperinput.jsp";
            }
            obj2.onclick = function(){
                window.location.href = "paperinfoinput.jsp";
            }
            obj3.onclick = function(){
                window.location.href = "mypaper.jsp";
            }
        }
    </script>
</body>
</html>
