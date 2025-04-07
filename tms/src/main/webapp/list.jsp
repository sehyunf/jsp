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
<title>학생 정보 리스트</title>
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
		<c:forEach var="student" items="${students}">
	        <input data-studentid="${student.id}" class="student-id" type="hidden">
	        <tr>
	           <td><a href="read.student?id=${student.id}"><c:out value="${student.studentName}" /></a></td>
	           <td><c:out value="${student.math}" /></td>
	           <td><c:out value="${student.kor}" /></td>
	           <td><c:out value="${student.eng}" /></td>
	           <td><c:out value="${student.average}" /></td>
	           <td><c:out value="${student.total}" /></td>
	        </tr>
      </c:forEach>
	</table>
</body>
</html>