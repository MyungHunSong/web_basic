<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>로그인</title>
	
	<style type="text/css">
	
	h1{
		text-align: center;
	}
	#loginFromArea{
		text-align: center;
		width:250px;
		margin: auto;
		border: 1px solid red;
	}
	</style>
	
</head>
<body>
	<h1>로그인</h1>
	<section id = "loginFromArea">
		<form action="sessionLogin" method="get">
			<label id = "id"> 아이디 :</label>
			<input type = "text" name = "id">
			<br>
			<label id = "passwd">비밀번호:</label>
			<input type = "text" name = "passwd" id = "passwd">		
			<br><br>
			<input type = "submit" value = "로그인">
		</form>
	</section>
</body>
</html>