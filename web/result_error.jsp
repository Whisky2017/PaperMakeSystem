<%--
  Created by IntelliJ IDEA.
  User: 世康
  Date: 2016/11/28
  Time: 15:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*" %>
<%@ page import="com.papermaker.util.Util" %>
<%@ taglib uri="/struts-tags" prefix="s"%>
<style type="text/css">
    .STYLE10 {
        font-size: 14px;
        color: #FF0000;
    }
</style>
<%
//    int type = (Integer)session.getAttribute((Util.SESSION_OPTTYPE);
    out.println("<html><head><meta http-equiv='refresh' content='2;' target=_parent></head><body bgcolor='#FFFFFF'></body></html>");
%>
<br /><br /><br /><br /><br /><br /><br /><br />
<center>
    <table width="300" border="1" bordercolor="#34383C" style="border-collapse: collapse" cellpadding="0" cellspacing="0">
        <tr bgcolor="#34383C">
            <td height="13">&nbsp;</td>
        </tr>
        <tr>
            <td height="60" align="center"><span class="STYLE10">操作失败</span></td>
        </tr>
        <tr>
            <td><font size="2" face="宋体" style="font-size: 9pt" color="red"><s:property value="errorsMap.errorinfo" /></font></td>
        </tr>
    </table>
</center>