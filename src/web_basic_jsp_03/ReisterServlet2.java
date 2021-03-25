package web_basic_jsp_03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/chap04/orderResult")
public class ReisterServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset = utf-8");
			
			//개인 정보
			String uname = request.getParameter("uname");
			String tel = request.getParameter("tel");
			//배송지 정보
			String addr = request.getParameter("addr");
			String tel2 = request.getParameter("tel2");
			String comment = request.getParameter("comment");
			//주문 정보
			String coffee = request.getParameter("coffee");
			
			PrintWriter out = response.getWriter();
			
			out.print("성함 : " + uname + "<br>");
			out.print("연락쳐 : " + tel + "<br>");
			
			out.print("주소 : " + addr + "<br>");
			out.print("전화번호 : " + tel2+ "<br>");
			out.print("시부려라 : " + comment + "<br>");
			
			
			
			
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
