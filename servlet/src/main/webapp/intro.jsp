<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- 
	<%
		for(int i = 0; i < 10; i++) {
	%>
		<h1>안녕하세요^_^</h1>
	<%
		}
	%>
--%>
 
 	<!-- 
 			이름과 나이를 입력 받아서
 			나이와 만 나이를 서블렛에서 계산 후 화면에 응답해주는 페이지 제작
 			*이름과, 나이는 모두 유효성 검사 필수
 	 -->
 	<form>
 		<input name='name' placeholder="이름을 입력하세요." />
 		<input name='age' placeholder="나이를 입력하세요." />
 		<button>전송</button>
 	</form>
 
 
</body>
<script type="text/javascript">
	const button = document.querySelector("button");
	const name = document.querySelector("input[name='name']");
	const age = document.querySelector("input[name='age']");
	const form = document.querySelector("form");

	button.addEventListener("click", () => {
	    if(!name.value) {
	      alert("이름을 입력하세요.")
	      return;
	    }
	    if(!age.value) {
	      alert("나이를 입력하세요.")
	      return;
	    }
		form.method = "post";
		form.action = "home";
    })
    
</script>


</html>