<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  	
    <base href="<%=basePath%>">
    
    <title>My JSP 'Chapter.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript" src="${pageContext.request.contextPath }/statics/js/jquery.min.js"></script>
		

  </head>

<body>
	<div>
		<table border="1">
			<tr>
				<td>章节编码</td>
				<td>章节名称</td>
				<td>章节序号</td>
				<th>操作</th>
			</tr>

			<c:forEach var="List" items="${List}">
				<tr>
					<td>${List.chaId}</td>
					<td>${List.chaName}</td>
					<td>${List.chaNumber}</td>
					<td><a href="#">添加</a> <a href="#">修改</a> <a href="#">删除</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>
