<%@page import="java.io.InputStreamReader"%>
<%@page import="java.io.IOException"%>
<%@page import="java.io.InputStream"%>
<%@page import="java.io.BufferedReader"%>
<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>appli 테스트</title>
</head>
<body>
	<h2>application 테스트</h2>
	<table border = "1">
		<tr>
			<td>JSP 버전</td>
			<td><%=application.getMajorVersion() %>.<%=application.getMinorVersion() %></td>	
		</tr>
		
		<tr>
			<td>컨테이너 정보</td>
			<td><%=application.getServerInfo() %></td>
		</tr>
		
		<tr>
			<td>웹 애플리케이션의 실제 파일시스템 경로</td>
			<td><%=application.getRealPath("/") %></td>
		</tr>
	</table>
		<hr>
		
			<table border = "1">
			<tr>
				<td>초기 파라미터 이름</td>
				<td>초기 파라미터 값</td>
			</tr>
	<%
		Enumeration e = application.getInitParameterNames();
			while(e.hasMoreElements()){
				String init_paramName = (String)e.nextElement();
	%>
		<tr>
			<td><%=init_paramName %></td>
			<td><%=application.getInitParameter(init_paramName) %></td>
		
		
		
		</tr>
	<%
			}	
	%>
	</table>
	
	<hr>
	
	<h2>application 기본 객체로 사용하여 자원 읽기.</h2>
	<%
			String resourcePath = "/message/notice/notice.txt";
	%>
	자원의 실제 경로 :<%=application.getRealPath(resourcePath) %>
	<br>
	<%
		try(BufferedReader br = new BufferedReader(new InputStreamReader(application.getResourceAsStream(resourcePath)))){
			String str;
			while((str = br.readLine()) != null){
				out.print(str);
			}
		}catch(IOException e1 ){
				e1.getMessage();
			}
		
	%>	
</body>
</html>