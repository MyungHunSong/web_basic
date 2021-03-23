package web_basic;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/NowSevlet")
public class NowSevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 읽기 타입을 먼저 명시 해줘야한다 않하면 다 깨짐 ㅋㅋㅋ
		// 2. 프로젝트 이름을 말하는거다
		
		response.setContentType("text/html; charset = utf-8");
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		Date now = new Date();
		PrintWriter writer = response.getWriter();
		writer.println("<br>");
		writer.println("<html>");
		writer.println("<head>" + 
					   "<title> 서블릭 생성 현재 시간 </title>" + 
					   "</head>" + 
					   "<body>" +
					   "<body>");
		writer.println("서블릭 생성 시간" + now);
		writer.println("</body></html>");
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
