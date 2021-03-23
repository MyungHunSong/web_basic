package web_basic_jsp_03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/chap04/MyServlet")
public class IdPwServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset = utf-8");
		
		String id = request.getParameter("user_id");
		String pwd = request.getParameter("user_pw");
		String pwd1 = request.getParameter("user_pw1");

		String name = request.getParameter("name");
		String email = request.getParameter("mail");
		String  tel = request.getParameter("phone");
		String url  = request.getParameter("homep");
		
		PrintWriter out = response.getWriter();
		out.printf("아이디 = %s" ,id );
		out.printf("비번 = %s<br>" ,pwd);
		out.printf("비번확인 = %s<br>" ,pwd1);
		out.printf("너의이름은 = %s<br>", name);
		out.printf("느그주소 = %s<br>", email);
		out.printf("전화번호 = %s<br>", tel);
		out.printf("홈페이지 = %s<br>", url);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
