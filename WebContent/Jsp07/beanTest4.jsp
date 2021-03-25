<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <jsp:useBean id = "std" class = "web_basic.jsp_07.Student" scope = "page"/>
 <jsp:setProperty property="*" name="std"/>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>학생 성적 테스트</title>
	
	<style type="text/css">
		#bigman{
			margin: auto;
			width : 200;
			border:1px solid black;
			}
	</style>
</head>
<body>
	<h1>학생 성적.</h1>
	<section id = "bigman">
	<b>학생번호 :</b> <%=std.getStdNo() %><br>
	<b>학생이름 :</b> <%=std.getStdName() %><br>
	<b>국어 :</b> <%=std.getKor()%><br>
	<b>영어:</b> <%=std.getEng() %><br>
	<b>수학:</b> <%=std.getMath() %><br>
	<b>총점:</b> <%=std.getTotal() %><br>
	<b>평균:</b> <%=std.getAvg() %><br>
	</section>
</body>
</html>