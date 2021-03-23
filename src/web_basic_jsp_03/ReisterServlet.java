package web_basic_jsp_03;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/chap04/ReisterServlet")
public class ReisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset = utf-8");
		
		
		String[] gubun = request.getParameterValues("gubun");
		String subject = request.getParameter("subject");
		
		PrintWriter out = response.getWriter();
		

		String a = null;
		for(String g : gubun ) {
			if(g.equals("gy")) {
				a = "문법";
			}else if(g.equals("wr")) {
				a = "작문";
			}else {
				a = "독해";
			}	
			out.printf( a + " 하고싶은거  <br>" );
		}
		
		
		if(subject.equals("eng")) {
			out.print("영어회화");
		}else if(subject.equals("ch")) {
			out.print("중국어회화");
		}else {
			out.print("일어회화");
		}

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
