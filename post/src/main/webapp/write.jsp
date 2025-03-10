<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시물 작성 페이지</title>
</head>
<body>
	<form action="write-ok.post" method="post">
		<label>
			<span>제목</span><input type="text" name="postTitle" placeholder="제목">
		</label>
		<div></div>
		<label>
			<span>내용</span><input type="text" name="postContent" placeholder="내용">
		</label>
		<div></div>
		<button type="button">게시물 등록</button>
	</form>
</body>
<script>
	const inputs = document.querySelectorAll("input");
	
	document.querySelector("button").addEventListener("click", () => {
		for(let input of inputs){
			if(!input.value) {
				alert("필수입력항목")
				return;
			}
		}
	})
</script>

</html>