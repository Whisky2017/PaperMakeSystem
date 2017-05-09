<%--
  Created by IntelliJ IDEA.
  User: 世康
  Date: 2016/11/23
  Time: 11:39
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*" %>
<%@ page import="com.papermaker.pojo.Parameter1"%>
<%@ page import="com.papermaker.pojo.Testpoint" %>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ include file="loginverify.jsp"%>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>试卷要求</title>
    <link rel="icon" href="image/icon.gif" type="image/x-icon" />
    <link rel="shortcut icon" href="image/icon.gif" type="image/x-icon" />
    <link rel="bookmark" href="image/icon.gif" type="image/x-icon" />
    <link rel="stylesheet" type="text/css" href="sta/css/bootstrap.min.css">

    <link rel="stylesheet" href="css/paperinfo.css">

    <script type="text/javascript" src="sta/js/jquery-2.1.4.min.js"></script>
    <script type="text/javascript" src="sta/js/bootstrap.min.js"></script>
</head>
<body>
    <div class="container">
        <div class="header">
            <div class="headerb">
                <div class="logo" title="App:app41.dc.hust.edu.cn:app413" onclick="window.location.href='/papermaker/home.jsp'" style="cursor: pointer;"></div>
                <div class="headern">
                    华中科技大学计算机学院制卷系统
                </div>
                <div class="return">
                    <a href="home.jsp"><span>返回</span></a>
                </div>
            </div>
        </div>
        <div class="body">
                <h3 align="center">试卷配置填写<font face="宋体" style="font-size: 12pt;color:red;">（标"*"的为必选项，其他选填）</font></h3>
                <div class="container">
                    <div class="row clearfix">
                        <div class="col-md-3 column">
                        </div>
                        <div class="col-md-6 column">
                            <h4 align="left">试卷样式</h4>
                            <form method="post" action="info_add.action" enctype="multipart/form-data">
                            <table class="table">
                                <thead>
                                <tr>
                                    <th>题型</th>
                                    <th>数量</th>
                                    <th>总分值</th>
                                </tr>
                                </thead>
                                <tbody>
                                <tr class="info">
                                    <td><%=Parameter1.CHOICE1 %>></td>
                                    <td><input type="number" min="0" max="20" step="1" value="5" name="chnum1"></td>
                                    <td><input type="number" min="0" max="20" step="1" value="10" name="chnum21"></td>
                                </tr>
                                <tr class="info">
                                    <td><%=Parameter1.CHOICE2 %>></td>
                                    <td><input type="number" min="0" max="20" step="1" value="5" name="chnum2"></td>
                                    <td><input type="number" min="0" max="20" step="1" value="10" name="chnum22"></td>
                                </tr>
                                <tr class="info">
                                    <td><%=Parameter1.COMPLETION %>></td>
                                    <td><input type="number" min="0" max="20" step="1" value="10" name="conum1"></td>
                                    <td><input type="number" min="0" max="20" step="1" value="20" name="conum2"></td>
                                </tr>
                                <tr class="info">
                                    <td><%=Parameter1.JUDGMENT %>></td>
                                    <td><input type="number" min="0" max="20" step="1" value="0" name="junum1"></td>
                                    <td><input type="number" min="0" max="20" step="1" value="0" name="junum2"></td>
                                </tr>
                                <tr class="info">
                                    <td><%=Parameter1.DRAW %>></td>
                                    <td><input type="number" min="0" max="20" step="1" value="4" name="drnum1"></td>
                                    <td><input type="number" min="0" max="20" step="1" value="20" name="drnum2"></td>
                                </tr>
                                <tr class="info">
                                    <td><%=Parameter1.COMPREHENSION %>></td>
                                    <td><input type="number" min="0" max="20" step="1" value="5" name="comnum1"></td>
                                    <td><input type="number" min="0" max="20" step="1" value="40" name="comnum2"></td>
                                </tr>
                                <tr class="info">
                                    <td><%=Parameter1.ALGORITHM1 %>></td>
                                    <td><input type="number" min="0" max="20" step="1" value="1" name="algnum1"></td>
                                    <td><input type="number" min="0" max="20" step="1" value="10" name="algnum21"></td>
                                </tr>
                                <tr class="info">
                                    <td><%=Parameter1.ALGORITHM2 %>></td>
                                    <td><input type="number" min="0" max="20" step="1" value="1" name="algnum2"></td>
                                    <td><input type="number" min="0" max="20" step="1" value="10" name="algnum22"></td>
                                </tr>
                                <tr class="info">
                                    <td><%=Parameter1.ALGORITHM3 %>></td>
                                    <td><input type="number" min="0" max="20" step="1" value="1" name="algnum3"></td>
                                    <td><input type="number" min="0" max="20" step="1" value="10" name="algnum23"></td>
                                </tr>
                                </tbody>
                            </table>
                            <table class="table" id="pointlist">
                                <h4 align="left">试卷考点</h4>
                                <thead>
                                <tr>
                                    <th class="second">知识点</th>
                                    <th>分值</th>
                                    <th>难度系数</th>
                                </tr>
                                </thead>
                                <tbody>
                                <tr>
                                    <td class="second"><b><%=Testpoint.T1 %></b></td>
                                </tr>
                                <tr class="success">
                                    <td class="second"><%=Testpoint.T1_1 %></td>
                                    <td><input type="number" min="0" max="50" step="1" value="10" name="T1_1"></td>
                                    <td><input type="number" min="1" max="5" step="1" value="4" name="T1_1"></td>
                                </tr>
                                <tr class="success">
                                    <td class="second"><%=Testpoint.T1_2 %></td>
                                    <td><input type="number" min="0" max="50" step="1" value="10" name="T1_2"></td>
                                    <td><input type="number" min="1" max="5" step="1" value="4" name="T1_2"></td>
                                </tr>

                                <tr>
                                    <td class="second"><b><%=Testpoint.T2 %></b></td>
                                </tr>
                                <tr class="success">
                                    <td class="second"><%=Testpoint.T2_1 %></td>
                                    <td><input type="number" min="0" max="50" step="1" value="10" name="T2_1"></td>
                                    <td><input type="number" min="1" max="5" step="1" value="4" name="T2_1"></td>
                                </tr>
                                <tr class="success">
                                    <td class="second"><%=Testpoint.T2_2 %></td>
                                    <td><input type="number" min="0" max="50" step="1" value="10" name="T2_2"></td>
                                    <td><input type="number" min="1" max="5" step="1" value="4" name="T2_2"></td>
                                </tr>
                                <tr class="success">
                                    <td class="second"><%=Testpoint.T2_3 %></td>
                                    <td><input type="number" min="0" max="50" step="1" value="10" name="T2_3"></td>
                                    <td><input type="number" min="1" max="5" step="1" value="4" name="T2_3"></td>
                                </tr>
                                <tr class="success">
                                    <td class="second"><%=Testpoint.T2_4 %></td>
                                    <td><input type="number" min="0" max="50" step="1" value="10" name="T2_4"></td>
                                    <td><input type="number" min="1" max="5" step="1" value="4" name="T2_4"></td>
                                </tr>
                                <tr class="success">
                                    <td class="second"><%=Testpoint.T2_5 %></td>
                                    <td><input type="number" min="0" max="50" step="1" value="10" name="T2_5"></td>
                                    <td><input type="number" min="1" max="5" step="1" value="4" name="T2_5"></td>
                                </tr>

                                <tr>
                                    <td class="second"><b><%=Testpoint.T3 %></b></td>
                                </tr>
                                <tr class="success">
                                    <td class="second"><%=Testpoint.T3_1 %></td>
                                    <td><input type="number" min="0" max="50" step="1" value="10" name="T3_1"></td>
                                    <td><input type="number" min="1" max="5" step="1" value="4" name="T3_1"></td>
                                </tr>
                                <tr class="success">
                                    <td class="second"><%=Testpoint.T3_2 %></td>
                                    <td><input type="number" min="0" max="50" step="1" value="10" name="T3_2"></td>
                                    <td><input type="number" min="1" max="5" step="1" value="4" name="T3_2"></td>
                                </tr>
                                <tr class="success">
                                    <td class="second"><%=Testpoint.T3_3 %></td>
                                    <td><input type="number" min="0" max="50" step="1" value="10" name="T3_3"></td>
                                    <td><input type="number" min="1" max="5" step="1" value="4" name="T3_3"></td>
                                </tr>
                                <tr class="success">
                                    <td class="second"><%=Testpoint.T3_4 %></td>
                                    <td><input type="number" min="0" max="50" step="1" value="10" name="T3_4"></td>
                                    <td><input type="number" min="1" max="5" step="1" value="4" name="T3_4"></td>
                                </tr>
                                <tr class="success">
                                    <td class="second"><%=Testpoint.T3_5 %></td>
                                    <td><input type="number" min="0" max="50" step="1" value="10" name="T3_5"></td>
                                    <td><input type="number" min="1" max="5" step="1" value="4" name="T3_5"></td>
                                </tr>
                                <tr class="success">
                                    <td class="second"><%=Testpoint.T3_6 %></td>
                                    <td><input type="number" min="0" max="50" step="1" value="10" name="T3_6"></td>
                                    <td><input type="number" min="1" max="5" step="1" value="4" name="T3_6"></td>
                                </tr>
                                <tr class="success">
                                    <td class="second"><%=Testpoint.T3_7 %></td>
                                    <td><input type="number" min="0" max="50" step="1" value="10" name="T3_7"></td>
                                    <td><input type="number" min="1" max="5" step="1" value="4" name="T3_7"></td>
                                </tr>

                                <tr>
                                    <td class="second"><b><%=Testpoint.T4 %></b></td>
                                </tr>
                                <tr class="success">
                                    <td class="second"><%=Testpoint.T4_1 %></td>
                                    <td><input type="number" min="0" max="50" step="1" value="10" name="T4_1"></td>
                                    <td><input type="number" min="1" max="5" step="1" value="4" name="T4_1"></td>
                                </tr>
                                <tr class="success">
                                    <td class="second"><%=Testpoint.T4_2 %></td>
                                    <td><input type="number" min="0" max="50" step="1" value="10" name="T4_2"></td>
                                    <td><input type="number" min="1" max="5" step="1" value="4" name="T4_2"></td>
                                </tr>

                                <tr>
                                    <td class="second"><b><%=Testpoint.T5 %></b></td>
                                </tr>
                                <tr class="success">
                                    <td class="second"><%=Testpoint.T5_1 %></td>
                                    <td><input type="number" min="0" max="50" step="1" value="10" name="T5_1"></td>
                                    <td><input type="number" min="1" max="5" step="1" value="4" name="T5_1"></td>
                                </tr>
                                <tr class="success">
                                    <td class="second"><%=Testpoint.T5_2 %></td>
                                    <td><input type="number" min="0" max="50" step="1" value="10" name="T5_2"></td>
                                    <td><input type="number" min="1" max="5" step="1" value="4" name="T5_2"></td>
                                </tr>
                                <tr class="success">
                                    <td class="second"><%=Testpoint.T5_3 %></td>
                                    <td><input type="number" min="0" max="50" step="1" value="10" name="T5_3"></td>
                                    <td><input type="number" min="1" max="5" step="1" value="4" name="T5_3"></td>
                                </tr>
                                <tr class="success">
                                    <td class="second"><%=Testpoint.T5_4 %></td>
                                    <td><input type="number" min="0" max="50" step="1" value="10" name="T5_4"></td>
                                    <td><input type="number" min="1" max="5" step="1" value="4" name="T5_4"></td>
                                </tr>
                                <tr class="success">
                                    <td class="second"><%=Testpoint.T5_5 %></td>
                                    <td><input type="number" min="0" max="50" step="1" value="10" name="T5_5"></td>
                                    <td><input type="number" min="1" max="5" step="1" value="4" name="T5_5"></td>
                                </tr>

                                <tr>
                                    <td class="second"><b><%=Testpoint.T6 %></b></td>
                                </tr>
                                <tr class="success">
                                    <td class="second"><%=Testpoint.T6_1 %></td>
                                    <td><input type="number" min="0" max="50" step="1" value="10" name="T6_1"></td>
                                    <td><input type="number" min="1" max="5" step="1" value="4" name="T6_1"></td>
                                </tr>
                                <tr class="success">
                                    <td class="second"><%=Testpoint.T6_2 %></td>
                                    <td><input type="number" min="0" max="50" step="1" value="10" name="T6_2"></td>
                                    <td><input type="number" min="1" max="5" step="1" value="4" name="T6_2"></td>
                                </tr>
                                <tr class="success">
                                    <td class="second"><%=Testpoint.T6_3 %></td>
                                    <td><input type="number" min="0" max="50" step="1" value="10" name="T6_3"></td>
                                    <td><input type="number" min="1" max="5" step="1" value="4" name="T6_3"></td>
                                </tr>
                                <tr class="success">
                                    <td class="second"><%=Testpoint.T6_4 %></td>
                                    <td><input type="number" min="0" max="50" step="1" value="10" name="T6_4"></td>
                                    <td><input type="number" min="1" max="5" step="1" value="4" name="T6_4"></td>
                                </tr>
                                <tr class="success">
                                    <td class="second"><%=Testpoint.T6_5 %></td>
                                    <td><input type="number" min="0" max="50" step="1" value="10" name="T6_5"></td>
                                    <td><input type="number" min="1" max="5" step="1" value="4" name="T6_5"></td>
                                </tr>
                                <tr class="success">
                                    <td class="second"><%=Testpoint.T6_6 %></td>
                                    <td><input type="number" min="0" max="50" step="1" value="10" name="T6_6"></td>
                                    <td><input type="number" min="1" max="5" step="1" value="4" name="T6_6"></td>
                                </tr>
                                <tr class="success">
                                    <td class="second"><%=Testpoint.T6_7 %></td>
                                    <td><input type="number" min="0" max="50" step="1" value="10" name="T6_7"></td>
                                    <td><input type="number" min="1" max="5" step="1" value="4" name="T6_7"></td>
                                </tr>

                                <tr>
                                    <td class="second"><b><%=Testpoint.T7 %></b></td>
                                </tr>
                                <tr class="success">
                                    <td class="second"><%=Testpoint.T7_1 %></td>
                                    <td><input type="number" min="0" max="50" step="1" value="10" name="T7_1"></td>
                                    <td><input type="number" min="1" max="5" step="1" value="4" name="T7_1"></td>
                                </tr>
                                <tr class="success">
                                    <td class="second"><%=Testpoint.T7_2 %></td>
                                    <td><input type="number" min="0" max="50" step="1" value="10" name="T7_2"></td>
                                    <td><input type="number" min="1" max="5" step="1" value="4" name="T7_2"></td>
                                </tr>
                                <tr class="success">
                                    <td class="second"><%=Testpoint.T7_3 %></td>
                                    <td><input type="number" min="0" max="50" step="1" value="10" name="T7_3"></td>
                                    <td><input type="number" min="1" max="5" step="1" value="4" name="T7_3"></td>
                                </tr>
                                <tr class="success">
                                    <td class="second"><%=Testpoint.T7_4 %></td>
                                    <td><input type="number" min="0" max="50" step="1" value="10" name="T7_4"></td>
                                    <td><input type="number" min="1" max="5" step="1" value="4" name="T7_4"></td>
                                </tr>
                                <tr class="success">
                                    <td class="second"><%=Testpoint.T7_5 %></td>
                                    <td><input type="number" min="0" max="50" step="1" value="10" name="T7_5"></td>
                                    <td><input type="number" min="1" max="5" step="1" value="4" name="T7_5"></td>
                                </tr>

                                <tr>
                                    <td class="second"><b><%=Testpoint.T9 %></b></td>
                                </tr>
                                <tr class="success">
                                    <td class="second"><%=Testpoint.T9_1 %></td>
                                    <td><input type="number" min="0" max="50" step="1" value="10" name="T9_1"></td>
                                    <td><input type="number" min="1" max="5" step="1" value="4" name="T9_1"></td>
                                </tr>
                                <tr class="success">
                                    <td class="second"><%=Testpoint.T9_2 %></td>
                                    <td><input type="number" min="0" max="50" step="1" value="10" name="T9_2"></td>
                                    <td><input type="number" min="1" max="5" step="1" value="4" name="T9_2"></td>
                                </tr>
                                <tr class="success">
                                    <td class="second"><%=Testpoint.T9_3 %></td>
                                    <td><input type="number" min="0" max="50" step="1" value="10" name="T9_3"></td>
                                    <td><input type="number" min="1" max="5" step="1" value="4" name="T9_3"></td>
                                </tr>
                                <tr class="success">
                                    <td class="second"><%=Testpoint.T9_4 %></td>
                                    <td><input type="number" min="0" max="50" step="1" value="10" name="T9_4"></td>
                                    <td><input type="number" min="1" max="5" step="1" value="4" name="T9_4"></td>
                                </tr>
                                <tr class="success">
                                    <td class="second"><%=Testpoint.T9_5 %></td>
                                    <td><input type="number" min="0" max="50" step="1" value="10" name="T9_5"></td>
                                    <td><input type="number" min="1" max="5" step="1" value="4" name="T9_5"></td>
                                </tr>
                                <tr class="success">
                                    <td class="second"><%=Testpoint.T9_6 %></td>
                                    <td><input type="number" min="0" max="50" step="1" value="10" name="T9_6"></td>
                                    <td><input type="number" min="1" max="5" step="1" value="4" name="T9_6"></td>
                                </tr>
                                <tr class="success">
                                    <td class="second"><%=Testpoint.T9_7 %></td>
                                    <td><input type="number" min="0" max="50" step="1" value="10" name="T9_7"></td>
                                    <td><input type="number" min="1" max="5" step="1" value="4" name="T9_7"></td>
                                </tr>

                                <tr>
                                    <td class="second"><b><%=Testpoint.T10 %></b></td>
                                </tr>
                                <tr class="success">
                                    <td class="second"><%=Testpoint.T10_1 %></td>
                                    <td><input type="number" min="0" max="50" step="1" value="10" name="T10_1"></td>
                                    <td><input type="number" min="1" max="5" step="1" value="4" name="T10_1"></td>
                                </tr>
                                <tr class="success">
                                    <td class="second"><%=Testpoint.T10_2 %></td>
                                    <td><input type="number" min="0" max="50" step="1" value="10" name="T10_2"></td>
                                    <td><input type="number" min="1" max="5" step="1" value="4" name="T10_2"></td>
                                </tr>
                                <tr class="success">
                                    <td class="second"><%=Testpoint.T10_3 %></td>
                                    <td><input type="number" min="0" max="50" step="1" value="10" name="T10_3"></td>
                                    <td><input type="number" min="1" max="5" step="1" value="4" name="T10_3"></td>
                                </tr>
                                <tr class="success">
                                    <td class="second"><%=Testpoint.T10_4 %></td>
                                    <td><input type="number" min="0" max="50" step="1" value="10" name="T10_4"></td>
                                    <td><input type="number" min="1" max="5" step="1" value="4" name="T10_4"></td>
                                </tr>
                                <tr class="success">
                                    <td class="second"><%=Testpoint.T10_5 %></td>
                                    <td><input type="number" min="0" max="50" step="1" value="10" name="T10_5"></td>
                                    <td><input type="number" min="1" max="5" step="1" value="4" name="T10_5"></td>
                                </tr>
                                </tbody>
                            </table>

                            <table class="table" id="bigpoint">
                                <h4 align="left">大题考点</h4>
                                <thead>
                                <tr>
                                    <th class>题型</th>
                                    <th>核心考点1</th>
                                    <th>核心考点2</th>
                                    <th>核心考点3</th>
                                </tr>
                                </thead>
                                <tbody>
                                <tr class="warning">
                                    <td><%=Parameter1.DRAW %></td>
                                    <td><input type="text" name="draw_p1"></td>
                                    <td><input type="text" name="draw_p2"></td>
                                    <td><input type="text" name="draw_p3"></td>
                                </tr>
                                <tr class="warning">
                                    <td><%=Parameter1.COMPREHENSION %></td>
                                    <td><input type="text" name="com_p1"></td>
                                    <td><input type="text" name="com_p2"></td>
                                    <td><input type="text" name="com_p3"></td>
                                </tr>
                                <tr class="warning">
                                    <td><%=Parameter1.ALGORITHM %></td>
                                    <td><input type="text" name="alg_p1"></td>
                                    <td><input type="text" name="alg_p2"></td>
                                    <td><input type="text" name="alg_p3"></td>
                                </tr>
                                </tbody>
                            </table>

                                <script type="text/javascript">
                                    function setPoint(){
                                        var pointlist = document.getElementById("pointlist").getElementsByTagName("input");
                                        var pointstr = pointlist[0].name;
                                        pointstr = pointstr + ","+pointlist[0].value;
                                        for (i = 1;i < pointlist.length; i++){
                                            pointstr = pointstr + ","+pointlist[i].name+","+pointlist[i].value;
                                        }
//                                        alert("pointstr="+pointstr);
                                        document.getElementById("pointliststr").value = pointstr;
                                    }
                                </script>
                                
                            <div class="row clearfix">
                                <div class="col-md-2 column">
                                </div>
                                <div class="col-md-6 column">
                                    <div class="row clearfix">
                                        <div class="col-md-4 column">
                                        </div>
                                        <div class="col-md-4 column">
                                            <input type="hidden" name="pointliststr" id="pointliststr"/>
                                            <%--<input type="button" value="test" onclick="setPoint()"/>--%>
                                            <input type="submit" class="btn btn-success" value="确认" onclick="setPoint()"/>
                                        </div>
                                        <div class="col-md-4 column">
                                            <input class="btn btn-cancel" type="button" onclick="javascript:history.go(-1);" value="返回"/>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-md-2 column">
                                </div>
                            </div>
                            </form>
                        </div>
                    </div>
                </div>
        </div>
        <div class="footer">
            地址：湖北省武汉市洪山区珞喻路1037号　邮政编码：430074　电话：027-88888888　
            <span style="margin-right: 8px">&copy 2016　华中科技大学计算机学院</span>
        </div>
    </div>
</body>
</html>
