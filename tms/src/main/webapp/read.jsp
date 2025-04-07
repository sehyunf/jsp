<%@page import="com.app.dto.StudentDTO"%>
<%@page import="org.apache.ibatis.reflection.SystemMetaObject"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>"${student.studentName}" 학생</title>
</head>
<body>
	<table>
		<tr>
			<th>학생 이름</th>
			<th>수학점수</th>
			<th>영어점수</th>
			<th>국어점수</th>
			<th>평균점수</th>
			<th>총점수</th>
		</tr>
		<tr>
	   		<td><c:out value="${student.studentName}" /></td>
	        <td><c:out value="${student.math}" /></td>
	        <td><c:out value="${student.kor}" /></td>
	        <td><c:out value="${student.eng}" /></td>
	        <td><c:out value="${student.average}" /></td>
	        <td><c:out value="${student.total}" /></td>
	    </tr>
	</table>
	<div>
		<button onclick="location.href='update.student'">수정</button>
		<button onclick="location.href='delete-ok.student'">삭제</button>
	</div>

</body>
</html>