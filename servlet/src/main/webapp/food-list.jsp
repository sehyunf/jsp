<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>음식 리스트</title>
</head>
<body>
	<!-- 두 수를 입력받고, 두 수를 더한 결과값이 홀수인지 짝수인지
		서블릿을 통해 응답해주는 페이지 구현
		단, 두 수는 모두 유효성 검사가 필요하다.
	-->
	<form>
		<input name='num1' placeholder="수를 입력하세요." />
	 	<input name='num2' placeholder="수를 입력하세요." />
	 	<button>전송</button>
	</form>
</body>
<script>
	const button = document.querySelector("button");
	const num1 = document.querySelector("input[name='num1']");
	const num2 = document.querySelector("input[name='num2']");
	const form = document.querySelector("form");
	
	button.addEventListener("click", () => {
		if(typeof(num1.value) == Number) {
			if(!num1.value || !num2.value) {
		    	alert("수를 제대로 입력하세요.");
		    	return;
		    }else {
				form.method = "post";
				form.action = "home";
		    }
		}else {
			alert("정수만 입력해 주세요.")
		}
		
	})
	
</script>
</html>