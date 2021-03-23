package web_basic_jsp_03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/loginRoot")//http://localhost:8080/프로젝트/jsp_03/login
public class LoginRootSevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    


protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 한글 명시
		response.setContentType("text/html; charset = utf-8");
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		String id = request.getParameter("id");
		String passwd = request.getParameter("passwd");
		System.out.println("id : " + id + " <br>  " + "passwd" + passwd);
		
		PrintWriter out = response.getWriter();
		out.printf("아이디 = %s<br> 비밀번호 = %s", id , passwd);
	}


	
}
