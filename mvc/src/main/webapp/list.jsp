<%@page import="org.apache.ibatis.reflection.SystemMetaObject"%>
<%@page import="java.util.List"%>
<%@page import="com.app.vo.ProductVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 목록 페이지</title>
</head>
<body>
	<table>
		<tr>
			<th>상품번호</th>
			<th>상품명</th>
			<th>상품가격</th>
			<th>상품재고</th>
		</tr>
	<%
		List<ProductVO> products = (List<ProductVO>)(request.getAttribute("products"));
		/* System.out.println(products); */
		for(ProductVO product : products) {
	%>		
			<tr>
				<td><%= product.getId() %></td>
				<td><a href="read.product?id=<%= product.getId() %>"><%= product.getProductName() %></a>></td>
				<td><%= product.getProductPrice() %></td>
				<td><%= product.getProductStock() %></td>
			</tr>
	<%		
		}
	%>
	</table>
	<div>
		<a href="write.product">상품 등록</a>
	</div>
</body>
</html>