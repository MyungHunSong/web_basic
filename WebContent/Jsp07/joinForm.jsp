<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>회원 가입 폼</title>
</head>
<body>
	<section id = "formArea">
	<h1>회원정보 입력</h1>
	<form action="joinChk.jsp" method = "get">
		<table>
			<tr>
				<td><label for = "id">아이디 : </label></td>
				<td><input type = "text" name = "id" id ="id"></td>
			</tr>
		</table>
	</form>
	
	</section>
</body>
</html>