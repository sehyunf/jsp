<%@page import="com.app.vo.PostVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>게시판</h1>
	<table>
		<tr>
			<th>게시물번호</th>
			<th>제목</th>
			<th>내용</th>
		</tr>
	<%
		List<PostVO> posts = (List<PostVO>)request.getAttribute("posts");
		for(PostVO post : posts) {
	%>		
			<tr>
				<td><%= post.getId() %></td>
				<td><a href="read.post?id=<%= post.getId() %>"><%= post.getPostTitle() %></a>></td>
				<td><%= post.getPostContent() %></td>
			</tr>
	<%		
		}
	%>
	</table>
	<div>
		<a href="write.post">게시물 등록</a>
	</div>
</body>
</html>