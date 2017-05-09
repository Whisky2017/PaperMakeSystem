<%--
  Created by IntelliJ IDEA.
  User: 世康
  Date: 2016/12/7
  Time: 10:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*" %>
<%@ page import="com.papermaker.pojo.Parameter1" %>
<%@ page import="com.papermaker.pojo.Paper" %>
<%@ page import="com.papermaker.pojo.Testpoint" %>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ include file="loginverify.jsp"%>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>试卷素材导入</title>
    <link rel="icon" href="image/icon.gif" type="image/x-icon" />
    <link rel="shortcut icon" href="image/icon.gif" type="image/x-icon" />
    <link rel="bookmark" href="image/icon.gif" type="image/x-icon" />
    <link rel="stylesheet" type="text/css" href="sta/css/bootstrap.min.css">

    <link rel="stylesheet" href="css/paperinfo.css">

    <script type="text/javascript" src="sta/js/jquery-2.1.4.min.js"></script>
    <script type="text/javascript" src="sta/js/bootstrap.min.js"></script>

    <!-- 编辑器源码文件 -->
    <script type="text/javascript"src="ckeditor/ckeditor.js"></script>

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
            <h3 align="center">试题录入<font face="宋体" style="font-size: 12pt;color:red;">（标"*"的为必选项，其他选填）</font></h3>
            <div class="container">
                <div class="row clearfix">
                <div class="col-md-3 column">
                </div>
                <div class="col-md-6 column">
                    <h4 align="left">题目属性</h4>
                    <form method="post" action="paper_add.action" enctype="multipart/form-data">
                        <table class="table">
                            <tr class="warning">
                                <td class="first"><%=Paper.TYPE %>></td>
                                <td>
                                    <select name="select1">
                                        <optgroup label= <%= Parameter1.CHOICE %>>
                                            <option value="1"><%= Parameter1.CHOICE1 %></option>
                                            <option value="2"><%= Parameter1.CHOICE2 %></option>
                                        </optgroup>
                                            <option value="3"><%= Parameter1.COMPLETION %></option>
                                            <option value="4"><%= Parameter1.JUDGMENT %></option>
                                            <option value="5"><%= Parameter1.DRAW %></option>
                                            <option value="6"><%= Parameter1.COMPREHENSION %></option>
                                        <optgroup label=<%= Parameter1.ALGORITHM %>>
                                            <option value="7"><%= Parameter1.ALGORITHM1 %></option>
                                            <option value="8"><%= Parameter1.ALGORITHM2 %></option>
                                            <option value="9"><%= Parameter1.ALGORITHM3 %></option>
                                        </optgroup>

                                    </select>
                                </td>
                            </tr>
                            <tr class="success">
                                <td class="first"><%=Paper.SCORE %>></td>
                                <td><input type="number" min="0" max="20" step="1" value="0" name="score"></td>
                            </tr>
                            <tr class="info">
                                <td class="first"><%=Paper.WEIGHT %>></td>
                                <td><input type="number" min="0" max="5" step="1" value="0" name="weight"></td>
                            </tr>
                            <tr>
                                <td class="first"><h4><%=Paper.POINT %></h4></td>
                                <td></td>
                            </tr>
                            <tr class="info">
                                <td class="first"><%=Paper.POINT_1 %>></td>
                                <td>
                                    <select name="select2">
                                        <optgroup label=<%= Testpoint.T1 %>>
                                            <option value="1_1"><%= Testpoint.T1_1 %></option>
                                            <option value="1_2"><%= Testpoint.T1_2 %></option>
                                        </optgroup>
                                        <optgroup label=<%= Testpoint.T2 %>>
                                            <option value="2_1"><%= Testpoint.T2_1 %></option>
                                            <option value="2_2"><%= Testpoint.T2_2 %></option>
                                            <option value="2_3"><%= Testpoint.T2_3 %></option>
                                            <option value="2_4"><%= Testpoint.T2_4 %></option>
                                            <option value="2_5"><%= Testpoint.T2_5 %></option>
                                        </optgroup>
                                        <optgroup label=<%= Testpoint.T3 %>>
                                            <option value="3_1"><%= Testpoint.T3_1 %></option>
                                            <option value="3_2"><%= Testpoint.T3_2 %></option>
                                            <option value="3_3"><%= Testpoint.T3_3 %></option>
                                            <option value="3_4"><%= Testpoint.T3_4 %></option>
                                            <option value="3_5"><%= Testpoint.T3_5 %></option>
                                            <option value="3_6"><%= Testpoint.T3_6 %></option>
                                            <option value="3_7"><%= Testpoint.T3_7 %></option>
                                        </optgroup>
                                        <optgroup label=<%= Testpoint.T4 %>>
                                            <option value="4_1"><%= Testpoint.T4_1 %></option>
                                            <option value="4_2"><%= Testpoint.T4_2 %></option>
                                        </optgroup>
                                        <optgroup label=<%= Testpoint.T5 %>>
                                            <option value="5_1"><%= Testpoint.T5_1 %></option>
                                            <option value="5_2"><%= Testpoint.T5_2 %></option>
                                            <option value="5_3"><%= Testpoint.T5_3 %></option>
                                            <option value="5_4"><%= Testpoint.T5_4 %></option>
                                            <option value="5_5"><%= Testpoint.T5_5 %></option>
                                        </optgroup>
                                        <optgroup label=<%= Testpoint.T6 %>>
                                            <option value="6_1"><%= Testpoint.T6_1 %></option>
                                            <option value="6_2"><%= Testpoint.T6_2 %></option>
                                            <option value="6_3"><%= Testpoint.T6_3 %></option>
                                            <option value="6_4"><%= Testpoint.T6_4 %></option>
                                            <option value="6_5"><%= Testpoint.T6_5 %></option>
                                            <option value="6_6"><%= Testpoint.T6_6 %></option>
                                            <option value="6_7"><%= Testpoint.T6_7 %></option>
                                        </optgroup>
                                        <optgroup label=<%= Testpoint.T7 %>>
                                            <option value="7_1"><%= Testpoint.T7_1 %></option>
                                            <option value="7_2"><%= Testpoint.T7_2 %></option>
                                            <option value="7_3"><%= Testpoint.T7_3 %></option>
                                            <option value="7_4"><%= Testpoint.T7_4 %></option>
                                            <option value="7_5"><%= Testpoint.T7_5 %></option>
                                        </optgroup>
                                        <optgroup label=<%= Testpoint.T9 %>>
                                            <option value="9_1"><%= Testpoint.T9_1 %></option>
                                            <option value="9_2"><%= Testpoint.T9_2 %></option>
                                            <option value="9_3"><%= Testpoint.T9_3 %></option>
                                            <option value="9_4"><%= Testpoint.T9_4 %></option>
                                            <option value="9_5"><%= Testpoint.T9_5 %></option>
                                            <option value="9_6"><%= Testpoint.T9_6 %></option>
                                            <option value="9_7"><%= Testpoint.T9_7 %></option>
                                        </optgroup>
                                        <optgroup label=<%= Testpoint.T10 %>>
                                            <option value="10_1"><%= Testpoint.T10_1 %></option>
                                            <option value="10_2"><%= Testpoint.T10_2 %></option>
                                            <option value="10_3"><%= Testpoint.T10_3 %></option>
                                            <option value="10_4"><%= Testpoint.T10_4 %></option>
                                            <option value="10_5"><%= Testpoint.T10_5 %></option>
                                        </optgroup>
                                    </select>
                                </td>
                            </tr>
                            <tr class="info">
                                <td class="first"><%=Paper.POINT_2 %>></td>
                                <td>
                                    <select name="select3">
                                        <option value="" selected>无</option>
                                        <optgroup label=<%= Testpoint.T1 %>>
                                            <option value="1_1"><%= Testpoint.T1_1 %></option>
                                            <option value="1_2"><%= Testpoint.T1_2 %></option>
                                        </optgroup>
                                        <optgroup label=<%= Testpoint.T2 %>>
                                            <option value="2_1"><%= Testpoint.T2_1 %></option>
                                            <option value="2_2"><%= Testpoint.T2_2 %></option>
                                            <option value="2_3"><%= Testpoint.T2_3 %></option>
                                            <option value="2_4"><%= Testpoint.T2_4 %></option>
                                            <option value="2_5"><%= Testpoint.T2_5 %></option>
                                        </optgroup>
                                        <optgroup label=<%= Testpoint.T3 %>>
                                            <option value="3_1"><%= Testpoint.T3_1 %></option>
                                            <option value="3_2"><%= Testpoint.T3_2 %></option>
                                            <option value="3_3"><%= Testpoint.T3_3 %></option>
                                            <option value="3_4"><%= Testpoint.T3_4 %></option>
                                            <option value="3_5"><%= Testpoint.T3_5 %></option>
                                            <option value="3_6"><%= Testpoint.T3_6 %></option>
                                            <option value="3_7"><%= Testpoint.T3_7 %></option>
                                        </optgroup>
                                        <optgroup label=<%= Testpoint.T4 %>>
                                            <option value="4_1"><%= Testpoint.T4_1 %></option>
                                            <option value="4_2"><%= Testpoint.T4_2 %></option>
                                        </optgroup>
                                        <optgroup label=<%= Testpoint.T5 %>>
                                            <option value="5_1"><%= Testpoint.T5_1 %></option>
                                            <option value="5_2"><%= Testpoint.T5_2 %></option>
                                            <option value="5_3"><%= Testpoint.T5_3 %></option>
                                            <option value="5_4"><%= Testpoint.T5_4 %></option>
                                            <option value="5_5"><%= Testpoint.T5_5 %></option>
                                        </optgroup>
                                        <optgroup label=<%= Testpoint.T6 %>>
                                            <option value="6_1"><%= Testpoint.T6_1 %></option>
                                            <option value="6_2"><%= Testpoint.T6_2 %></option>
                                            <option value="6_3"><%= Testpoint.T6_3 %></option>
                                            <option value="6_4"><%= Testpoint.T6_4 %></option>
                                            <option value="6_5"><%= Testpoint.T6_5 %></option>
                                            <option value="6_6"><%= Testpoint.T6_6 %></option>
                                            <option value="6_7"><%= Testpoint.T6_7 %></option>
                                        </optgroup>
                                        <optgroup label=<%= Testpoint.T7 %>>
                                            <option value="7_1"><%= Testpoint.T7_1 %></option>
                                            <option value="7_2"><%= Testpoint.T7_2 %></option>
                                            <option value="7_3"><%= Testpoint.T7_3 %></option>
                                            <option value="7_4"><%= Testpoint.T7_4 %></option>
                                            <option value="7_5"><%= Testpoint.T7_5 %></option>
                                        </optgroup>
                                        <optgroup label=<%= Testpoint.T9 %>>
                                            <option value="9_1"><%= Testpoint.T9_1 %></option>
                                            <option value="9_2"><%= Testpoint.T9_2 %></option>
                                            <option value="9_3"><%= Testpoint.T9_3 %></option>
                                            <option value="9_4"><%= Testpoint.T9_4 %></option>
                                            <option value="9_5"><%= Testpoint.T9_5 %></option>
                                            <option value="9_6"><%= Testpoint.T9_6 %></option>
                                            <option value="9_7"><%= Testpoint.T9_7 %></option>
                                        </optgroup>
                                        <optgroup label=<%= Testpoint.T10 %>>
                                            <option value="10_1"><%= Testpoint.T10_1 %></option>
                                            <option value="10_2"><%= Testpoint.T10_2 %></option>
                                            <option value="10_3"><%= Testpoint.T10_3 %></option>
                                            <option value="10_4"><%= Testpoint.T10_4 %></option>
                                            <option value="10_5"><%= Testpoint.T10_5 %></option>
                                        </optgroup>
                                    </select>
                                </td>
                            </tr>
                            <tr class="info">
                                <td class="first"><%=Paper.POINT_3 %>></td>
                                <td>
                                    <select name="select4">
                                        <option value="" selected>无</option>
                                        <optgroup label=<%= Testpoint.T1 %>>
                                            <option value="1_1"><%= Testpoint.T1_1 %></option>
                                            <option value="1_2"><%= Testpoint.T1_2 %></option>
                                        </optgroup>
                                        <optgroup label=<%= Testpoint.T2 %>>
                                            <option value="2_1"><%= Testpoint.T2_1 %></option>
                                            <option value="2_2"><%= Testpoint.T2_2 %></option>
                                            <option value="2_3"><%= Testpoint.T2_3 %></option>
                                            <option value="2_4"><%= Testpoint.T2_4 %></option>
                                            <option value="2_5"><%= Testpoint.T2_5 %></option>
                                        </optgroup>
                                        <optgroup label=<%= Testpoint.T3 %>>
                                            <option value="3_1"><%= Testpoint.T3_1 %></option>
                                            <option value="3_2"><%= Testpoint.T3_2 %></option>
                                            <option value="3_3"><%= Testpoint.T3_3 %></option>
                                            <option value="3_4"><%= Testpoint.T3_4 %></option>
                                            <option value="3_5"><%= Testpoint.T3_5 %></option>
                                            <option value="3_6"><%= Testpoint.T3_6 %></option>
                                            <option value="3_7"><%= Testpoint.T3_7 %></option>
                                        </optgroup>
                                        <optgroup label=<%= Testpoint.T4 %>>
                                            <option value="4_1"><%= Testpoint.T4_1 %></option>
                                            <option value="4_2"><%= Testpoint.T4_2 %></option>
                                        </optgroup>
                                        <optgroup label=<%= Testpoint.T5 %>>
                                            <option value="5_1"><%= Testpoint.T5_1 %></option>
                                            <option value="5_2"><%= Testpoint.T5_2 %></option>
                                            <option value="5_3"><%= Testpoint.T5_3 %></option>
                                            <option value="5_4"><%= Testpoint.T5_4 %></option>
                                            <option value="5_5"><%= Testpoint.T5_5 %></option>
                                        </optgroup>
                                        <optgroup label=<%= Testpoint.T6 %>>
                                            <option value="6_1"><%= Testpoint.T6_1 %></option>
                                            <option value="6_2"><%= Testpoint.T6_2 %></option>
                                            <option value="6_3"><%= Testpoint.T6_3 %></option>
                                            <option value="6_4"><%= Testpoint.T6_4 %></option>
                                            <option value="6_5"><%= Testpoint.T6_5 %></option>
                                            <option value="6_6"><%= Testpoint.T6_6 %></option>
                                            <option value="6_7"><%= Testpoint.T6_7 %></option>
                                        </optgroup>
                                        <optgroup label=<%= Testpoint.T7 %>>
                                            <option value="7_1"><%= Testpoint.T7_1 %></option>
                                            <option value="7_2"><%= Testpoint.T7_2 %></option>
                                            <option value="7_3"><%= Testpoint.T7_3 %></option>
                                            <option value="7_4"><%= Testpoint.T7_4 %></option>
                                            <option value="7_5"><%= Testpoint.T7_5 %></option>
                                        </optgroup>
                                        <optgroup label=<%= Testpoint.T9 %>>
                                            <option value="9_1"><%= Testpoint.T9_1 %></option>
                                            <option value="9_2"><%= Testpoint.T9_2 %></option>
                                            <option value="9_3"><%= Testpoint.T9_3 %></option>
                                            <option value="9_4"><%= Testpoint.T9_4 %></option>
                                            <option value="9_5"><%= Testpoint.T9_5 %></option>
                                            <option value="9_6"><%= Testpoint.T9_6 %></option>
                                            <option value="9_7"><%= Testpoint.T9_7 %></option>
                                        </optgroup>
                                        <optgroup label=<%= Testpoint.T10 %>>
                                            <option value="10_1"><%= Testpoint.T10_1 %></option>
                                            <option value="10_2"><%= Testpoint.T10_2 %></option>
                                            <option value="10_3"><%= Testpoint.T10_3 %></option>
                                            <option value="10_4"><%= Testpoint.T10_4 %></option>
                                            <option value="10_5"><%= Testpoint.T10_5 %></option>
                                        </optgroup>
                                    </select>
                                </td>
                            </tr>
                            <tr>
                                <td class="first"><h4><%=Paper.CONTENT %></h4></td>
                            </tr>
                            <tr>
                                <td class="first" colspan="2">
                                    <textarea id="TextArea1" class="ckeditor" name="content"></textarea>
                                    <script type="text/javascript">
                                        CKEDITOR.replace('TextArea1');
                                    </script>
                                </td>
                            </tr>
                            <tr>
                                <td class="first"><h4><%=Paper.ANSWER %></h4></td>
                            </tr>
                            <tr>
                                <td class="first" colspan="2">
                                    <textarea id="TextArea2" class="ckeditor" name="answer"></textarea>
                                    <script type="text/javascript">
                                        CKEDITOR.replace('TextArea2');
                                    </script>
                                </td>
                            </tr>
                        </table>
                        <div class="row clearfix">
                            <div class="col-md-2 column">
                            </div>
                            <div class="col-md-6 column">
                                <div class="row clearfix">
                                    <div class="col-md-4 column">
                                    </div>
                                    <div class="col-md-4 column">
                                        <input type="submit" class="btn btn-success" value="确认"/>
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
    </div>
</body>
</html>
