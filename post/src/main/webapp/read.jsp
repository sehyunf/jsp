<%@page import="com.app.vo.PostVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<%
		PostVO post = (PostVO)request.getAttribute("post");
	%>	
<title>게시물 : <%= post.getPostTitle() %></title>
</head>
<body>
	<h3><%= post.getPostTitle()%></h3>
	<span><%= post.getPostContent()%></span>
	<span> </span>
	<div>
		<a style="font-size: 10px" href="list.post">목록으로 가기</a>
		<a style="font-size: 10px" href="update.post?id=<%= post.getId() %>">게시글 수정</a>
		<a style="font-size: 10px" href="delete.post?id=<%= post.getId() %>">게시글 삭제</a>
	</div>
</body>
</html>