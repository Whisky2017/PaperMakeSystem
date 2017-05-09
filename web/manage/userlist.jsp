<%--
  Created by IntelliJ IDEA.
  User: 世康
  Date: 2017/1/3
  Time: 9:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.papermaker.pojo.User" %>
<%@ include file="loginverify.jsp"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
    <script type="text/javascript">
        function isdel(){
            if (confirm("确认要删除吗？")){
                return true;
            }
            else{
                return false;
            }
        }

        function changePage(pageId,caseType){
            document.getElementById("pageId").value = pageId;
            document.getElementById("caseType").value = caseType;
            document.form.submit();
        }
    </script>
<body>
    <div style="text-align:left">
        <table style= "border:0px" width="100%" cellspacing="0" cellpadding="0" height="30">
            <tr>
                <td>&nbsp;
                    <img style= "border:0px" src="../image/rt.gif" width="11" height="11">&nbsp;
                    <span style="font-size: 9pt">您的位置: <a href="home.jsp" target="content">首页</a>&nbsp;&gt;&gt;&nbsp;用户一览</span>
                </td>
            </tr>
            <tr>
                <td width="100%" height="1" bgcolor="#000000"></td>
            </tr>
        </table>
    </div>
    <div class="box-content">
        <div class="row toolbar">
            <div class="col-xs-8" style="float: left">
                <span style="font-size: 9pt"><a href="u_toAdd.action">添加用户</a></span>
            </div>
            <div class="col-xs-4" style="float: right">
                <form  action="u_search.action" method="post">
                    <div class="input-group">
                        <a href="u_queryAll.action"  class="btn btn-default" >全部内容</a>
                        <select class="search-type" name="way">
                            <option value="0" selected="selected">用户</option>
                            <option value="1">姓名</option>
                        </select>
                        <input class="search-text" type="text" placeholder="请输入搜索信息" name="key">
                        <input type="submit" class="search-btn" value="搜索">
                    </div>
                </form>
            </div>
        </div>
    </div>
    <br>
    <p>
    <div style="text-align:center">
        <table width="100%" border="1" style="border-collapse: collapse">
            <tr>
                <td width="10%" height="21" bgcolor="#DFEBFF" align="center">
						<span style="font-family: 宋体">
							<font size="2" face="宋体" style="font-size: 9pt"><%=User.FIELD_ID %></font>
						</span>
                </td>
                <td width="10%" bgcolor="#DFEBFF" align="center" height="21">
						<span style="font-family: 宋体">
							<font size="2" face="宋体" style="font-size: 9pt"><%=User.FIELD_USERNAME %></font>
						</span>
                </td>
                <td width="15%" bgcolor="#DFEBFF" align="center" height="21">
						<span style="font-family: 宋体">
							<font size="2" face="宋体" style="font-size: 9pt"><%=User.FIELD_REALNAME %></font>
						</span>
                </td>
                <td width="20%" bgcolor="#DFEBFF" align="center" height="21">
						<span style="font-family: 宋体">
							<font size="2" face="宋体" style="font-size: 9pt"><%=User.FIELD_TEL %></font>
						</span>
                </td>
                <td width="20%" bgcolor="#DFEBFF" align="center" height="21">
						<span style="font-family: 宋体">
							<font size="2" face="宋体" style="font-size: 9pt"><%=User.FIELD_EMAIL %></font>
						</span>
                </td>
                <td width="10%" bgcolor="#DFEBFF" align="center" height="21">
						<span style="font-family: 宋体">
							<font size="2" face="宋体" style="font-size: 9pt"><%=User.FIELD_TYPE %></font>
						</span>
                </td>
                <td width="5%" bgcolor="#DFEBFF" align="center" height="21">
						<span style="font-family: 宋体">
							<font size="2" face="宋体" style="font-size: 9pt"><%=User.FIELD_STATE %></font>
						</span>
                </td>
                <td width="10%" bgcolor="#DFEBFF" align="center" height="21">
						<span style="font-family: 宋体">
							<font size="2" face="宋体" style="font-size: 9pt">操作</font>
						</span>
                </td>
            </tr>
            <s:iterator value="userlist" var="users">
                <tr>
                    <td width="10%" height="21">
                        <div align="center">
                            <font size="2" face="宋体" style="font-size: 9pt"><s:property value="#users.getId()" /></font>
                        </div>
                    </td>
                    <td width="10%" align="center" height="21">
							<span style="font-family: 宋体">
								<font size="2" face="宋体" style="font-size: 9pt"><a href='u_toView.action?id=<s:property value='#users.getId()'/>'><s:property value="#users.getUsername()" /></a></font>
							</span>
                    </td>
                    <td width="15%" align="center" height="21">
							<span style="font-family: 宋体">
								<font size="2" face="宋体" style="font-size: 9pt"><s:property value="#users.getRealname()" /></font>
							</span>
                    </td>
                    <td width="20%" align="center" height="21">
							<span style="font-family: 宋体">
								<font size="2" face="宋体" style="font-size: 9pt"><s:property value="#users.getTel()" /></font>
							</span>
                    </td>
                    <td width="20%" align="center" height="21">
							<span style="font-family: 宋体">
								<font size="2" face="宋体" style="font-size: 9pt"><s:property value="#users.getEmail()" /></font>
							</span>
                    </td>
                    <td width="10%" align="center" height="21">
							<span style="font-family: 宋体">
								<font size="2" face="宋体" style="font-size: 9pt"><s:property value="#users.getType()==0?'普通用户':'管理员'"/></font>
							</span>
                    </td>
                    <td width="5%" align="center" height="21">
							<span style="font-family: 宋体">
								<font size="2" face="宋体" style="font-size: 9pt"><s:property value="#users.getState()==0?'禁用':'启用'"/></font>
							</span>
                    </td>
                    <td width="10%" align="center" height="21">
                        <s:if test="#users.getId()==1">
                            <span style="font-family: 宋体"><font size="2" face="宋体" style="font-size: 9pt">-</font></span>
                        </s:if>
                        <s:else>
								<span style="font-family: 宋体">
									<font size="2" face="宋体" style="font-size: 9pt">
                                        <a href="u_toUpdate.action?id=<s:property value='#users.getId()'/>">修改</a>&nbsp;
                                        <a href="u_delete.action?id=<s:property value='#users.getId()'/>" onclick="return isdel()">删除</a>
                                    </font>
								</span>
                        </s:else>
                    </td>
                </tr>
            </s:iterator>
        </table>
        <div style="text-align:right">
            <s:url id="url_pre" value="u_queryAll"><s:param name="currentPage" value="currentPage-1"></s:param></s:url>
            <s:url id="url_first" value="u_queryAll"><s:param name="currentPage" value="1"></s:param></s:url>
            <s:url id="url_last" value="u_queryAll"><s:param name="currentPage" value="totalPage"></s:param></s:url>
            <s:url id="url_next" value="u_queryAll"><s:param name="currentPage" value="currentPage+1"></s:param></s:url>
            <s:if test="%{(totalPage>1)}">
                <s:a href="%{url_first}" style="font-size: 9pt">首页</s:a>
                <s:if test="currentPage!=1"><s:a href="%{url_pre}" style="font-size: 9pt">上一页</s:a></s:if>
                <s:else></s:else>
                <s:if test="currentPage!=totalPage"><s:a href="%{url_next}" style="font-size: 9pt">下一页</s:a></s:if>
                <s:else></s:else>
                <s:a href="%{url_last}" style="font-size: 9pt">尾页</s:a>
            </s:if>
            <span style="font-size: 9pt">第${currentPage}页,共${totalPage}页,共${totalSize}条</span>
        </div>
    </div>
    <br>
</body>
</html>
