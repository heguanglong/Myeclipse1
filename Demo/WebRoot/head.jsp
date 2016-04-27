<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>导航栏</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<!-- <meta http-equiv="Content-Type" content="text/html; charset=gb2312"/>
<meta http-equiv="Content-Type" content="text/html; chatset=gb2312"/> -->
  </head>
  
  <body>
    <table cellSpacing="1" cellPadding="1" width="60%" align="center" border="0">
    <tr valign="bottom">
    <td><a href="one.jsp"><font size="3">one.jsp页面</font></a></td>
    <td><a href="two.jsp"><font size="3">two.jsp页面</font></a></td>
    <td><a href="there.jsp"><font size="3">there.jsp页面</font></a></td>
    </tr>
    </table>
  </body>
</html>
