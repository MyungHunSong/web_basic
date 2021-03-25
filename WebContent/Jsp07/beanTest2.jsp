<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<style >
		#fromArea{
			margin: auto;
			width: 400px;
			border: 1px solid black;
		}
		
		h1,fieldset {
			text-align: center;
		}
	</style>
</head>
<body>
<section id = "fromArea">
	<h1>propery = "*" 테스트</h1>
	<form action="beanTest4.jsp">
		<fieldset>
			<label for = "stdNo"> 학생번호:</label><input type = "text" name = "stdNo"  id = "stdNo"><br>
			<label for = "stdName"> 학생이름:</label><input type = "text" name = "stdName"  id = "stdName"><br>
			<label for = "kor"> 국어:</label><input type = "text" name = "kor"  id = "kor"><br>
			<label for = "eng"> 영어:</label><input type = "text" name = "eng"  id = "eng"><br>
			<label for = "math"> 수학:</label><input type = "text" name = "math"  id = "math"><br>
			<label for = "total"> 총점:</label><input type = "text" name = "total"  id = "total"><br>
			<label for = "avg"> 평균:</label><input type = "text" name = "avg"  id = "avg"><br>
			<input type = "submit" value = "전송">
		</fieldset>
	</form>
</section>	
</body>
</html>