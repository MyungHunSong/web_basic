package web_basic_jsp_03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Jsp01/boardList")
public class BoardListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset = utf-8");
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		
		String page = request.getParameter("page");
		
		PrintWriter out =response.getWriter();
		out.println("page = " + page + "페이지 게시판 목록 출력");
	}

}
