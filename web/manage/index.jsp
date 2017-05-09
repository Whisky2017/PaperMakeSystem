<%--
  Created by IntelliJ IDEA.
  User: 世康
  Date: 2017/1/2
  Time: 10:58
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="loginverify.jsp" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <meta charset="utf-8">
    <title>制卷系统后台管理平台-主页面</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no">
    <link rel="icon" href="../image/icon.gif" type="image/x-icon" />
    <link rel="shortcut icon" href="../image/icon.gif" type="image/x-icon" />
    <link rel="bookmark" href="../image/icon.gif" type="image/x-icon" />
    <link href="../css/bootstrap.min.css" rel="stylesheet">
    <link href="../css/style.css" rel="stylesheet">
    <link href="../css/font-awesome.min.css" rel="stylesheet">
    <script type="text/javascript" src="../js/jquery.min.js"></script>
    <script type="text/javascript" src="../js/bootstrap.min.js"></script>
    <script type="text/javascript" src="../js/script.js"></script>
</head>
<body>
    <header class="navbar">
        <div class="container">
            <a id="main-menu-toggle" class="hidden-xs open"><i class="fa fa-bars"></i></a>
            <a class="navbar-brand" href="home.jsp" target="content"><span>制卷系统管理后台</span></a>
            <div class="header-nav">
                <ul class="nav navbar-nav pull-right">
                    <li class="dropdown">
                        <a class="btn account dropdown-toggle" data-toggle="dropdown" href="index.html#">
                            <i class="fa fa-sort-desc"></i>
                            <span class="hello">欢迎访问!</span>
                            <span class="username"><s:property value="#session.user.getRealname()" />&nbsp;&nbsp;</span>
                        </a>
                        <ul class="dropdown-menu">
                            <li><a href="u_querySelf.action?id=<s:property value='#session.user.getId()' />" target="content"><i class="fa fa-user"></i> 个人设置</a></li>
                            <li><a href="logout.jsp"><i class="fa fa-sign-out"></i> 登出系统</a></li>
                        </ul>
                    </li>
                </ul>
            </div>
        </div>
    </header>
    <div class="container">
        <div class="row">
            <div id="sidebar-left" class="col-lg-2 col-sm-1">
                <div class="sidebar-nav nav-collapse collapse navbar-collapse">
                    <ul class="nav main-menu">
                       <li>
                           <a class="submenu" href="u_queryAll.action" target="content">
                               <i class="fa fa-circle"></i>
                               <span class="hidden-sm text">用户管理</span>
                           </a>
                       </li>
                        <li data-toggle="collapse" data-target="#mini">
                            <a>
                                <i class="fa fa-bars"></i>
                                <span class="hidden-sm text">题库管理</span>
                            </a>
                        </li>
                        <ul id="mini" class="nav main-menu collapse">
                            <li>
                                <a class="btn account submenu" href="x_queryAll.action" target="content">
                                    <i class="fa fa-circle"></i>
                                    <span class="hidden-sm text">选择题管理</span>
                                </a>
                                <a class="btn account submenu" href="t_queryAll.action" target="content">
                                    <i class="fa fa-circle"></i>
                                    <span class="hidden-sm text">填空题管理</span>
                                </a>
                                <a class="btn account submenu" href="p_queryAll.action" target="content">
                                    <i class="fa fa-circle"></i>
                                    <span class="hidden-sm text">判断题管理</span>
                                </a>
                                <a class="btn account submenu" href="h_queryAll.action" target="content">
                                    <i class="fa fa-circle"></i>
                                    <span class="hidden-sm text">画图题管理</span>
                                </a>
                                <a class="btn account submenu" href="z_queryAll.action" target="content">
                                    <i class="fa fa-circle"></i>
                                    <span class="hidden-sm text">综合题管理</span>
                                </a>
                                <a class="btn account submenu" href="s_queryAll.action" target="content">
                                    <i class="fa fa-circle"></i>
                                    <span class="hidden-sm text">算法题管理</span>
                                </a>
                            </li>
                        </ul>
                        <li>
                            <a class="submenu" href="pa_queryAll.action" target="content">
                                <i class="fa fa-circle"></i>
                                <span class="hidden-sm text">试卷管理</span>
                            </a>
                        </li>
                    </ul>
                </div>
            </div>
            <div id="content" class="col-lg-10 col-sm-11">
                <iframe frameborder="0" scrolling="no" name="content" src="home.jsp" style="width: 100%;" onload="this.height=0;var fdh=(this.Document?this.Document.body.scrollHeight:this.contentDocument.body.offsetHeight);this.height=(fdh>800?fdh:800)"></iframe>
            </div>
        </div>
    </div>
</body>
</html>
