<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 등록</title>
</head>
<body>
	<form action="write-ok.student" method="post">
		<h1>학생 등록</h1>
		<div>
			<input type="text" name="studentName" placeholder="이름을 입력하세요">
		</div>
		<div>
			<input type="text" name="math" placeholder="수학점수를 입력하세요">
		</div>
		<div>
			<input type="text" name="eng" placeholder="영어점수를 입력하세요">
		</div>
		<div>
			<input type="text" name="kor" placeholder="국어점수를 입력하세요">
		</div>
		<button>등록</button>
	</form>

</body>
</html>