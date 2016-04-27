<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'inputNumber.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script type="text/javascript">
	function test() {
		var a= document.getElementById("num");
		if(a.value=="")
			{
			alert("请输入");
			return false;
			}
	    else if (isNaN(a.value)) {
		alert("输入必须为数字");
		a.focus();
		a.select();
		return false;
		}
	}
	</script> 
  </head>
  
  <body >
  <font color="red">请输入：</font>
  <form action="getNumber.jsp" method="post" name="form" >
  <input type="text" name="num" id="num"/>
  <input type="submit" value="提交"  onclick="return test()"/>
  
  </form>
    <br>
   
  </body>
</html>
