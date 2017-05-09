<%--
  Created by IntelliJ IDEA.
  User: 世康
  Date: 2016/11/22
  Time: 18:48
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<%@ page language="java" import="java.util.*,java.io.*" pageEncoding="UTF-8"%>
<%@ page import="com.papermaker.util.Util" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<script type="text/javascript">
    var user = <%=session.getAttribute(Util.SESSION_USER)%>;
    if (user == null){
        window.open('login.jsp','_top');
    }
</script>