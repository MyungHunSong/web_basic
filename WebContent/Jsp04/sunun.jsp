<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%!
 private String str = "선언문";
 
 private String getstr(){
	 str += "테스트 입니다";
	 return str;
 }
 %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>선언문</title>
</head>
<body>
	<h1><%=str %></h1>
	<h2><%=getstr() %></h2>
</body>
</html>