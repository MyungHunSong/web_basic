<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%session.setAttribute("name", "Session Test!");
	session.setAttribute("id", "id Value!");
	
	//5분 동안 유지하게 하는거
	session.setMaxInactiveInterval(60*5);
%>

	<script>
		location.href = "sessionTest.jsp";
	</script>