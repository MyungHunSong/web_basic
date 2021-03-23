package web_basic_jsp_03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Jsp01/Login")
public class LoginSevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 한글 명시
		response.setContentType("text/html; charset = utf-8");
		// response.setContentType("text/html; charset = utf-8");
		
		String id = request.getParameter("id"); // String id = request.getParameter("id");
		
		String passwd = request.getParameter("passwd"); // String passwd = request.getParameter("passwd");
		System.out.println("id : " + id + " passwd : " + passwd);
		
		PrintWriter out = response.getWriter(); // printWriter out = reponse.getWriter();
		out.printf("아이디 = %s<br> 비밀번호 = %s", id , passwd);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
