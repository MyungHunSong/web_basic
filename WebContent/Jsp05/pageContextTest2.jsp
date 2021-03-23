<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>제어권 자알 받아갑니다~</title>
</head>
<body>
	<%
		HttpServletRequest httpRequest = (HttpServletRequest)pageContext.getRequest();
	%>
		request 의 pageContext.getRequest() 동일여부
	<%= request == httpRequest %>
	
	<%
	pageContext.include("pageContextTest3.jsp");
	%>
	<h2>pageContext의 forward 메소드로 포워딩된 페이지 입니다.</h2>
	
	pageContext.getOut() 메서드를 사용한 데이터 출력.
	<%
		pageContext.getOut().println("편안해 하지마.");
	%>
	
</body>
</html>