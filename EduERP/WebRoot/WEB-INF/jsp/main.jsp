<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="common/header.jsp" %>
<div class="page-title">
	<div class="title_left">
		<h3>
			<h3>
			欢迎你：${userSession.userName }<strong> | 角色：${userSession.userTypeName }</strong>
			</h3>
		</h3>
		<a href="${pageContext.request.contextPath }/homeWork/homeWork.html">作业情况</a>
		<a href="${pageContext.request.contextPath }/classInfo/classInfo.html">班级信息</a>
	</div>
</div>
<div class="clearfix"></div>        
<%@include file="common/footer.jsp" %>  
     