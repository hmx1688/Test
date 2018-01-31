<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
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

<script type="text/javascript" src="statics/js/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		//首页
		$("#firstPage").click(function(){
			//$("tbody").load("/user/page",null);
			$.getJSON("user/page",null,function(data){
				var str="<tr><td>登录名</td><td>姓名</td><td>密码</td><td>电话</td><td>操作</td></tr>";
				var strTr="";
				$.each(data,function(i,da){
					strTr+="<tr>";
					strTr+="<td>"+da.userName+"</td>";
					strTr+="<td>"+da.name+"</td>";
					strTr+="<td>"+da.passWord+"</td>";
					strTr+="<td>"+da.phone+"</td>";
					strTr+="<td><a href=\"user/preUpdate?id="+da.id+"\">修改</a><a href=\"user/delete?id="+da.id+"\">删除</a>";
					strTr+="</td>";
					strTr+="</tr>";
				});
				str+=strTr;
				$("tbody").html("");
				$("tbody").html(str);
			});
		});
		//末页
		//上一页
		//下一页
		
	});
</script>
</head>

<body>
	<a href="user/addUser">添加</a>
	<table border="1px">
		<thead>
			<tr>
				<th colspan="5">用户信息</th>
			</tr>
		</thead>
		<tbody>
			<%-- <tr>
				<td>登录名</td>
				<td>姓名</td>
				<td>密码</td>
				<td>电话</td>
				<td>操作</td>
			</tr>
			<c:forEach items="${userList}" var="user">
				<tr>
					<td>${user.userName}</td>
					<td>${user.name}</td>
					<td>${user.passWord}</td>
					<td>${user.phone}</td>
					<td><a href="user/preUpdate?id=${user.id}">修改</a> <a
						href="user/delete?id=${user.id}">删除</a>
					</td>
				</tr>
			</c:forEach> --%>
		</tbody>
		<tfoot>
			<tr>
				<td colspan="4">
				<a href="javascript:;" id="firstPage">首页</a> 
				<a href="#" id="prevPage">上一页</a> 
				<a href="#" id="nextPage">下一页</a> 
				<a href="#" id="lastPage">末页</a>
				</td>
			</tr>
		</tfoot>
	</table>
</body>
</html>
