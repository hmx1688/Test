<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<!-- 
	创建 hmx20180125 15:33
	修改 
	-->
  <head>
    <base href="<%=basePath%>">
    
    <title>用户列表</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  	<a href="user/addUser">添加</a>
    <table border="1px">
    	<tr>
    		<td colspan="5">
    			用户信息
    		</td>
    	</tr>
    	<tr>
    		<td>
    			登录名
    		</td>
    		<td>
    			姓名
    		</td>
    		<td>
    			密码
    		</td>
    		<td>
    			电话
    		</td>
    		<td>
    			操作
    		</td>
    	</tr>
    	<c:forEach items="${userList}" var="user">
    		<tr>
    		<td>
    			${user.userName}
    		</td>
    		<td>
    			${user.name}
    		</td>
    		<td>
    			${user.passWord}
    		</td>
    		<td>
    			${user.phone}
    		</td>
    		<td>
    			<a href="user/preUpdate?id=${user.id}">修改</a>
    			<a href="user/delete?id=${user.id}">删除</a>
    		</td>
    	</tr>
    	</c:forEach>
    	<tr>
    		<td colspan="4">
    			<a href="#">首页</a>
    			<a href="#">上一页</a>
    			<a href="#">下一页</a>
    			<a href="#">末页</a>
    		</td>
    	</tr>
    </table>
  </body>
</html>
